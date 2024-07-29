package paquete02;

import paquete03.Comprador;

public class TipoSuv extends Vehiculo{
    private double porcentajeSeguroPers;
    private double seguroPerson;

    public TipoSuv(double porcSeg, double segPers, Comprador prop, String mar,
            double precB, double preF) {
        super(prop, mar, precB, preF);
        porcentajeSeguroPers = porcSeg;
        seguroPerson = segPers;
    }

    public void establecerPorcentajeSeguroPers(double porcSeg) {
        porcentajeSeguroPers = porcSeg;
    }

    public void establecerSeguroPerson() {
        seguroPerson = precioBase * (porcentajeSeguroPers / 100);
    }
    
    @Override
    public void calcularPrecioFinal() {
        precioFinal = precioBase + seguroPerson;   
    }

    public double obtenerPorcentajeSeguroPers() {
        return porcentajeSeguroPers;
    }

    public double obtenerSeguroPerson() {
        return seguroPerson;
    }
    
    @Override
    public String toString(){
        String cadena = String.format("TIPO SUV\n"
                + "%s\n"
                + "Porcentaje adicional del seguro: %.2f%%%\n"
                + "Seguro personas: %.2f\n"
                + "Precio final: %.2f\n", 
                super.toString(),
                obtenerPorcentajeSeguroPers(),
                obtenerSeguroPerson(),
                obtenerPrecioFinal());
        return cadena;
    }
}
