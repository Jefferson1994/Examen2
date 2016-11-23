/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dos;

/**
 *
 * @author SALAS
 */
public class Ejecutor {

    public static void main(String[] args) {

        Garante g1 = new Garante("luis", "jimenez", 1200.0);
        Garante g2 = new Garante("juan", "alava", 1300.25);
        Garante g3 = new Garante("maria", "pardo", 500.25);

        PrestamoAutomovil c1 = new PrestamoAutomovil("camioneta", "masda", g1, "jefferson", 500, 3000, 25, 4, g1);
        PrestamoAutomovil c2 = new PrestamoAutomovil("auto", "chevrolet", g2, "luis", 600, 2000, 30, 5, g1);

        PrestamoEducativo e1 = new PrestamoEducativo("medio", "utpl", g1, g3, "maria", 25, 1260, 10, 3, g1);

        PrestamoEducativo e2 = new PrestamoEducativo("meio", "espe", g2, g3, "robert", 150, 3000, 12, 4, g1);
        PrestamoEducativo e3 = new PrestamoEducativo("maestria", "utpl", g2, g3, "alfredo", 300, 1300, 12, 3, g1);

        PrestamoAutomovil car[] = new PrestamoAutomovil[2];
        PrestamoEducativo edu[] = new PrestamoEducativo[3];

        car[0] = c1;
        car[1] = c2;

        edu[0] = e1;
        edu[1] = e2;
        edu[2] = e3;

        for (PrestamoAutomovil actual : car) {
            System.out.printf("%s y el interes es: %.2f\n\n", actual.toString(), actual.valor_total_interes());
        }
        
        
         for (PrestamoEducativo actual2 : edu) {
            System.out.printf("%s y el interes es: %.2f\n",actual2.toString(), actual2.valor_total_interes());
        }

    }

}
