/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS
 */
public class ProductoLibreria extends Producto {

    private String tipoArticulo;
    private String marca;
    private String campaniaEscolar;

    public ProductoLibreria(String codigo, String nombre, String categoria,
            double precio, int stock, String tipoArticulo,
            String marca, String campaniaEscolar) {

        super(codigo, nombre, categoria, precio, stock);

        this.tipoArticulo = tipoArticulo;
        this.marca = marca;
        this.campaniaEscolar = campaniaEscolar;
    }

    public boolean esCampaniaEscolar() {
        return campaniaEscolar != null && !campaniaEscolar.trim().isEmpty();
    }

    @Override
    public String getSeccion() {
        return "Librería";
    }

    @Override
    public void verDatos() {

        super.verDatos();

        System.out.println(
                "TIPO ARTICULO: " + tipoArticulo
                + " MARCA: " + marca
                + " CAMPAÑA ESCOLAR: " + campaniaEscolar);
    }

    public String getTipoArticulo() {
        return tipoArticulo;
    }

    public void setTipoArticulo(String tipoArticulo) {
        this.tipoArticulo = tipoArticulo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCampaniaEscolar() {
        return campaniaEscolar;
    }

    public void setCampaniaEscolar(String campaniaEscolar) {
        this.campaniaEscolar = campaniaEscolar;
    }
}
