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
public class PrestamoAutomovil extends Prestamo{
    private String tipoveiculo;
    private String marca_vehiculo;
    Garante garante2;

    public PrestamoAutomovil(String tipoveiculo, String marca_vehiculo, Garante garante2, String nombre_beneficiario, double sueldo, double nomto_prestamo, double interes, int tiempo_años, Garante garante1) {
        super(nombre_beneficiario, sueldo, nomto_prestamo, interes, tiempo_años, garante1);
        setTipoveiculo(tipoveiculo);
        setMarca_vehiculo(marca_vehiculo);
        setGarante2(garante2);
    }

    
    
    
    
    public String getTipoveiculo() {
        return tipoveiculo;
    }

    public void setTipoveiculo(String tipoveiculo) {
        this.tipoveiculo = tipoveiculo;
    }

    public String getMarca_vehiculo() {
        return marca_vehiculo;
    }

    public void setMarca_vehiculo(String marca_vehiculo) {
        this.marca_vehiculo = marca_vehiculo;
    }

    public Garante getGarante2() {
        return garante2;
    }

    public void setGarante2(Garante garante2) {
        this.garante2 = garante2;
    }

    @Override
    public double valor_total_interes() {
        return getNomto_prestamo()/getTiempo_años();
    }
    
    @Override
    public String toString(){
        String dato= String.format("nombre beneficiario: %s\nsueldo: %.2f\nnomto prestamo: %.2f\ninteres: %.2f\ntiempo en años: %d\nmtipo vehiculo: %s\nmarca veiculo: %s\nnombre garante: %s\napellido garante : %s\nsueldo garante : %.2f\n",getNombre_beneficiario(),getSueldo(),getNomto_prestamo(),getInteres(),getTiempo_años(),getTipoveiculo(),getMarca_vehiculo(),getGarante2().getNombre(),getGarante2().getApellido(),getGarante2().getSueldo());
        return  dato;
    }
    
    


    
}
