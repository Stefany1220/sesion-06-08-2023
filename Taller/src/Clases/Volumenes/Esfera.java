/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases.Volumenes;

/**
 *
 * @author usuario
 */
public class Esfera extends Volumen{
   private Double pi;
    private Double radio;
    
        public Double getPi() {
        return pi;
    }

    public void setPi(Double pi) {
        this.pi = pi;
    }

    public Double getRadio() {
        return radio;
    }

    public void setRadio(Double radio) {
        this.radio = radio;
    }

    @Override
    public Double Volumen() {
     return (4.0 / 3.0) * Math.PI * Math.pow(radio, 3);
    }
    }
    
    
    
    
    

