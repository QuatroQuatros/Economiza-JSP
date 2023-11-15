package DAO;

import java.util.List;

import Models.Usuario;

public interface UsuarioDAO {
    boolean inserirUsuario(Usuario usuario);
    Usuario buscarUsuarioPorId(int id);
    Usuario buscarUsuarioPorEmail(String email);
    List<Usuario> listarTodosUsuarios();
    void atualizarUsuario(Usuario usuario);
    void deletarUsuario(int id);
}