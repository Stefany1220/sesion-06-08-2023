/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View.Areas;

import Class.Areas.CapturaNumero;
import Class.Areas.Circunferencia;
import Class.Areas.Cuadrado;
import Class.Areas.Rectangulo;
import Class.Areas.Rombo;
import Class.Areas.Trapecio;
import Class.Areas.Triangulo;

/**
 *
 * @author usuario
 */
public class Areas {
    public static void main(String[] args) {
        //Objeto para capturar datos
        CapturaNumero x = new CapturaNumero();
        
        //Hallar área del triángulo
        Triangulo triangulo = new Triangulo();
        x.setMensaje("Digite la base del triángulo:");
        triangulo.setBase(x.Capturar());
        x.setMensaje("Digite la altura del triángulo:");
        triangulo.setAltura(x.Capturar());
        System.out.println("El área del triángulo es: "+triangulo.Area());
     
        
        // Hallar el área del rectangulo
        
        Rectangulo rectangulo = new Rectangulo();
         x.setMensaje("Digite la base del rectangulo:");
        rectangulo.setBase(x.Capturar());
        x.setMensaje("Digite la altura del rectangulo:");
        rectangulo.setAltura(x.Capturar());
        System.out.println("El área del rectangulo es: "+rectangulo.Area());
     
        // Hallar el área de la circunferencia
        
        Circunferencia circunferencia = new Circunferencia();
         x.setMensaje("Digite el Pi:");
        circunferencia.setPi(x.Capturar());
        x.setMensaje("Digite el radio de la circunferencia:");
        circunferencia.setRadio(x.Capturar());
        System.out.println("El área de la circunferencia es: "+circunferencia.Area());
        
        // Hallar el área del trapecio
        Trapecio trapecio = new Trapecio();
         x.setMensaje("Digite la base mayor del trapecio:");
        trapecio.setBaseMayor(x.Capturar());
         x.setMensaje("Digite la base menor del trapecio:");
        trapecio.setBaseMenor(x.Capturar());
        x.setMensaje("Digite la altura del trapecio:");
        trapecio.setAltura(x.Capturar());
        System.out.println("El área del rectangulo es: "+trapecio.Area());
        
        //Hallar el área del rombo
        Rombo rombo = new Rombo();
        x.setMensaje("Digite la diagonal mayor");
        rombo.setDiagonalMayor(x.Capturar());
        x.setMensaje("Digite la diagonal mayor");
        rombo.setDiagonalMenor(x.Capturar());
        System.out.println("El área del trapecio es:"+rombo.Area());
        
        //Hallar el área del cuadrado
        
        Cuadrado cuadrado = new Cuadrado();
        x.setMensaje("Digite la medida de los lados del cuadrado");
        cuadrado.setLado(x.Capturar());
        System.out.println("El área del cuadrado es:"+cuadrado.Area());
        
        
    }
    
 
}
