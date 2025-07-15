package com.example;

public class Main {
    public static void main(String[] args) {

       Estadio estadio1 = new  Estadio();
       Estadio estadio2 = new Estadio();
       estadio1.nombre = "Atanasio Girardot";
       estadio2.ciudad = "Medellin";
       estadio1.capacidad = 45000;
       estadio2.nombre = "El Capin";
       estadio2.ciudad = "Bogota";
       estadio2.capacidad = 36000;
       estadio1.mostrarInformacion();
       estadio2.mostrarInformacion();


    }
}

