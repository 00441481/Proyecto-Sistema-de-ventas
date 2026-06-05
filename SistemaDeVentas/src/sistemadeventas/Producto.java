package sistemadeventas;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS
 */

public abstract class Producto {

    protected String codigo;
    protected String nombre;
    protected String categoria;
    protected double precio;
    protected int stock;

    public Producto(String codigo, String nombre, String categoria,
            double precio, int stock) {

        this.codigo = codigo;
        this.nombre = nombre;
        this.categoria = categoria;
        this.precio = precio;
        this.stock = stock;
    }

    public boolean validarStock(int cantidad) {
        return cantidad > 0 && cantidad <= stock;
    }

    public void disminuirStock(int cantidad) {
        if (cantidad > 0 && cantidad <= stock) {
            stock = stock - cantidad;
        }
    }

    public void aumentarStock(int cantidad) {
        if (cantidad > 0) {
            stock = stock + cantidad;
        }
    }

    public boolean tieneStockBajo() {
        return stock <= 5;
    }

    public abstract String getSeccion();

    public void verDatos() {
        System.out.println(
                "CODIGO: " + codigo
                + " NOMBRE: " + nombre
                + " CATEGORIA: " + categoria
                + " PRECIO: " + precio
                + " STOCK: " + stock);
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        if (precio > 0) {
            this.precio = precio;
        }
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        if (stock >= 0) {
            this.stock = stock;
        }
    }
}
