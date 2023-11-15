package DAO;

import java.util.List;

import Models.TipoRenda;

public interface TipoRendaDAO {
    void inserirTipoRenda(TipoRenda tipoRenda);

    TipoRenda buscarTipoRendaPorId(int id);

    List<TipoRenda> listarTodosTiposRendas();

    void atualizarTipoRenda(TipoRenda tipoRenda);

    void deletarTipoRenda(int id);
}

