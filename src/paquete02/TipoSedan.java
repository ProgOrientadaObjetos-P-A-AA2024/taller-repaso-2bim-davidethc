package paquete02;

import paquete03.Comprador;

public class TipoSedan extends Vehiculo {
    private double porcentajeDescuento;
    private double valorDescuento;
    private double seguroMecanico;

    public TipoSedan(double porcDesc, double segMec, Comprador prop, String mar,
            double precB, double preF) {
        super(prop, mar, precB, preF);
        porcentajeDescuento = porcDesc;
        seguroMecanico = segMec;
    }

    public void establecerPorcentajeDescuento(double porcDesc) {
        porcentajeDescuento = porcDesc;
    }

    public void establecerValorDescuento() {
        valorDescuento = precioBase * (porcentajeDescuento / 100);
    }

    @Override
    public void calcularPrecioFinal() {
        valorDescuento = precioBase * (porcentajeDescuento / 100);
        precioFinal = precioBase - valorDescuento + seguroMecanico;
    }

    public double obtenerPorcentajeDescuento() {
        return porcentajeDescuento;
    }

    public double obtenerValorDescuento() {
        return valorDescuento;
    }

    public double obtenerSeguroMecanico() {
        return seguroMecanico;
    }

    @Override
    public String toString() {
        String cadena = String.format("TIPO SEDAN\n"
                + "%s\n"
                + "Porcentaje de descuento: %.2f%%%\n"
                + "Valor descuento: %.2f\n"
                + "Seguro mecánico: %.2f\n"
                + "Precio final: %.2f\n",
                super.toString(),
                obtenerPorcentajeDescuento(),
                obtenerValorDescuento(),
                obtenerSeguroMecanico(),
                obtenerPrecioFinal());
        return cadena;
    }
}
