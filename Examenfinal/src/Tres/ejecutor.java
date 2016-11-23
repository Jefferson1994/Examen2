/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tres;

/**
 *
 * @author SALAS
 */
public class ejecutor {
    
    public static void main(String[] args) {
        
        Coches c1 = new Coches(4, "ec2012", "plomo", "masda", 4);
        Microbuzz c2 = new Microbuzz(3,"ecl2014", "amarillo", "hino", 6);
        Camioneta c3= new Camioneta(20,"mx22", "negro","chebrolet", 8);
        furgoneta c4= new furgoneta("mx22222", "plomo","hiunday", 10);
        
        
        
        vehiculos car[]= new vehiculos[4];
        car[0]=c1;
        car[1]=c2; 
        car[2]=c3;
        car[3]=c4;
        
       for (vehiculos actual: car){
            System.out.printf("%s\nel costo de alquiler es: %.2f\n\n",actual,actual.obtener_precio_alquiler());
        }
        
        
    }
    
}
