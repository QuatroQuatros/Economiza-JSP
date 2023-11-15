package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.sql.Types;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import Helpers.ConnectionManager;
import Models.EconomiaUsuario;


public class EconomiaUsuarioDAOImpl implements EconomiaUsuarioDAO {
    private Connection conn;

    public EconomiaUsuarioDAOImpl() {
        this.conn = ConnectionManager.getInstance().getConnection();
    }

    @Override
    public void inserirEconomiaUsuario(EconomiaUsuario economiaUsuario) {
        String sql = "INSERT INTO economia_usuarios (id_usuario, mes, valor, created_at, updated_at)" +
                "VALUES (?, ?, ?, ?, ?)";
        try (PreparedStatement stmt = conn.prepareStatement(sql)){
            stmt.setInt(1, economiaUsuario.getIdUsuario());
            stmt.setDate(2, new java.sql.Date(economiaUsuario.getMes().getTime()));
            stmt.setDouble(3, economiaUsuario.getValor());
            Date dataAtual = new Date();
            stmt.setTimestamp(4, new Timestamp(dataAtual.getTime()));
            stmt.setNull(5, Types.TIMESTAMP);

            stmt.executeUpdate();
            conn.commit();
            System.out.println("NOVA ECONOMIA USUÁRIO DEFINIDA");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public EconomiaUsuario buscarEconomiaUsuarioPorId(int id) {
        String sql = "SELECT * FROM economia_usuarios WHERE id = ?";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, id);
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    int idEconomiaUsuario = rs.getInt("id");
                    int idUsuario = rs.getInt("id_usuario");
                    Date mes = rs.getDate("mes");
                    double valor = rs.getDouble("valor");
                    Date createdAt = rs.getTimestamp("created_at");
                    Date updatedAt = rs.getTimestamp("updated_at");

                    return new EconomiaUsuario(idEconomiaUsuario, idUsuario, mes, valor, createdAt, updatedAt);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<EconomiaUsuario> listarTodasEconomiasUsuario(){
        List<EconomiaUsuario> economias = new ArrayList<>();
        String sql = "SELECT * FROM economia_usuarios";
        try (PreparedStatement stmt = conn.prepareStatement(sql)){
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                int idEconomiaUsuario = rs.getInt("id");
                int idUsuario = rs.getInt("id_usuario");
                Date mes = rs.getDate("mes");
                double valor = rs.getDouble("valor");
                Date createdAt = rs.getTimestamp("created_at");
                Date updatedAt = rs.getTimestamp("updated_at");

                economias.add(new EconomiaUsuario(idEconomiaUsuario, idUsuario, mes, valor, createdAt, updatedAt));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return economias;
    }

    @Override
    public List<EconomiaUsuario> listarTodasEconomiasPorUsuario(int idUsuario) {
        List<EconomiaUsuario> economias = new ArrayList<>();
        String sql = "SELECT * FROM economia_usuarios WHERE id_usuario = ?";
        try (PreparedStatement stmt = conn.prepareStatement(sql)){
            stmt.setInt(1, idUsuario);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("id");
                Date mes = rs.getDate("mes");
                double valor = rs.getDouble("valor");
                Date createdAt = rs.getTimestamp("created_at");
                Date updatedAt = rs.getTimestamp("updated_at");

                EconomiaUsuario economiaUsuario = new EconomiaUsuario(id, idUsuario, mes, valor, createdAt, updatedAt);
                economias.add(economiaUsuario);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return economias;
    }

    @Override
    public void atualizarEconomiaUsuario(EconomiaUsuario economiaUsuario) {
        String sql = "UPDATE economia_usuarios SET mes = ?, valor = ?, updated_at = ? WHERE id = ?";
        try (PreparedStatement stmt = conn.prepareStatement(sql)){
            stmt.setDate(1, new java.sql.Date(economiaUsuario.getMes().getTime()));
            stmt.setDouble(2, economiaUsuario.getValor());
            Date dataAtual = new Date();
            stmt.setTimestamp(3, new Timestamp(dataAtual.getTime()));
            stmt.setInt(4, economiaUsuario.getId());
            stmt.executeUpdate();
            conn.commit();
            System.out.println("ECONOMIA USUÁRIO ATUALIZADA");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void deletarEconomiaUsuario(int id) {
        String sql = "DELETE FROM economia_usuarios WHERE id = ?";
        try(PreparedStatement stmt = conn.prepareStatement(sql)){
            stmt.setInt(1, id);
            stmt.executeUpdate();
            conn.commit();
            System.out.println("ECONOMIA USUÁRIO EXCLUÍDA");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
