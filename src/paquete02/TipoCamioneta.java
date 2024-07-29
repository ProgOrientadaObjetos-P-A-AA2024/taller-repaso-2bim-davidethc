package paquete02;

import paquete03.Comprador;

public class TipoCamioneta extends Vehiculo {
    private double porcentajeAdicionalImportacion;
    private double valorAdicionalImportacion;
    private double seguroMantenimiento;

    public TipoCamioneta(double porcAdicImp, Comprador prop, String mar,
            double precB, double preF) {
        super(prop, mar, precB, preF);
        porcentajeAdicionalImportacion = porcAdicImp;
    }

    public void establecerPorcentajeAdicionalImportacion(double porcAdicImp) {
        porcentajeAdicionalImportacion = porcAdicImp;
    }

    public void establecerValorAdicionalImportacion() {
        valorAdicionalImportacion = precioBase * (porcentajeAdicionalImportacion / 100);
        seguroMantenimiento = valorAdicionalImportacion * 1.5;
    }

    @Override
    public void calcularPrecioFinal() {
        valorAdicionalImportacion = precioBase * (porcentajeAdicionalImportacion / 100);
        seguroMantenimiento = valorAdicionalImportacion * 1.5;
        precioFinal = precioBase + valorAdicionalImportacion + seguroMantenimiento;
    }

    public double obtenerPorcentajeAdicionalImportacion() {
        return porcentajeAdicionalImportacion;
    }

    public double obtenerValorAdicionalImportacion() {
        return valorAdicionalImportacion;
    }

    public double obtenerSeguroMantenimiento() {
        return seguroMantenimiento;
    }

    @Override
    public String toString() {
        String cadena = String.format("TIPO CAMIONETA\n"
                + "%s\n"
                + "Porcentaje adicional de importación: %.2f%%%\n"
                + "Valor adicional de importación: %.2f\n"
                + "Seguro de mantenimiento: %.2f\n"
                + "Precio final: %.2f\n",
                super.toString(),
                obtenerPorcentajeAdicionalImportacion(),
                obtenerValorAdicionalImportacion(),
                obtenerSeguroMantenimiento(),
                obtenerPrecioFinal());
        return cadena;
    }
}
