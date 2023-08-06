/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class.Areas;

/**
 *
 * @author usuario
 */
public class Circunferencia extends Area {
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
    public Double Area() {
     double area;
        area = (this.getPi()*getRadio())*radio;
        this.setArea(area);
        
        return this.getArea();
    }
    }
    
    

   

   

