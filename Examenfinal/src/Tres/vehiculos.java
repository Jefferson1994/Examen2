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
public abstract class vehiculos {
    protected String matricula;
    protected String color;
    protected String marca;
    protected int  dias_alquiler;

    public vehiculos(String matricula, String color, String marca, int dias_alquiler) {
        setMatricula(matricula);
        setMarca(marca);
        setColor(color);
        setDias_alquiler(dias_alquiler);
    }

    
    
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getDias_alquiler() {
        return dias_alquiler;
    }

    public void setDias_alquiler(int dias_alquiler) {
        this.dias_alquiler = dias_alquiler;
    }

   

    
    
    
   
    abstract double obtener_precio_alquiler();
    
    
    
    
    
    
}
