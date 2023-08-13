/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View;

import Entity.Rendimiento.Alumnos;
import Utils.FunctionNumeric;
import Utils.FunctionString;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Ambiente 209-2
 */
public class Mostrar {
    public static void main(String[] args) {
        FunctionNumeric fn = new FunctionNumeric();
        FunctionString fs = new FunctionString();
        
        //Objeto para recibir data 
        Map<String, Double> data = new HashMap<>();
        
        // Capturar información de promedio y nivel
        Alumnos a = new Alumnos();
        a.se(fn.InputDoubleNumericPositiveScanner("Digite el promedio del estudiante"));
        a.setNivel(fs.InputStringScanner("Digite el nivel del estudiante (preparatoria o profesional):"));
        a.setMateriasReprobadas(fn.InputIntNumericPositiveScanner("Digite el número de materias reprobadas:"));
        
        // Calcular unidades a cursar y descuento
        data = a.Descuento();
        
        // Mostrar resultado
        for (Map.Entry<String, Double> entry : data.entrySet()) {
            String descripcion = entry.getKey();
            Double value = entry.getValue();
            fs.ShowScanner(descripcion + ": " + value + "\n");
        }
        
        // Calcular y mostrar total a pagar
        double totalAPagar = a.calcularTotalAPagar();
        fs.ShowScanner("Total a pagar: $" + totalAPagar);
    }
}
