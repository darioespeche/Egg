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
public class ProgramaNexpresso {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CafeteraServicios CS = new CafeteraServicios();
        //para realizar los servicios.
        Cafetera C1 = new Cafetera();
        //instanciar un nuevo objeto siempre que se desee cargar datos.
        CS.EncenderCafetera(C1);
    }
}
