/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class.Areas;

/**
 *
 * @author usuario
 */
public class Trapecio extends Area {
    private Double baseMayor;
    private Double baseMenor;
    private Double altura;
    
     public Double getBaseMayor() {
        return baseMayor;
    }

    public void setBaseMayor(Double baseMayor) {
        this.baseMayor = baseMayor;
    }
    
     public Double getBaseMenor() {
        return baseMayor;
    }

    public void setBaseMenor(Double baseMenor) {
        this.baseMenor = baseMenor;
    }
    
    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    @Override
    public Double Area() {
        double area;
        area = (this.getBaseMayor()+getBaseMenor())/2*altura;
        this.setArea(area);
        
        return this.getArea();
    }
    
}
