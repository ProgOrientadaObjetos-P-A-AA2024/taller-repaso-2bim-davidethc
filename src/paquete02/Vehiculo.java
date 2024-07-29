package paquete02;

import paquete03.Comprador;

public abstract class Vehiculo {

    protected Comprador propietario;
    protected String marca;
    protected double precioBase;
    protected double precioFinal;

    public Vehiculo(Comprador prop, String mar, double precB, double preF) {
        propietario = prop;
        marca = mar;
        precioBase = precB;
        precioFinal = preF;
    }

    public void establecerPropietario(Comprador prop) {
        propietario = prop;
    }

    public void establecerMarca(String mar) {
        marca = mar;
    }

    public void establecerPrecioBase(double precB) {
        precioBase = precB;
    }

    public abstract void calcularPrecioFinal();

    public Comprador obtenerPropietario() {
        return propietario;
    }

    public String obtenerMarca() {
        return marca;
    }

    public double obtenerPrecioBase() {
        return precioBase;
    }

    public double obtenerPrecioFinal() {
        return precioFinal;
    }
    
    @Override
    public String toString(){
        String cadena = String.format("%s\n"
                + "Marca: %s\n"
                + "Precio base: %.2f\n",
                propietario.toString(),
                obtenerMarca(),
                obtenerPrecioBase());
        return cadena;
    }
}
