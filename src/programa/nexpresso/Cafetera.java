/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programa.nexpresso;

/**
 *
 * @author Dario Espeche
 */
public class Cafetera {
    double capacidadMaxima = 300;
    double cantidadActual;

    public Cafetera() {
    }

    public Cafetera(double capacidadMaxima, double cantidadActual) {
        this.capacidadMaxima = capacidadMaxima;
        this.cantidadActual = cantidadActual;
    }

    public void setCapacidadMaxima(double capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public void setCantidadActual(double cantidadActual) {
        this.cantidadActual = cantidadActual;
    }

    public double getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public double getCantidadActual() {
        return cantidadActual;
    }
    
    
}
