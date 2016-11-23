/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Uno;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Jefferson Sarango
 */
public class Ejecutor {
    //ArrayList<profe> listaprofe = new ArrayList<profe>();

    public static void main(String[] args) {
        int opc = 0;
        boolean b = true;
        ArrayList<Alumno> lista = new ArrayList<Alumno>();
        Scanner explorador = new Scanner(System.in);

        do {
            System.out.println("1.ingresar alumnos y profesor\n2.ver lista alumnos\n0.salir");
            opc = explorador.nextInt();
            if (opc == 1) {
                explorador.nextLine();
                System.out.println("1.ingresar nombre alumno");
                String nombre = explorador.nextLine();
                System.out.println("1.ingresar el apeliido");
                String apellido = explorador.nextLine();
                System.out.println("1.ingresar nombre docente");
                String nombreD = explorador.nextLine();
                System.out.println("1.ingresar nombre apellido docente");
                String apellidoD = explorador.nextLine();
                System.out.println("1.ingresar titulo");
                String tituloD = explorador.nextLine();
                System.out.println("1.ingresar nombre docente");
                String nombreD2 = explorador.nextLine();
                System.out.println("1.ingresar nombre apellido docente");
                String apellidoD2 = explorador.nextLine();
                System.out.println("1.ingresar titulo");
                String tituloD2 = explorador.nextLine();

                Docente a = new Docente(nombreD, apellidoD, tituloD);
                Docente a2 = new Docente(nombreD2, apellidoD2, tituloD2);

                Alumno e = new Alumno(nombre, apellido, a, a2);

                lista.add(e);
                b = false;
                System.out.println("1.desea ingresar otro alumno y profesor\n2.ver lista\n0.salir");
                opc = explorador.nextInt();
            }
            if (opc == 2) {

                    for (Alumno actual : lista) {
                        System.out.printf("%s\n", actual.toString());

                    }
                }

    }while (opc != 0);

    }
}
