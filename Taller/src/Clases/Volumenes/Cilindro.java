/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases.Volumenes;

/**
 *
 * @author usuario
 */
public class Cilindro extends Volumen {
    private Double pi;
    private Double altura;
    private Double radio;
    
        public Double getPi() {
        return pi;
    }

    public void setPi(Double pi) {
        this.pi = pi;
    }
    
        public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }
    
        public Double getRadio() {
        return radio;
    }

    public void setRadio(Double radio) {
        this.radio = radio;
    }

    @Override
    public Double Volumen() {
       double volumen;
        volumen = (this.getPi()*getAltura())*radio*radio;
        this.setVolumen(volumen);
        
        return this.getVolumen();
    }
    
    
    
}
