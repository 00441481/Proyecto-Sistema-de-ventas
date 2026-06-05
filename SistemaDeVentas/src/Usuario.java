/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS
 */
public class Usuario {

    private String idUsuario;
    private String nombres;
    private String usuario;
    private String contrasenia;
    private String rol;
    private boolean estado;

    public Usuario(String idUsuario, String nombres, String usuario,
            String contrasenia, String rol) {

        this.idUsuario = idUsuario;
        this.nombres = nombres;
        this.usuario = usuario;
        this.contrasenia = contrasenia;
        this.rol = rol;
        this.estado = true;
    }

    public boolean validarAcceso(String usuarioIngresado, String claveIngresada) {

        return this.usuario.equals(usuarioIngresado)
                && this.contrasenia.equals(claveIngresada)
                && this.estado == true;
    }

    public void desactivarUsuario() {

        this.estado = false;
    }

    public void activarUsuario() {

        this.estado = true;
    }

    public boolean esAdministrador() {

        return rol.equalsIgnoreCase("Administrador");
    }

    public boolean esCajero() {

        return rol.equalsIgnoreCase("Cajero");
    }

    public String estadoTexto() {

        if (estado == true) {
            return "Activo";
        } else {
            return "Inactivo";
        }
    }

    public void verDatos() {

        System.out.println(
                "ID: " + idUsuario
                + " NOMBRES: " + nombres
                + " USUARIO: " + usuario
                + " ROL: " + rol
                + " ESTADO: " + estadoTexto());
    }

    public String getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(String idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {

        if (rol.equalsIgnoreCase("Administrador")
                || rol.equalsIgnoreCase("Cajero")) {
            this.rol = rol;
        }
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
}
