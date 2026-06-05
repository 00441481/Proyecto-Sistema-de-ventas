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

public class VentaControlador {

    private ArrayList<Venta> listaVentas;
    private int contadorVenta;

    public VentaControlador() {
        listaVentas = new ArrayList<>();
        contadorVenta = 1;
    }

    public String generarIdVenta() {

        String id = "V" + String.format("%03d", contadorVenta);
        contadorVenta++;

        return id;
    }

    public boolean agregarVenta(Venta ventaNueva) {

        if (ventaNueva == null) {
            return false;
        }

        if (ventaNueva.getListaDetalles().isEmpty()) {
            return false;
        }

        listaVentas.add(ventaNueva);
        return true;
    }

    public Venta buscarPorId(String idVenta) {

        for (Venta v : listaVentas) {

            if (v.getIdVenta().equalsIgnoreCase(idVenta)) {
                return v;
            }
        }

        return null;
    }

    public boolean existeVenta(String idVenta) {

        return buscarPorId(idVenta) != null;
    }

    public double calcularTotalVentas() {

        double total = 0;

        for (Venta v : listaVentas) {

            if (v.getEstado().equalsIgnoreCase("Registrada")) {
                total = total + v.calcularTotal();
            }
        }

        return total;
    }

    public int contarVentasRegistradas() {

        int contador = 0;

        for (Venta v : listaVentas) {

            if (v.getEstado().equalsIgnoreCase("Registrada")) {
                contador++;
            }
        }

        return contador;
    }

    public boolean anularVenta(String idVenta) {

        Venta ventaEncontrada = buscarPorId(idVenta);

        if (ventaEncontrada != null) {
            ventaEncontrada.cancelarVenta();
            return true;
        }

        return false;
    }

    public void listarVentas() {

        for (Venta v : listaVentas) {
            v.verDatos();
        }
    }

    public ArrayList<Venta> getListaVentas() {
        return listaVentas;
    }

    public void setListaVentas(ArrayList<Venta> listaVentas) {
        this.listaVentas = listaVentas;
    }

    public int getContadorVenta() {
        return contadorVenta;
    }

    public void setContadorVenta(int contadorVenta) {
        this.contadorVenta = contadorVenta;
    }
}
