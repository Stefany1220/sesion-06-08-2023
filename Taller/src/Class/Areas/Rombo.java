/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class.Areas;

/**
 *
 * @author usuario
 */
public class Rombo extends Area  {
     private Double diagonalMayor;
     private Double diagonalMenor;
    
    public Double getDiagonalMayor(){
        return diagonalMayor;
    }
     public void setDiagonalMayor(Double diagonalMayor){
         this.diagonalMayor = diagonalMayor;
     }
     public Double getDiagonalMenor(){
         return diagonalMenor;
     }
     public void setDiagonalMenor(Double diagonalMenor){
         this.diagonalMenor = diagonalMenor;
     }

    @Override
    public Double Area() {
        double area;
        area = (this.getDiagonalMayor()*getDiagonalMenor())/2;
        this.setArea(area);
        return this.getArea();
    }
    
}
