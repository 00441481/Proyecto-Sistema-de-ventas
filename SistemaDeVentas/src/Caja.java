/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS
 */
public class Caja {

    private double montoInicial;
    private double ingresos;
    private double egresos;
    private double ventasEfectivo;
    private boolean cajaAbierta;

    public Caja() {
        this.montoInicial = 0;
        this.ingresos = 0;
        this.egresos = 0;
        this.ventasEfectivo = 0;
        this.cajaAbierta = false;
    }

    public boolean abrirCaja(double montoInicial) {

        if (montoInicial >= 0 && cajaAbierta == false) {
            this.montoInicial = montoInicial;
            this.ingresos = 0;
            this.egresos = 0;
            this.ventasEfectivo = 0;
            this.cajaAbierta = true;
            return true;
        }

        return false;
    }

    public boolean registrarIngreso(double monto) {

        if (cajaAbierta == true && monto > 0) {
            ingresos = ingresos + monto;
            return true;
        }

        return false;
    }

    public boolean registrarEgreso(double monto) {

        if (cajaAbierta == true && monto > 0 && monto <= calcularSaldoActual()) {
            egresos = egresos + monto;
            return true;
        }

        return false;
    }

    public boolean registrarVenta(double montoVenta) {

        if (cajaAbierta == true && montoVenta > 0) {
            ventasEfectivo = ventasEfectivo + montoVenta;
            return true;
        }

        return false;
    }

    public double calcularSaldoActual() {

        return montoInicial + ingresos + ventasEfectivo - egresos;
    }

    public double calcularCierre() {

        return calcularSaldoActual();
    }

    public boolean cerrarCaja() {

        if (cajaAbierta == true) {
            cajaAbierta = false;
            return true;
        }

        return false;
    }

    public void verDatos() {

        System.out.println("MONTO INICIAL: " + montoInicial);
        System.out.println("INGRESOS: " + ingresos);
        System.out.println("EGRESOS: " + egresos);
        System.out.println("VENTAS EFECTIVO: " + ventasEfectivo);
        System.out.println("SALDO ACTUAL: " + calcularSaldoActual());
        System.out.println("CAJA ABIERTA: " + cajaAbierta);
    }

    public double getMontoInicial() {
        return montoInicial;
    }

    public void setMontoInicial(double montoInicial) {

        if (montoInicial >= 0) {
            this.montoInicial = montoInicial;
        }
    }

    public double getIngresos() {
        return ingresos;
    }

    public void setIngresos(double ingresos) {

        if (ingresos >= 0) {
            this.ingresos = ingresos;
        }
    }

    public double getEgresos() {
        return egresos;
    }

    public void setEgresos(double egresos) {

        if (egresos >= 0) {
            this.egresos = egresos;
        }
    }

    public double getVentasEfectivo() {
        return ventasEfectivo;
    }

    public void setVentasEfectivo(double ventasEfectivo) {

        if (ventasEfectivo >= 0) {
            this.ventasEfectivo = ventasEfectivo;
        }
    }

    public boolean isCajaAbierta() {
        return cajaAbierta;
    }

    public void setCajaAbierta(boolean cajaAbierta) {
        this.cajaAbierta = cajaAbierta;
    }
}
