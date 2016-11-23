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
public class Camioneta extends vehiculos{
    private int toneladas;

    public Camioneta(int toneladas, String matricula, String color, String marca, int dias_alquiler) {
        super(matricula, color, marca, dias_alquiler);
        setToneladas(toneladas);
    }

    

    public int getToneladas() {
        return toneladas;
    }

    public void setToneladas(int toneladas) {
        this.toneladas = toneladas;
    }

    @Override
    double obtener_precio_alquiler() {
        double a,b;
         
         a= 50 / getDias_alquiler();
         b=a+(20*getToneladas());
         
         return b;
    }
     
    @Override
    public String toString(){
        String dato= String.format("matricula: %s\ncolor: %s\nmarca: %s\ndias de alquiler: %d\ntoneladas : %d\n",getMatricula(),getColor(),getMarca(),getDias_alquiler(),getToneladas());
        return  dato;
    }
    
    
    
}
