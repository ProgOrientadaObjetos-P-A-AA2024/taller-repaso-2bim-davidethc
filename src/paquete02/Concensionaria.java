package paquete02;


import java.util.ArrayList;

public class Concensionaria {
    private String nombreConcesionaria;
    private ArrayList<Vehiculo> vehiculos;
    private double ventasTotales;
    private Vehiculo vehiculoMasCaro;
    private Vehiculo vehiculoMasBarato;

    public void establecerNombre(String nombre) {
        nombreConcesionaria = nombre;
    }
    
    public void establecerVehiculos(ArrayList<Vehiculo> vehic){
        vehiculos = vehic;
    }

    public void establecerVentasTotales() {
        ventasTotales = 0;
        for (int i = 0; i < vehiculos.size(); i++) {
            ventasTotales += vehiculos.get(i).obtenerPrecioFinal();
        }
    }

    public void establecerVehiculoMasCaro() {
        vehiculoMasCaro = vehiculos.get(0);
        for (int i = 1; i < vehiculos.size(); i++) {
            if (vehiculos.get(i).obtenerPrecioFinal() > vehiculoMasCaro.obtenerPrecioFinal()) {
                vehiculoMasCaro = vehiculos.get(i);
            }
        }
    }

    public void establecerVehiculoMasBarato() {
        vehiculoMasBarato = vehiculos.get(0);
        for (int i = 1; i < vehiculos.size(); i++) {
            if (vehiculos.get(i).obtenerPrecioFinal() < vehiculoMasBarato.obtenerPrecioFinal()) {
                vehiculoMasBarato = vehiculos.get(i);
            }
        }
    }

    public String obtenerNombreConcesionaria() {
        return nombreConcesionaria;
    }

    public ArrayList<Vehiculo> obtenerVehiculos() {
        return vehiculos;
    }

    public double obtenerVentasTotales() {
        return ventasTotales;
    }

    public Vehiculo obtenerVehiculoMasCaro() {
        return vehiculoMasCaro;
    }

    public Vehiculo obtenerVehiculoMasBarato() {
        return vehiculoMasBarato;
    }

    @Override
    public String toString() {
        String cadena = String.format("CONCESIONARIA: %s\n",
                obtenerNombreConcesionaria());
        
        for (int i = 0; i < vehiculos.size(); i++) {
            Vehiculo v = vehiculos.get(i);
            cadena += v + "\n";
        }
        
        cadena = String.format("%s-----------------------------o\n"
                + "Ventas totales: $%.2f\n----------------------o\n"
                + "VEHICULO MAS CARO: \n%s\n--------------------------o\n"
                + "VEHICULO MAS BARATO: \n%s\n",
                cadena,
                obtenerVentasTotales(),
                obtenerVehiculoMasCaro(),
                obtenerVehiculoMasBarato());
        return cadena;
    }
}