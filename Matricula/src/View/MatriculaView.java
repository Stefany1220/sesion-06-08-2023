/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View;

import Colegio.Matricula;
import Utils.FunctionNumeric;
import Utils.FunctionString;
import Colegio.Matricula;

/**
 *
 * @author Ambiente 209-2
 */
public class MatriculaView {

    public static void main(String[] args) {
        FunctionNumeric fn = new FunctionNumeric();
        FunctionString fs = new FunctionString();

        Matricula m[] = new Matricula[fn.InputIntegerNumericPositiveScanner("indique cuantos estudiantes desea agregar: ")];
        for (int i = 0; i < m.length; i++){
            m[1] = new Matricula();
            m[1].GenerarFactura();

        }
        for (int i = 0; i < m.length; i++){
            fs.ShowScanner(m[1].getNombre()+"$" + m [i] .getTotalPagar().toString());
        }
    }
}
