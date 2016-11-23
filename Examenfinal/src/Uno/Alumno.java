/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Uno;

/**
 *
 * @author Jefferson Sarango
 */
public class Alumno {
    private String nombre;
    private String apellido;
    Docente programacion;
    Docente base_datos;

    public Alumno(String nombre, String apellido, Docente programacion, Docente base_datos) {
        setNombre(nombre);
        setApellido(apellido);
        setProgramacion(programacion);
        setBase_datos(base_datos);
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

    public Docente getProgramacion() {
        return programacion;
    }

    public void setProgramacion(Docente programacion) {
        this.programacion = programacion;
    }

    public Docente getBase_datos() {
        return base_datos;
    }

    public void setBase_datos(Docente base_datos) {
        this.base_datos = base_datos;
    }
    @Override
    public String toString(){
        
        String dato= String.format("nombre alumno: %s\napellido alumno: %s\n\ndocentes: %s\nApellido docente: %s\nTituloDocente :%s\n\nnombre profe2: %s\napellido profe2: %s\n titulo: %s\n",getNombre(),getApellido(),getProgramacion().getNombre(),getProgramacion().getApellido(),getProgramacion().getTitulo(),getBase_datos().getNombre(),getBase_datos().getApellido(),getBase_datos().getTitulo());
        return  dato;
    }
    
    
    
}
