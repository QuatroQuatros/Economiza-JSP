package DAO;

import java.util.List;

import Models.TipoDespesa;

public interface TipoDespesaDAO {
    void inserirTipoDespesa(TipoDespesa tipoDespesa);

    TipoDespesa buscarTipoDespesaPorId(int id);

    List<TipoDespesa> listarTodosTiposDespesas();

    void atualizarTipoDespesa(TipoDespesa tipoDespesa);

    void deletarTipoDespesa(int id);
}

