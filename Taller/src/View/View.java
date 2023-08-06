package View;

import Class.Ejercicio1;
import Class.Ejercicio10;
import Class.Ejercicio2;
import Class.Ejercicio3;
import Class.Ejercicio4;
import Class.Ejercicio5;
import Class.Ejercicio6;
import Class.Ejercicio7;
import Class.Ejercicio8;
import Class.Ejercicio9;
import java.util.Scanner;

public class View {

    public static void main(String[] args) {

        Ejercicio1 ej1 = new Ejercicio1();
        Ejercicio2 ej2 = new Ejercicio2();
        Ejercicio3 ej3 = new Ejercicio3();
        Ejercicio4 ej4 = new Ejercicio4();
        Ejercicio5 ej5 = new Ejercicio5();
        Ejercicio6 ej6 = new Ejercicio6();
        Ejercicio8 ej8 = new Ejercicio8();
        Ejercicio7 ej7 = new Ejercicio7();
        Ejercicio9 ej9 = new Ejercicio9();
        Ejercicio10 ej10 = new Ejercicio10();
        Scanner scan = new Scanner(System.in);
        int a;

        System.out.println("Elige una opcion:\n"
                + //
                "1.  Ejercicio 1. \n"
                + //
                "2.  Ejercicio 2. \n"
                + //
                "3.  Ejercicio 3. \n"
                + //
                "4.  Ejercicio 4. \n"
                + //
                "5.  Ejercicio 5. \n"
                + //
                "6.  Ejercicio 6. \n"
                + //
                "7. Ejercicio 7. \n"
                + //
                "8.  Ejercicio 8.\n"
                + //
                "9.  Ejercicio 9. \n"
                + //
                "10. Ejercicio 10.");
        a=scan.nextInt();
        switch(a){
            case 1:
        System.out.println("-Ejercicio 1.");
        ej1.Lectura();
        ej1.Logica();
        break;
            case 2:
        System.out.println("-Ejercicio 2.");
        ej2.Lectura();
        ej2.Logica();
        break;
            case 3:
        System.out.println("-Ejercicio 3.");
        ej3.Lectura();
        ej3.Logica();
        break;
            case 4:
        System.out.println("-Ejercicio 4.");
        ej4.Lectura();
        ej4.Logica();
        break;
            case 5:
        System.out.println("-Ejercicio 5.");
        ej5.Lectura();
        ej5.Logica();
        break;
            case 6:
        System.out.println("-Ejercicio 6.");
        ej6.Lectura();
        ej6.Logica();
        break;
            case 7:
        System.out.println("-Ejercicio 7.");
        ej7.Lectura();
        ej7.Logica();
        break;
            case 8:
        System.out.println("-Ejercicio 8.");
        ej8.Lectura();
        ej8.Logica();
        break;
            case 9:
        System.out.println("-Ejercicio 9.");
        ej9.Lectura();
        ej9.Logica();
        break;
            case 10:
        System.out.println("-Ejercicio 10.");
        ej10.Lectura();
        ej10.Logica();
        break;
            default:
                System.out.println("Opcion no valida.");
        }
    }
}
