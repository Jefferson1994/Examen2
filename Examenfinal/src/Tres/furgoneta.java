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
public class furgoneta extends vehiculos{

    public furgoneta(String matricula, String color, String marca, int dias_alquiler) {
        super(matricula, color, marca, dias_alquiler);
    }

    @Override
    double obtener_precio_alquiler() {
        double a,b;
         
         a= 50 / getDias_alquiler();
         b=a+100;
         
         return b;
    }
    
     
    @Override
    public String toString(){
        String dato= String.format("matricula: %s\ncolor: %s\nmarca: %s\n",getMatricula(),getColor(),getMarca());
        return  dato;
    }
    
    
    
    
}
