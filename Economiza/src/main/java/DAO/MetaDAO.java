package DAO;

import java.util.List;

import Models.Meta;

public interface MetaDAO {
	void inserirMeta(Meta meta);
	Meta buscarMetaPorId(int id);
	List<Meta> listarTodasMetas();
	void atualizarMeta(Meta meta);
	void atualizarStatusMeta(Meta meta);
	void deletarMeta(int id);
	void deletarTodasMetasUsuario(int idUsuario);
}
