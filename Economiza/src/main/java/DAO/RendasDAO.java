package DAO;

import java.util.List;

import Models.Rendas;

public interface RendasDAO {
    void inserirRendas(Rendas rendas);
    Rendas buscarRendasPorId(int id);
    List<Rendas> listarTodasRendas();
    void atualizarRendas(Rendas rendas);
    void deletarRendas(int id);
}
