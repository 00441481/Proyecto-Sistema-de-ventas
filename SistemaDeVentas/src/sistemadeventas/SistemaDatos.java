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

public class SistemaDatos {

    public static Usuario usuarioActivo;

    public static UsuarioControlador usuarioControlador = new UsuarioControlador();
    public static ClienteControlador clienteControlador = new ClienteControlador();
    public static ProductoControlador productoControlador = new ProductoControlador();
    public static VentaControlador ventaControlador = new VentaControlador();

    public static Caja caja = new Caja();
    public static GestorArchivo gestorArchivo = new GestorArchivo();

    public static void cargarDatos() {

        ArrayList<Usuario> usuariosGuardados = gestorArchivo.leerUsuarios();

        if (!usuariosGuardados.isEmpty()) {
            usuarioControlador.setListaUsuarios(usuariosGuardados);
        }

        ArrayList<Cliente> clientesGuardados = gestorArchivo.leerClientes();

        if (!clientesGuardados.isEmpty()) {
            clienteControlador.setListaClientes(clientesGuardados);
        }

        ArrayList<Producto> productosGuardados = gestorArchivo.leerProductos();

        if (!productosGuardados.isEmpty()) {
            productoControlador.setListaProductos(productosGuardados);
        }
    }

    public static void guardarDatos() {

        gestorArchivo.guardarUsuarios(usuarioControlador.getListaUsuarios());

        gestorArchivo.guardarClientes(clienteControlador.getListaClientes());

        gestorArchivo.guardarProductos(productoControlador.getListaProductos());

        gestorArchivo.guardarVentas(ventaControlador.getListaVentas());
    }

    public static void cerrarSesion() {

        usuarioActivo = null;
    }
}
