/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Uno;

/**
 *
 * @author  Jefferson Sarango
 */
public class Docente {
    private String nombre;
    private String apellido;
    private String titulo;

    public Docente(String nombre, String apellido, String titulo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.titulo = titulo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
    @Override
    public String toString(){
        String dato= String.format("nombre docente: %s\napellido docente: %s\ntitulo: %d\n",getNombre(),getApellido(),getTitulo());
        return  dato;
    }
    
}
