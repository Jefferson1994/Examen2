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
public abstract class Prestamo {

    protected String nombre_beneficiario;
    protected double sueldo;
    protected double nomto_prestamo;
    protected double interes;
    protected int tiempo_años;
    Garante garante1;

    public Prestamo(String nombre_beneficiario, double sueldo, double nomto_prestamo, double interes, int tiempo_años, Garante garante1) {
        setNombre_beneficiario(nombre_beneficiario);
        setSueldo(sueldo);
        setNomto_prestamo(nomto_prestamo);
        setInteres(interes);
        setTiempo_años(tiempo_años);
        setGarante1(garante1);
        
    }

    
    
    
    
    
    public String getNombre_beneficiario() {
        return nombre_beneficiario;
    }

    public void setNombre_beneficiario(String nombre_beneficiario) {
        this.nombre_beneficiario = nombre_beneficiario;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public double getNomto_prestamo() {
        return nomto_prestamo;
    }

    public void setNomto_prestamo(double nomto_prestamo) {
        this.nomto_prestamo = nomto_prestamo;
    }

    public double getInteres() {
        return interes;
    }

    public void setInteres(double interes) {
        this.interes = interes;
    }

    public int getTiempo_años() {
        return tiempo_años;
    }

    public void setTiempo_años(int tiempo_años) {
        this.tiempo_años = tiempo_años;
    }

    public Garante getGarante1() {
        return garante1;
    }

    public void setGarante1(Garante garante1) {
        this.garante1 = garante1;
    }
    
    
    @Override
    public String toString(){
        String dato= String.format("nombre: %s\nsueldo: %.2f\nnomto de prestamo: %.2f\ninteres : %.2f\naños: %d\n",getNombre_beneficiario(),getSueldo(),getNomto_prestamo());
        return  dato;
    }
    
    public abstract double valor_total_interes();
    

}
