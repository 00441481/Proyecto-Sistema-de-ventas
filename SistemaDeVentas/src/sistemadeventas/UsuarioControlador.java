package sistemadeventas;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS
 */
import java.util.ArrayList;

public class UsuarioControlador {

    private ArrayList<Usuario> listaUsuarios;

    public UsuarioControlador() {
        listaUsuarios = new ArrayList<>();

        // Usuarios iniciales para probar el login
        listaUsuarios.add(new Usuario("U001", "Administrador del sistema",
                "admin", "1234", "Administrador"));

        listaUsuarios.add(new Usuario("U002", "Cajero principal",
                "cajero", "1234", "Cajero"));
    }

    public boolean agregarUsuario(Usuario usuarioNuevo) {

        if (usuarioNuevo == null) {
            return false;
        }

        if (existeId(usuarioNuevo.getIdUsuario())) {
            return false;
        }

        if (existeUsuario(usuarioNuevo.getUsuario())) {
            return false;
        }

        listaUsuarios.add(usuarioNuevo);
        return true;
    }

    public Usuario login(String usuario, String contrasenia) {

        for (Usuario u : listaUsuarios) {

            if (u.validarAcceso(usuario, contrasenia)) {
                return u;
            }
        }

        return null;
    }

    public Usuario buscarPorId(String idUsuario) {

        for (Usuario u : listaUsuarios) {

            if (u.getIdUsuario().equalsIgnoreCase(idUsuario)) {
                return u;
            }
        }

        return null;
    }

    public Usuario buscarPorUsuario(String nombreUsuario) {

        for (Usuario u : listaUsuarios) {

            if (u.getUsuario().equalsIgnoreCase(nombreUsuario)) {
                return u;
            }
        }

        return null;
    }

    public boolean existeId(String idUsuario) {

        return buscarPorId(idUsuario) != null;
    }

    public boolean existeUsuario(String nombreUsuario) {

        return buscarPorUsuario(nombreUsuario) != null;
    }

    public boolean modificarUsuario(String idUsuario, String nombres,
            String usuario, String contrasenia, String rol) {

        Usuario usuarioEncontrado = buscarPorId(idUsuario);

        if (usuarioEncontrado == null) {
            return false;
        }

        usuarioEncontrado.setNombres(nombres);
        usuarioEncontrado.setUsuario(usuario);
        usuarioEncontrado.setContrasenia(contrasenia);
        usuarioEncontrado.setRol(rol);

        return true;
    }

    public boolean darBajaUsuario(String idUsuario) {

        Usuario usuarioEncontrado = buscarPorId(idUsuario);

        if (usuarioEncontrado != null) {
            usuarioEncontrado.desactivarUsuario();
            return true;
        }

        return false;
    }

    public void listarUsuarios() {

        for (Usuario u : listaUsuarios) {
            u.verDatos();
        }
    }

    public ArrayList<Usuario> getListaUsuarios() {
        return listaUsuarios;
    }

    public void setListaUsuarios(ArrayList<Usuario> listaUsuarios) {
        this.listaUsuarios = listaUsuarios;
    }
}