package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import Helpers.ConnectionManager;
import Models.TipoDespesa;


public class TipoDespesaDAOImpl implements TipoDespesaDAO {
    private Connection conn;

    public TipoDespesaDAOImpl() {
        this.conn = ConnectionManager.getInstance().getConnection();
    }

    @Override
    public void inserirTipoDespesa(TipoDespesa tipoDespesa) {
        String sql = "INSERT INTO tipos_despesas (descricao) VALUES (?)";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, tipoDespesa.getDescricao());
            stmt.executeUpdate();
            conn.commit();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public TipoDespesa buscarTipoDespesaPorId(int id) {
        String sql = "SELECT * FROM tipos_despesas WHERE id = ?";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, id);
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    String descricao = rs.getString("descricao");
                    Timestamp createdAt = rs.getTimestamp("created_at");
                    Timestamp updatedAt = rs.getTimestamp("updated_at");
                    return new TipoDespesa(id, descricao, createdAt, updatedAt);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<TipoDespesa> listarTodosTiposDespesas() {
        List<TipoDespesa> tiposDespesas = new ArrayList<>();
        String sql = "SELECT * FROM tipos_despesas";
        try (PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                int id = rs.getInt("id");
                String descricao = rs.getString("descricao");
                Timestamp createdAt = rs.getTimestamp("created_at");
                Timestamp updatedAt = rs.getTimestamp("updated_at");
                tiposDespesas.add(new TipoDespesa(id, descricao, createdAt, updatedAt));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return tiposDespesas;
    }

    @Override
    public void atualizarTipoDespesa(TipoDespesa tipoDespesa) {
        String sql = "UPDATE tipos_despesas SET descricao = ? WHERE id = ?";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, tipoDespesa.getDescricao());
            stmt.setInt(2, tipoDespesa.getId());
            stmt.executeUpdate();
            conn.commit();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void deletarTipoDespesa(int id) {
        String sql = "DELETE FROM tipos_despesas WHERE id = ?";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, id);
            stmt.executeUpdate();
            conn.commit();
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

