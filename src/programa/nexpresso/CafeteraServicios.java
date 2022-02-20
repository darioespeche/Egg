/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programa.nexpresso;

import java.util.Scanner;

/**
 *
 * @author Dario Espeche
 */
public class CafeteraServicios {

    Scanner leer = new Scanner(System.in);

    public void llenarCafetera(Cafetera X) {
        X.cantidadActual = X.capacidadMaxima;
        System.out.println("En este momento la cafetera esta llena, con: " + X.getCantidadActual() + " ml de cafe.");
    }

    public void servirTaza(Cafetera X) {
        System.out.println("Por favor ingrese el tamaño en ml de su taza");
        double taza = leer.nextDouble();
        if (taza <= X.getCapacidadMaxima()) {
            System.out.println("Su taza se llenó completamente");
        } else {
            System.out.println("Su taza no se llenó completamente.");
        }
    }

    public void vaciarCafetera(Cafetera X) {
        X.cantidadActual = 0;
        System.out.println("Su cafetera está vacía. Dispone de:" + X.getCantidadActual() + " ml de café.");
    }

    public void agregarCafe(Cafetera X) {
        System.out.println("Por favor ingrese la cantidad de cafe que desea agregar.");
        System.out.println("Recuerde que la capacidad máxima es de: " + X.capacidadMaxima + " ml de cafe.");
        System.out.println("La cantidad actual de café es: " + X.cantidadActual + " ml de café.");
        double agregar = leer.nextDouble();
        X.cantidadActual = X.getCantidadActual() + agregar;
        if (X.getCantidadActual() <= X.getCapacidadMaxima()) {
            System.out.println("Su cafetera tiene: " + X.cantidadActual + " ml de café.");
        } else {
            System.out.println("la cantidad que ingresó supera a la capacidad de la cafetera.");
        }
    }

    public void EncenderCafetera(Cafetera X) {
        String letra = "";
        System.out.println("Hola, soy tu cafetera. ¿Qué deseas hacer?");
        do {
            System.out.println("|           MENU:           |");
            System.out.println("|1. LLenar cafetera.        |");
            System.out.println("|2. Servir una taza de cafe.|");
            System.out.println("|3. Vaciar la cafetera.     |");
            System.out.println("|4. Agregar café.           |");
            System.out.println("|5. Salir.                  |");
            System.out.println("|Por favor elija una opción |");
            int opcion = leer.nextInt();
            switch (opcion) {
                case 1:
                    llenarCafetera(X);
                    break;
                case 2:
                    servirTaza(X);
                    break;
                case 3:
                    vaciarCafetera(X);
                    break;
                case 4:
                    agregarCafe(X);
                    break;
                case 5:
                    do {
                        System.out.println("¿Está seguro que desea salir del programa (S/N)?");
                        letra = leer.next();
                        if (!letra.equalsIgnoreCase("s") && !letra.equalsIgnoreCase("n")) {
                            System.out.println("Letra Erronea");
                        }
                    } while (!letra.equalsIgnoreCase("s") && !letra.equalsIgnoreCase("n"));

                    break;
                default:
                    System.out.println("Numero no válido");
                    break;
            }
        } while (!letra.equalsIgnoreCase("s"));
    }
}
