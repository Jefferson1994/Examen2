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
public class Microbuzz extends vehiculos{
    private int numero_rutas;

    public Microbuzz(int numero_rutas, String matricula, String color, String marca, int dias_alquiler) {
        super(matricula, color, marca, dias_alquiler);
        setNumero_rutas(numero_rutas);
    }

   

    
    public int getNumero_rutas() {
        return numero_rutas;
    }

    public void setNumero_rutas(int numero_rutas) {
        this.numero_rutas = numero_rutas;
    }

    @Override
    double obtener_precio_alquiler() {
        double a,b;
         
         a= 50 / getDias_alquiler();
         b=a+(10+getNumero_rutas());
         
         return b;
    }
     
    @Override
    public String toString(){
        String dato= String.format("matricula: %s\ncolor: %s\nmarca: %s\ndias de alquiler: %d\nnumerop de rutas: %d\n",getMatricula(),getColor(),getMarca(),getDias_alquiler(),getNumero_rutas());
        return  dato;
    }
    
    
    
}
