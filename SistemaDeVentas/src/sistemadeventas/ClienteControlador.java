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

public class ClienteControlador {

    private ArrayList<Cliente> listaClientes;

    public ClienteControlador() {
        listaClientes = new ArrayList<>();
    }

    public boolean agregarCliente(Cliente clienteNuevo) {

        if (clienteNuevo == null) {
            return false;
        }

        if (!clienteNuevo.validarDocumento()) {
            return false;
        }

        if (existeCliente(clienteNuevo.getDocumento())) {
            return false;
        }

        listaClientes.add(clienteNuevo);
        return true;
    }

    public Cliente buscarPorDocumento(String documento) {

        for (Cliente c : listaClientes) {

            if (c.getDocumento().equalsIgnoreCase(documento)) {
                return c;
            }
        }

        return null;
    }

    public Cliente buscarPorId(String idCliente) {

        for (Cliente c : listaClientes) {

            if (c.getIdCliente().equalsIgnoreCase(idCliente)) {
                return c;
            }
        }

        return null;
    }

    public boolean existeCliente(String documento) {

        return buscarPorDocumento(documento) != null;
    }

    public boolean modificarCliente(String idCliente, String documento,
            String nombres, String telefono, String direccion) {

        Cliente clienteEncontrado = buscarPorId(idCliente);

        if (clienteEncontrado == null) {
            return false;
        }

        clienteEncontrado.setDocumento(documento);
        clienteEncontrado.setNombres(nombres);
        clienteEncontrado.setTelefono(telefono);
        clienteEncontrado.setDireccion(direccion);

        return clienteEncontrado.validarDocumento();
    }

    public void listarClientes() {

        for (Cliente c : listaClientes) {
            c.verDatos();
        }
    }

    public ArrayList<Cliente> getListaClientes() {
        return listaClientes;
    }

    public void setListaClientes(ArrayList<Cliente> listaClientes) {
        this.listaClientes = listaClientes;
    }
}
