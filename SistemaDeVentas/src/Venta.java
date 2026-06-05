/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS
 */
import java.util.ArrayList;

public class Venta {

    private String idVenta;
    private String fecha;
    private Cliente cliente;
    private ArrayList<DetalleVenta> listaDetalles;
    private String estado;
    private String metodoPago;
    private double pagoCliente;
    private double vuelto;

    public Venta(String idVenta, String fecha, Cliente cliente) {

        this.idVenta = idVenta;
        this.fecha = fecha;
        this.cliente = cliente;
        this.listaDetalles = new ArrayList<>();
        this.estado = "Pendiente";
        this.metodoPago = "Efectivo";
        this.pagoCliente = 0;
        this.vuelto = 0;
    }

    public boolean agregarDetalle(Producto producto, int cantidad) {

        if (producto == null || cantidad <= 0) {
            return false;
        }

        DetalleVenta detalleExistente = buscarDetallePorCodigo(producto.getCodigo());

        if (detalleExistente != null) {

            int nuevaCantidad = detalleExistente.getCantidad() + cantidad;

            if (producto.validarStock(nuevaCantidad)) {
                detalleExistente.setCantidad(nuevaCantidad);
                return true;
            } else {
                return false;
            }
        }

        if (producto.validarStock(cantidad)) {
            DetalleVenta detalle = new DetalleVenta(producto, cantidad);
            listaDetalles.add(detalle);
            return true;
        }

        return false;
    }

    public boolean quitarDetalle(String codigoProducto) {

        for (DetalleVenta detalle : listaDetalles) {

            if (detalle.getProducto().getCodigo().equalsIgnoreCase(codigoProducto)) {
                listaDetalles.remove(detalle);
                return true;
            }
        }

        return false;
    }

    public DetalleVenta buscarDetallePorCodigo(String codigoProducto) {

        for (DetalleVenta detalle : listaDetalles) {

            if (detalle.getProducto().getCodigo().equalsIgnoreCase(codigoProducto)) {
                return detalle;
            }
        }

        return null;
    }

    public double calcularTotal() {

        double total = 0;

        for (DetalleVenta detalle : listaDetalles) {
            total = total + detalle.calcularSubtotal();
        }

        return total;
    }

    public boolean procesarPago(double pagoCliente) {

        double total = calcularTotal();

        if (pagoCliente >= total && total > 0) {
            this.pagoCliente = pagoCliente;
            this.vuelto = pagoCliente - total;
            return true;
        }

        return false;
    }

    public boolean confirmarVenta() {

        if (listaDetalles.isEmpty()) {
            return false;
        }

        for (DetalleVenta detalle : listaDetalles) {

            Producto producto = detalle.getProducto();
            int cantidad = detalle.getCantidad();

            if (!producto.validarStock(cantidad)) {
                return false;
            }
        }

        for (DetalleVenta detalle : listaDetalles) {

            Producto producto = detalle.getProducto();
            int cantidad = detalle.getCantidad();

            producto.disminuirStock(cantidad);
        }

        this.estado = "Registrada";
        return true;
    }

    public void cancelarVenta() {

        this.estado = "Cancelada";
    }

    public void verDatos() {

        System.out.println("VENTA N°: " + idVenta);
        System.out.println("FECHA: " + fecha);
        System.out.println("CLIENTE: " + cliente.getNombres());
        System.out.println("ESTADO: " + estado);

        for (DetalleVenta detalle : listaDetalles) {
            detalle.verDatos();
        }

        System.out.println("TOTAL: " + calcularTotal());
        System.out.println("PAGO: " + pagoCliente);
        System.out.println("VUELTO: " + vuelto);
    }

    public String getIdVenta() {
        return idVenta;
    }

    public void setIdVenta(String idVenta) {
        this.idVenta = idVenta;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public ArrayList<DetalleVenta> getListaDetalles() {
        return listaDetalles;
    }

    public void setListaDetalles(ArrayList<DetalleVenta> listaDetalles) {
        this.listaDetalles = listaDetalles;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getMetodoPago() {
        return metodoPago;
    }

    public void setMetodoPago(String metodoPago) {
        this.metodoPago = metodoPago;
    }

    public double getPagoCliente() {
        return pagoCliente;
    }

    public void setPagoCliente(double pagoCliente) {
        this.pagoCliente = pagoCliente;
    }

    public double getVuelto() {
        return vuelto;
    }

    public void setVuelto(double vuelto) {
        this.vuelto = vuelto;
    }
}