/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases.Volumenes;

/**
 *
 * @author usuario
 */
public class Cubo extends Volumen {
    private Double lado;
    
    public Double getLado(){
        return lado;
    }
    public void setLado(Double lado){
        this.lado = lado;
    }

    @Override
    public Double Volumen() {
        double volumen;
        volumen = (this.getLado()*getLado())*lado;
        this.setVolumen(volumen);
        return this.getVolumen();
    }
    
    
}
