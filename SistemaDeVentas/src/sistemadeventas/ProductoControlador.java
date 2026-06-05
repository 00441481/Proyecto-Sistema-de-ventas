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

public class ProductoControlador {

    private ArrayList<Producto> listaProductos;

    public ProductoControlador() {
        listaProductos = new ArrayList<>();
    }

    public boolean agregarProducto(Producto productoNuevo) {

        if (productoNuevo == null) {
            return false;
        }

        if (existeCodigo(productoNuevo.getCodigo())) {
            return false;
        }

        listaProductos.add(productoNuevo);
        return true;
    }

    public Producto buscarPorCodigo(String codigo) {

        for (Producto p : listaProductos) {

            if (p.getCodigo().equalsIgnoreCase(codigo)) {
                return p;
            }
        }

        return null;
    }

    public boolean existeCodigo(String codigo) {

        return buscarPorCodigo(codigo) != null;
    }

    public boolean modificarProducto(String codigo, Producto productoActualizado) {

        for (int i = 0; i < listaProductos.size(); i++) {

            Producto productoActual = listaProductos.get(i);

            if (productoActual.getCodigo().equalsIgnoreCase(codigo)) {
                listaProductos.set(i, productoActualizado);
                return true;
            }
        }

        return false;
    }

    public boolean eliminarProducto(String codigo) {

        Producto productoEncontrado = buscarPorCodigo(codigo);

        if (productoEncontrado != null) {
            listaProductos.remove(productoEncontrado);
            return true;
        }

        return false;
    }

    public ArrayList<ProductoAbarrote> obtenerAbarrotes() {

        ArrayList<ProductoAbarrote> listaAbarrotes = new ArrayList<>();

        for (Producto p : listaProductos) {

            if (p instanceof ProductoAbarrote) {
                listaAbarrotes.add((ProductoAbarrote) p);
            }
        }

        return listaAbarrotes;
    }

    public ArrayList<ProductoLibreria> obtenerProductosLibreria() {

        ArrayList<ProductoLibreria> listaLibreria = new ArrayList<>();

        for (Producto p : listaProductos) {

            if (p instanceof ProductoLibreria) {
                listaLibreria.add((ProductoLibreria) p);
            }
        }

        return listaLibreria;
    }

    public ArrayList<Producto> obtenerStockBajo() {

        ArrayList<Producto> listaStockBajo = new ArrayList<>();

        for (Producto p : listaProductos) {

            if (p.tieneStockBajo()) {
                listaStockBajo.add(p);
            }
        }

        return listaStockBajo;
    }

    public ArrayList<ProductoAbarrote> obtenerProductosVencidos() {

        ArrayList<ProductoAbarrote> listaVencidos = new ArrayList<>();

        for (Producto p : listaProductos) {

            if (p instanceof ProductoAbarrote) {

                ProductoAbarrote abarrote = (ProductoAbarrote) p;

                if (abarrote.estaVencido()) {
                    listaVencidos.add(abarrote);
                }
            }
        }

        return listaVencidos;
    }

    public void listarProductos() {

        for (Producto p : listaProductos) {
            p.verDatos();
        }
    }

    public ArrayList<Producto> getListaProductos() {
        return listaProductos;
    }

    public void setListaProductos(ArrayList<Producto> listaProductos) {
        this.listaProductos = listaProductos;
    }
}
