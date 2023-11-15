package DAO;

import java.util.List;

import Models.Recorrencia;

public interface RecorrenciaDAO {
	
    void inserirRecorrencia(Recorrencia recorrencia);
    Recorrencia buscarRecorrenciaPorId(int id);
    List<Recorrencia> listarTodasRecorrencias();
    void atualizarRecorrencia(Recorrencia recorrencia);
    void deletarRecorrencia(int id);
    
}