/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS
 */
public class DetalleVenta {

    private Producto producto;
    private int cantidad;
    private double precioUnitario;

    public DetalleVenta(Producto producto, int cantidad) {

        this.producto = producto;
        this.cantidad = cantidad;
        this.precioUnitario = producto.getPrecio();
    }

    public double calcularSubtotal() {

        return cantidad * precioUnitario;
    }

    public void verDatos() {

        System.out.println(
                "PRODUCTO: " + producto.getNombre()
                + " SECCION: " + producto.getSeccion()
                + " CANTIDAD: " + cantidad
                + " PRECIO: " + precioUnitario
                + " SUBTOTAL: " + calcularSubtotal());
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {

        this.producto = producto;

        if (producto != null) {
            this.precioUnitario = producto.getPrecio();
        }
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {

        if (cantidad > 0) {
            this.cantidad = cantidad;
        }
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(double precioUnitario) {

        if (precioUnitario > 0) {
            this.precioUnitario = precioUnitario;
        }
    }
}
