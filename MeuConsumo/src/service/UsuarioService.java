package service;

import model.Usuario;
import java.util.ArrayList;
import java.util.List;

public class UsuarioService {

    private List<Usuario> usuarios = new ArrayList<>();

    public void cadastrarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }

    // FIXED METHOD
    public List<Usuario> listarUsuarios() {
        return usuarios;
    }
}