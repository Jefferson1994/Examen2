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
public class PrestamoEducativo extends Prestamo{
   private String nivel_estudio;
   private String nombre_centro;
   Garante garante2;
   Garante garante3;

    public PrestamoEducativo(String nivel_estudio, String nombre_centro, Garante garante2, Garante garante3, String nombre_beneficiario, double sueldo, double nomto_prestamo, double interes, int tiempo_años, Garante garante1) {
        super(nombre_beneficiario, sueldo, nomto_prestamo, interes, tiempo_años, garante1);
        setNivel_estudio(nivel_estudio);
        setNombre_centro(nombre_centro);
        setGarante2(garante2);
        setGarante3(garante3);
        
    }

 
   
   
   
   
    public String getNivel_estudio() {
        return nivel_estudio;
    }

    public void setNivel_estudio(String nivel_estudio) {
        this.nivel_estudio = nivel_estudio;
    }

    public String getNombre_centro() {
        return nombre_centro;
    }

    public void setNombre_centro(String nombre_centro) {
        this.nombre_centro = nombre_centro;
    }

    public Garante getGarante2() {
        return garante2;
    }

    public void setGarante2(Garante garante2) {
        this.garante2 = garante2;
    }

    public Garante getGarante3() {
        return garante3;
    }

    public void setGarante3(Garante garante3) {
        this.garante3 = garante3;
    }

    @Override
    public double valor_total_interes() {
        return getNomto_prestamo()*getInteres();
    }
   
   @Override
    public String toString(){
        String dato= String.format("\nnombre beneficiario: %s\nsueldo: %.2f\nnomto prestamo: %.2f\ninteres: %.2f\ntiempo en años: %d\nnivel estudio: %s\nnombre del centro educativo: %s\nnombre garate: %s\napellido garante : %s\nsueldo garante : %.2f\nnombre garante: %s\napellido garante : %s\nsueldo garante : %.2f\n",getNombre_beneficiario(),getSueldo(),getNomto_prestamo(),getInteres(),getTiempo_años(),getNivel_estudio(),getNombre_centro(),getGarante2().getNombre(),getGarante2().getApellido(),getGarante2().getSueldo(),getGarante3().getNombre(),getGarante3().getApellido(),getGarante3().getSueldo());
        return  dato;
    }
   
   
   
   
   
}
