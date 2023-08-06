/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista.Volumen;

import Clases.Volumenes.CapturarNumero;
import Clases.Volumenes.Cilindro;
import Clases.Volumenes.Cono;
import Clases.Volumenes.Cubo;
import Clases.Volumenes.Esfera;

/**
 *
 * @author usuario
 */
public class Volumen {
    public static void main(String[] args) {
        //Objeto para capturar datos
        CapturarNumero x = new CapturarNumero();
        
        //Hallar volumen del cubo
        Cubo cubo = new Cubo();
        x.setMensaje("Digite la medida de los lados del cubo:");
        cubo.setLado(x.Capturar());
        System.out.println("El volumen del cubo es: "+cubo.Volumen());
     
        
        // Hallar el área del rectangulo
        
        Esfera esfera = new Esfera();
         x.setMensaje("Digite el Pi de la esfera:");
        esfera.setPi(x.Capturar());
        x.setMensaje("Digite el radio de la esfera:");
        esfera.setRadio(x.Capturar());
        System.out.println("El volumen de la esfera es: "+esfera.Volumen());
     
        // Hallar el área de la circunferencia
        
        Cilindro cilindro = new Cilindro();
         x.setMensaje("Digite el Pi del cilindro :");
        cilindro.setPi(x.Capturar());
        x.setMensaje("Digite el radio del cilindro:");
        cilindro.setRadio(x.Capturar());
        x.setMensaje("Digite la altura del cilindro:");
        cilindro.setAltura(x.Capturar());
        System.out.println("El volumen del cilindro es: "+cilindro.Volumen());
        
        // Hallar el área del trapecio
        Cono cono = new Cono();
         x.setMensaje("Digite el Pi del cono :");
        cono.setPi(x.Capturar());
        x.setMensaje("Digite el radio del cono:");
        cono.setRadio(x.Capturar());
        System.out.println("El volumen del cono es: "+cono.Volumen());
}
}
