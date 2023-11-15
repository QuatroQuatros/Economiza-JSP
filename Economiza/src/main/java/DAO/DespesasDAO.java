package DAO;

import java.util.List;
import Models.Despesas;

public interface DespesasDAO {
    void inserirDespesa(Despesas despesa);
    Despesas buscarDespesaPorId(int id);
    List<Despesas> listarTodasDespesas();
    void atualizarDespesa(Despesas despesa);
    void deletarDespesa(int id);
}
