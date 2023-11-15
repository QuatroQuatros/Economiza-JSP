package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import Models.Meta;
import br.com.quatroquatros.ConnectionManager;

public class MetaDAOImpl implements MetaDAO {
	private Connection conn;
	
	public MetaDAOImpl() {
		this.conn = ConnectionManager.getInstance().getConnection();
	}
	
	@Override
	public void inserirMeta(Meta meta) {
		String sql = "INSERT INTO metas (id_usuario, descricao, valor, data_conclusao_estimada, data_conclusao, status)" + 
					"VALUES (?, ?, ?, ?, ?, ?)";
		try (PreparedStatement stmt = conn.prepareStatement(sql)){
			stmt.setInt(1, meta.getIdUsuario());
			stmt.setString(2, meta.getDescricao());
			stmt.setDouble(3, meta.getValor());
			stmt.setDate(4, new java.sql.Date(meta.getDataConclusaoEstimada().getTime()));
			stmt.setDate(5, new java.sql.Date(meta.getDataConclusao().getTime()));
			stmt.setInt(6, meta.getStatus());

			stmt.executeUpdate();
			conn.commit();
			System.out.println("NOVA META DEFINIDA");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public Meta buscarMetaPorId(int id) {
		String sql = "SELECT * FROM metas WHERE id = ?";
		try (PreparedStatement stmt = conn.prepareStatement(sql)) {
			stmt.setInt(1, id);
			try (ResultSet rs = stmt.executeQuery()) {
				if (rs.next()) {
					int idMeta = rs.getInt("id");
					int idUsuario = rs.getInt("id_usuario");
					String descricao = rs.getString("descricao");
					double valor = rs.getDouble("valor");
					Date dtConEstimada = rs.getDate("data_conclusao_estimada");
					Date dtConclusao = rs.getDate("data_conclusao");
					int status = rs.getInt("status");
					Date createdAt = rs.getTimestamp("created_at");
                    Date updatedAt = rs.getTimestamp("updated_at");
                    
                    return new Meta(idMeta, idUsuario, descricao, valor, dtConEstimada, dtConclusao, status, createdAt, updatedAt);
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	@Override
	public List<Meta> listarTodasMetas(){
		List<Meta> metas = new ArrayList<>();
		String sql = "SELECT * FROM metas";
		try (PreparedStatement stmt = conn.prepareStatement(sql)){
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				int idMeta = rs.getInt("id");
				int idUsuario = rs.getInt("id_usuario");
				String descricao = rs.getString("descricao");
				double valor = rs.getDouble("valor");
				Date dtConEstimada = rs.getDate("data_conclusao_estimada");
				Date dtConclusao = rs.getDate("data_conclusao");
				int status = rs.getInt("status");
				Date createdAt = rs.getTimestamp("created_at");
                Date updatedAt = rs.getTimestamp("updated_at");
                
                metas.add(new Meta(idMeta, idUsuario, descricao, valor, dtConEstimada, dtConclusao, status, createdAt, updatedAt));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return metas;
	}
	
	@Override
	public void atualizarMeta(Meta meta) {
		String sql = "UPDATE metas SET descricao = ?, valor = ?, data_conclusao = ?, updated_at = ?  WHERE id = ?";
		try (PreparedStatement stmt = conn.prepareStatement(sql)){
			stmt.setString(1, meta.getDescricao());
			stmt.setDouble(2, meta.getValor());
			java.sql.Date sqlDate = new java.sql.Date(meta.getDataConclusao().getTime());
			stmt.setDate(3, sqlDate);
	        java.util.Date dataAtual = new java.util.Date();
	        java.sql.Date sqlDataAtual = new java.sql.Date(dataAtual.getTime());
			stmt.setDate(4, sqlDataAtual);
			stmt.setInt(5, meta.getId());		
			stmt.executeUpdate();
			conn.commit();
			System.out.println("META ATUALIZADA");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public void atualizarStatusMeta(Meta meta) {
		String sql = "UPDATE metas SET status = ? WHERE id = ?";
		try (PreparedStatement stmt = conn.prepareStatement(sql)){
			stmt.setInt(1, meta.getStatus());
			stmt.setInt(2, meta.getId());
			stmt.executeUpdate();
			conn.commit();
			System.out.println("STATUS DE META ALTERADO");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public void deletarMeta(int id) {
		String sql = "DELETE FROM metas WHERE id = ?";
		try(PreparedStatement stmt = conn.prepareStatement(sql)){
			stmt.setInt(1, id);
			stmt.executeUpdate();
			conn.commit();
			System.out.println("META EXCLUIDA");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public void deletarTodasMetasUsuario(int idUsuario) {
		String sql = "DELETE FROM metas WHERE id_usuario = ?";
		try(PreparedStatement stmt = conn.prepareStatement(sql)) {
			stmt.setInt(1, idUsuario);
			stmt.executeUpdate();
			conn.commit();
			System.out.println("TODAS SUAS METAS FORAM EXCLUIDAS");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}