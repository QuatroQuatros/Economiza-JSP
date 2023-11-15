package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import Models.Rendas;
import br.com.quatroquatros.ConnectionManager;

public class RendasDAOImpl implements RendasDAO {
    private Connection connection;

    public RendasDAOImpl() {
        this.connection = ConnectionManager.getInstance().getConnection();
    }

    @Override
    public void inserirRendas(Rendas rendas) {
        String query = "INSERT INTO rendas (id_usuario, id_tipo_renda, id_recorrencia, valor, descricao, data_recebimento) " +
                "VALUES (?, ?, ?, ?, ?, ?)";
        try (PreparedStatement stmt = connection.prepareStatement(query)) {
            stmt.setInt(1, rendas.getId_usuario());
            stmt.setInt(2, rendas.getId_tipo_renda());
            stmt.setInt(3, rendas.getId_recorrencia());
            stmt.setFloat(4, rendas.getValor());
            stmt.setString(5, rendas.getDescricao());
            stmt.setDate(6, rendas.getData_recebimento());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    @Override
    public Rendas buscarRendasPorId(int id) {
        String sql = "SELECT * FROM rendas WHERE id=?";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setInt(1, id);
            try (ResultSet result = stmt.executeQuery()) {
                if (result.next()) {
                    Rendas renda = new Rendas();
                    renda.setId(result.getInt("id"));
                    renda.setId_usuario(result.getInt("id_usuario"));
                    renda.setId_tipo_renda(result.getInt("id_tipo_renda"));
                    renda.setId_recorrencia(result.getInt("id_recorrencia"));
                    renda.setValor(result.getFloat("valor"));
                    renda.setDescricao(result.getString("descricao"));
                    renda.setData_recebimento(result.getDate("data_recebimento"));
                    return renda;
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<Rendas> listarTodasRendas() {
        List<Rendas> rendas = new ArrayList<>();
        String query = "SELECT * FROM rendas";
        try (PreparedStatement stmt = connection.prepareStatement(query);
             ResultSet result = stmt.executeQuery()) {
            while (result.next()) {
                Rendas renda = new Rendas();
                renda.setId(result.getInt("id"));
                renda.setId_usuario(result.getInt("id_usuario"));
                renda.setId_tipo_renda(result.getInt("id_tipo_renda"));
                renda.setId_recorrencia(result.getInt("id_recorrencia"));
                renda.setValor(result.getFloat("valor"));
                renda.setDescricao(result.getString("descricao"));
                renda.setData_recebimento(result.getDate("data_recebimento"));
                rendas.add(renda);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return rendas; // Retorna a lista de objetos Rendas
    }


    @Override
    public void atualizarRendas(Rendas rendas) {
        String query = "UPDATE rendas SET id_usuario=?, id_tipo_renda=?, id_recorrencia=?, valor=?, descricao=?, data_recebimento=? " +
                "WHERE id=?";
        try (PreparedStatement stmt = connection.prepareStatement(query)) {
            stmt.setInt(1, rendas.getId_usuario());
            stmt.setInt(2, rendas.getId_tipo_renda());
            stmt.setInt(3, rendas.getId_recorrencia());
            stmt.setFloat(4, rendas.getValor());
            stmt.setString(5, rendas.getDescricao());
            stmt.setDate(6, rendas.getData_recebimento());
            stmt.setInt(7, rendas.getId());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void deletarRendas(int id) {
        String query = "DELETE FROM rendas WHERE id=?";
        try (PreparedStatement stmt = connection.prepareStatement(query)) {
            stmt.setInt(1, id);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
