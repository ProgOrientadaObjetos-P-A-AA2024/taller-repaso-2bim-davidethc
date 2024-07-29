package paquete01;

import paquete02.Concesionaria;
import paquete02.TipoCamioneta;
import paquete02.TipoSedan;
import paquete02.TipoSuv;
import paquete03.Comprador;

import java.util.ArrayList;
import paquete02.Vehiculo;

public class Ejecutor {

    public static void main(String[] args) {

        Comprador comprador1 = new Comprador(
                "Adrian Valverde", 
                "1140039758");
        Comprador comprador2 = new Comprador(
                "Alisson Condoy",
                "1140078635");

        TipoSedan sedan1 = new TipoSedan(
                12,
                250.0,
                comprador1,
                "Toyota",
                22000);
        sedan1.establecerValorDescuento();

        TipoSedan sedan2 = new TipoSedan(
                18,
                300.0,
                comprador2,
                "Nissan",
                24000);
        sedan2.establecerValorDescuento();

        TipoSuv suv = new TipoSuv(
                7,
                600.0,
                comprador1,
                "Jeep",
                28000);
        suv.establecerSeguroPersona();

        TipoCamioneta camioneta = new TipoCamioneta(
                10,
                comprador2,
                "Toyota",
                32000);
        camioneta.establecerValorAdicionalImportacion();

        ArrayList<Vehiculo> listaVehiculos = new ArrayList<>();
        listaVehiculos.add(sedan1);
        listaVehiculos.add(sedan2);
        listaVehiculos.add(suv);
        listaVehiculos.add(camioneta);

        for (int i = 0; i < listaVehiculos.size(); i++) {
            listaVehiculos.get(i).calcularPrecioFinal();
        }
        
        Concesionaria concesionaria = new Concesionaria();
        concesionaria.establecerNombre("Concesionaria Jimenez");
        concesionaria.establecerVehiculos(listaVehiculos);
        concesionaria.establecerVentasTotales();
        concesionaria.establecerVehiculoMasCaro();
        concesionaria.establecerVehiculoMasBarato();

        System.out.println(concesionaria);
    }
}