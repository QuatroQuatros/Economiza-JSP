package DAO;

import java.util.List;

import Models.EconomiaUsuario;

public interface EconomiaUsuarioDAO {
    void inserirEconomiaUsuario(EconomiaUsuario economiaUsuario);
    EconomiaUsuario buscarEconomiaUsuarioPorId(int id);
    List<EconomiaUsuario> listarTodasEconomiasUsuario();
    List<EconomiaUsuario> listarTodasEconomiasPorUsuario(int idUsuario);
    void atualizarEconomiaUsuario(EconomiaUsuario economiaUsuario);
    void deletarEconomiaUsuario(int id);
}
