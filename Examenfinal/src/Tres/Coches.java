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
public class Coches  extends vehiculos{
    
    private int numero_pasajeros;

    public Coches(int numero_pasajeros, String matricula, String color, String marca, int dias_alquiler) {
        super(matricula, color, marca, dias_alquiler);
        setNumero_pasajeros(numero_pasajeros);
    }

   
    
    

    public int getNumero_pasajeros() {
        return numero_pasajeros;
    }

    public void setNumero_pasajeros(int numero_pasajeros) {
        this.numero_pasajeros = numero_pasajeros;
    }

    @Override
    double obtener_precio_alquiler() {
         double a,b;
         
         a= 50 / getDias_alquiler();
         b=a+(5*getNumero_pasajeros());
         
         return b;
   
    }
    
    @Override
    public String toString(){
        String dato= String.format("matricula: %s\ncolor: %s\nmarca: %s\ndias de alquiler: %d\nnumerop de pasajero: %s\n",getMatricula(),getColor(),getMarca(),getDias_alquiler(),getNumero_pasajeros());
        return  dato;
    }
            
    
    
}
