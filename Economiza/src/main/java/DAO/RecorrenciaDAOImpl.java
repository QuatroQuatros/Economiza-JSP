package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import Helpers.ConnectionManager;
import Helpers.Helpers;
import Models.Recorrencia;


public class RecorrenciaDAOImpl implements RecorrenciaDAO {
    private Connection conn;

    public RecorrenciaDAOImpl() {
        this.conn = ConnectionManager.getInstance().getConnection();
    }

    @Override
    public void inserirRecorrencia(Recorrencia recorrencia) {
        String sql = "INSERT INTO recorrencias (descricao, juros) VALUES (?, ?)";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, recorrencia.getDescricao());
            stmt.setBigDecimal(2, Helpers.ConversaoDoubleParaOracleNumber(recorrencia.getJuros()));
            stmt.executeUpdate();
            conn.commit();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public Recorrencia buscarRecorrenciaPorId(int id) {
        String sql = "SELECT * FROM recorrencias WHERE id = ?";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, id);
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    String descricao = rs.getString("descricao");
                    double juros = rs.getDouble("juros");
                    Timestamp createdAt = rs.getTimestamp("created_at");
                    Timestamp updatedAt = rs.getTimestamp("updated_at");
                    return new Recorrencia(id, descricao, juros, createdAt, updatedAt);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<Recorrencia> listarTodasRecorrencias() {
        List<Recorrencia> recorrencias = new ArrayList<>();
        String sql = "SELECT * FROM recorrencias";
        try (PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                int id = rs.getInt("id");
                String descricao = rs.getString("descricao");
                double juros = rs.getDouble("juros");
                Timestamp createdAt = rs.getTimestamp("created_at");
                Timestamp updatedAt = rs.getTimestamp("updated_at");
                recorrencias.add(new Recorrencia(id, descricao, juros, createdAt, updatedAt));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return recorrencias;
    }

    @Override
    public void atualizarRecorrencia(Recorrencia recorrencia) {
        String sql = "UPDATE recorrencias SET descricao = ?, juros = ? WHERE id = ?";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, recorrencia.getDescricao());
            stmt.setDouble(2, recorrencia.getJuros());
            stmt.setInt(3, recorrencia.getId());
            stmt.executeUpdate();
            conn.commit();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void deletarRecorrencia(int id) {
        String sql = "DELETE FROM recorrencias WHERE id = ?";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, id);
            stmt.executeUpdate();
            conn.commit();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}