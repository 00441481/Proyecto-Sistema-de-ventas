package sistemadeventas;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS
 */
public class Cliente {

    private String idCliente;
    private String documento;
    private String nombres;
    private String telefono;
    private String direccion;

    public Cliente(String idCliente, String documento, String nombres,
            String telefono, String direccion) {

        this.idCliente = idCliente;
        this.documento = documento;
        this.nombres = nombres;
        this.telefono = telefono;
        this.direccion = direccion;
    }

    public boolean validarDocumento() {

        if (documento == null) {
            return false;
        }

        return documento.matches("[0-9]{8}") || documento.matches("[0-9]{11}");
    }

    public boolean esDni() {

        return documento != null && documento.matches("[0-9]{8}");
    }

    public boolean esRuc() {

        return documento != null && documento.matches("[0-9]{11}");
    }

    public void actualizarDatos(String nombres, String telefono, String direccion) {

        this.nombres = nombres;
        this.telefono = telefono;
        this.direccion = direccion;
    }

    public void verDatos() {

        System.out.println(
                "ID CLIENTE: " + idCliente
                + " DOCUMENTO: " + documento
                + " NOMBRES: " + nombres
                + " TELEFONO: " + telefono
                + " DIRECCION: " + direccion);
    }

    public String getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(String idCliente) {
        this.idCliente = idCliente;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {

        if (documento != null) {
            this.documento = documento;
        }
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
}
