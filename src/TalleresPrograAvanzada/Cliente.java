package Unidad1.EjercicioTaller;

public class Cliente {

    private String cuenta;
    private String nombreCompleto;
    private String rut;
    private String email;
    private double descuento;
    private double venta;


    public Cliente(String cuenta, String nombreCompleto, String rut, String email, double descuento,double venta) {
        this.cuenta = cuenta;
        this.nombreCompleto = nombreCompleto;
        this.rut = rut;
        this.email = email;
        this.descuento = descuento;
        this.venta=venta;
    }

    //----------------------------------------------------------------------------------------------------------------------------

    public String getCuenta() {
        return cuenta;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public String getRut() {
        return rut;
    }

    public String getEmail() {
        return email;
    }

    public double getDescuento() {
        return descuento;
    }

    public double getVenta() {
        return venta;
    }

    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    public void setVenta(double venta) {
        this.venta = venta;
    }
}
