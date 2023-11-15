package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import Helpers.ConnectionManager;
import Models.TipoRenda;


public class TipoRendaDAOImpl implements TipoRendaDAO {
    private Connection conn;

    public TipoRendaDAOImpl() {
        this.conn = ConnectionManager.getInstance().getConnection();
    }

    @Override
    public void inserirTipoRenda(TipoRenda tipoRenda) {
        String sql = "INSERT INTO tipos_rendas (descricao) VALUES (?)";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, tipoRenda.getDescricao());
            stmt.executeUpdate();
            conn.commit();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public TipoRenda buscarTipoRendaPorId(int id) {
        String sql = "SELECT * FROM tipos_rendas WHERE id = ?";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, id);
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    String descricao = rs.getString("descricao");
                    Timestamp createdAt = rs.getTimestamp("created_at");
                    Timestamp updatedAt = rs.getTimestamp("updated_at");
                    return new TipoRenda(id, descricao, createdAt, updatedAt);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<TipoRenda> listarTodosTiposRendas() {
        List<TipoRenda> tiposRendas = new ArrayList<>();
        String sql = "SELECT * FROM tipos_rendas";
        try (PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                int id = rs.getInt("id");
                String descricao = rs.getString("descricao");
                Timestamp createdAt = rs.getTimestamp("created_at");
                Timestamp updatedAt = rs.getTimestamp("updated_at");
                tiposRendas.add(new TipoRenda(id, descricao, createdAt, updatedAt));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return tiposRendas;
    }

    @Override
    public void atualizarTipoRenda(TipoRenda tipoRenda) {
        String sql = "UPDATE tipos_rendas SET descricao = ? WHERE id = ?";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, tipoRenda.getDescricao());
            stmt.setInt(2, tipoRenda.getId());
            stmt.executeUpdate();
            conn.commit();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void deletarTipoRenda(int id) {
        String sql = "DELETE FROM tipos_rendas WHERE id = ?";
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

