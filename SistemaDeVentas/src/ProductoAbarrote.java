/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS
 */
import java.time.LocalDate;
import java.time.format.DateTimeParseException;

public class ProductoAbarrote extends Producto {

    private String fechaVencimiento;
    private String marca;
    private String unidadMedida;

    public ProductoAbarrote(String codigo, String nombre, String categoria,
            double precio, int stock, String fechaVencimiento,
            String marca, String unidadMedida) {

        super(codigo, nombre, categoria, precio, stock);

        this.fechaVencimiento = fechaVencimiento;
        this.marca = marca;
        this.unidadMedida = unidadMedida;
    }

    public boolean fechaVacia() {
        return fechaVencimiento == null || fechaVencimiento.trim().isEmpty();
    }

    public boolean estaVencido() {

        if (fechaVacia()) {
            return false;
        }

        try {
            LocalDate fecha = LocalDate.parse(fechaVencimiento);
            return fecha.isBefore(LocalDate.now()) || fecha.isEqual(LocalDate.now());
        } catch (DateTimeParseException e) {
            return false;
        }
    }

    @Override
    public String getSeccion() {
        return "Minimarket";
    }

    @Override
    public void verDatos() {

        super.verDatos();

        System.out.println(
                "FECHA VENCIMIENTO: " + fechaVencimiento
                + " MARCA: " + marca
                + " UNIDAD: " + unidadMedida);
    }

    public String getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(String fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {

        this.marca = marca;
    }

    public String getUnidadMedida() {
        return unidadMedida;
    }

    public void setUnidadMedida(String unidadMedida) {

        this.unidadMedida = unidadMedida;
    }
}