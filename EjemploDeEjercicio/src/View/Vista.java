/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Ambiente 209-2
 */
public class Vista {
     public static void main(String[] args) {
        String mensaje = "Elige una opción:\n"
                + "1. Grados Celsius a grados Fahrenheit.\n"
                + "2. Grados Celsius a grados Kelvin.\n"
                + "3. Grados Fahrenheit a grados Celsius.\n"
                + "4. Grados Fahrenheit a grados Kelvin.\n"
                + "5. Grados Kelvin a grados Fahrenheit.\n"
                + "6. Grados Kelvin a grados Celsius.\n";
       
            
        String opcion = JOptionPane.showInputDialog(null, mensaje);

        switch (opcion) {
            case "1":
                convertirCelsiusAFahrenheit();
                break;
            case "2":
                convertirCelsiusAKelvin();
                break;
            case "3":
                convertirFahrenheitACelsius();
                break;
            case "4":
                convertirFahrenheitAKelvin();
                break;
            case "5":
                convertirKelvinAFahrenheit();
                break;
            case "6":
                convertirKelvinACelsius();
                break;
            default:
                JOptionPane.showMessageDialog(null, "Opción inválida.");
        }
    }

    public static void convertirCelsiusAFahrenheit() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese los grados Celsius: ");
        Double celsius = scanner.nextDouble();

        Double fahrenheit = (celsius * 9 / 5) + 32;
        JOptionPane.showMessageDialog(null, celsius + " grados Celsius es igual a " + fahrenheit + " grados Fahrenheit.");
    }

    public static void convertirCelsiusAKelvin() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese los grados Celsius: ");
        Double celsius = scanner.nextDouble();

        Double kelvin = celsius + 273.15;
        JOptionPane.showMessageDialog(null, celsius + " grados Celsius es igual a " + kelvin + " grados Kelvin.");
    }

    public static void convertirFahrenheitACelsius() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese los grados Fahrenheit: ");
        Double fahrenheit = scanner.nextDouble();

        Double celsius = (fahrenheit - 32) * 5 / 9;
        JOptionPane.showMessageDialog(null, fahrenheit + " grados Fahrenheit es igual a " + celsius + " grados Celsius.");
    }

    public static void convertirFahrenheitAKelvin() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese los grados Fahrenheit: ");
        Double fahrenheit = scanner.nextDouble();

        Double kelvin = (fahrenheit + 459.67) * 5 / 9;
        JOptionPane.showMessageDialog(null, fahrenheit + " grados Fahrenheit es igual a " + kelvin + " grados Kelvin.");
    }

    public static void convertirKelvinAFahrenheit() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese los grados Kelvin: ");
        Double kelvin = scanner.nextDouble();

        Double fahrenheit = kelvin * 9 / 5 - 459.67;
        JOptionPane.showMessageDialog(null, kelvin + " grados Kelvin es igual a " + fahrenheit + " grados Fahrenheit.");
    }

    public static void convertirKelvinACelsius() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese los grados Kelvin: ");
        Double kelvin = scanner.nextDouble();

        Double celsius = kelvin - 273.15;
        JOptionPane.showMessageDialog(null, kelvin + " grados Kelvin es igual a " + celsius + " grados Celsius.");
    }
    

// 1.1.22. Grados Celsius a grados Fahrenheit.
    public static double celsiusToFahrenheit(String mensaje) {
        String input = JOptionPane.showInputDialog(null, mensaje);
        double celsius = Double.parseDouble(input);
        return (celsius * 9 / 5) + 32;
    }

    // 1.1.23. Grados Celsius a grados kelvin.
    public static double celsiusToKelvin(String mensaje) {
        String input = JOptionPane.showInputDialog(null, mensaje);
        Double celsius = Double.parseDouble(input);
        return celsius + 273.15;
    }

    // 1.1.24. Grados Fahrenheit a grados Celsius.
    public static double fahrenheitACelsius(String mensaje) {
        String input = JOptionPane.showInputDialog(null, mensaje);
        Double fahrenheit = Double.parseDouble(input);
        return (fahrenheit - 32) * 5 / 9;
    }

    // 1.1.25. Grados Fahrenheit a grados kelvin.
    public static double fahrenheitAKelvin(String mensaje) {
        String input = JOptionPane.showInputDialog(null, mensaje);
        Double fahrenheit = Double.parseDouble(input);
        return (fahrenheit + 459.67) * 5 / 9;
    }

    // 1.1.26. Grados kelvin a grados Fahrenheit.
    public static double kelvinAFahrenheit(String mensaje) {
        String input = JOptionPane.showInputDialog(null, mensaje);
        Double kelvin = Double.parseDouble(input);
        return kelvin * 9 / 5 - 459.67;
    }

    // 1.1.27. Grados kelvin a grados Celsius.
    public static double kelviACelsius(String mensaje) {
        String input = JOptionPane.showInputDialog(null, mensaje);
        Double kelvin = Double.parseDouble(input);
        return kelvin - 273.15;
    }
}