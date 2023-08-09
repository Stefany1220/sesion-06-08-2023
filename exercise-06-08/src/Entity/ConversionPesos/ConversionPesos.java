/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entity.ConversionPesos;

import Entity.Abstract.SuperEntity;
import Utils.FunctionNumeric;
import Utils.FunctionString;

/**
 *
 * @author Ambiente 209-2
 */
public class ConversionPesos extends SuperEntity {

    private Double monedaLocal;

    private Double monedaDestino;

    //Objeto de la clase FunctionNumeric
    FunctionNumeric fn = new FunctionNumeric();
    
    //Objeto de la clase FunctionString
    FunctionString fs = new FunctionString();


    
    public Double getMonedaLocal() {
        return monedaLocal;
    }

    public void setMonedaLocal(Double monedaLocal) {
        this.monedaLocal = monedaLocal;
    }

    public Double getMonedaDestino() {
        return monedaDestino;
    }

    public void setMonedaDestino(Double monedaDestino) {
        this.monedaDestino = monedaDestino;
    }

    // Convert Colombian Pesos to Dollars
    public void PesosToDollars() {
        this.setMonedaLocal(fn.InputDoubleNumericScanner("Digite el valor en Pesos Colombianos: "));
        double conversionRate = 0.00025; // Replace with the actual exchange rate from Pesos to Dollars
        this.setMonedaDestino(getMonedaLocal() * conversionRate);
        fs.ShowScanner("La conversión de " + getMonedaLocal() + " Pesos Colombianos a Dólares es " + getMonedaDestino() + "\n");
    }
    
    // Convert Colombian Pesos to Bolivares
    public void PesosToBolivares() {
        setMonedaLocal(fn.InputDoubleNumericScanner("Digite el valor en Pesos Colombianos: "));
        double conversionRate = 761.40; // Replace with the actual exchange rate from Pesos to Bolivares
        setMonedaDestino(getMonedaLocal() * conversionRate);
        fs.ShowScanner("La conversión de " + getMonedaLocal() + " Pesos Colombianos a Bolívares es " + getMonedaDestino() + "\n");
    }
    
     // Convert Colombian Pesos to Soles
    public void PesosToSoles() {
        setMonedaLocal(fn.InputDoubleNumericScanner("Digite el valor en Pesos Colombianos: "));
        double conversionRate = 0.00090779793; // Replace with the actual exchange rate from Pesos to Soles
        setMonedaDestino(getMonedaLocal() * conversionRate);
        fs.ShowScanner("La conversión de " + getMonedaLocal() + " Pesos Colombianos a Soles es " + getMonedaDestino() + "\n");
    }
    
    // Convert Colombian Pesos to Pesetas
    public void PesosToPesetas() {
        setMonedaLocal(fn.InputDoubleNumericScanner("Digite el valor en Pesos Colombianos: "));
        double conversionRate = 0.037246074; // Replace with the actual exchange rate from Pesos to Pesetas
        setMonedaDestino(getMonedaLocal() * conversionRate);
        fs.ShowScanner("La conversión de " + getMonedaLocal() + " Pesos Colombianos a Pesetas es " + getMonedaDestino() + "\n");
    }
    
     // Convert Colombian Pesos to Francos
    public void PesosToFrancos() {
        setMonedaLocal(fn.InputDoubleNumericScanner("Digite el valor en Pesos Colombianos: "));
        double conversionRate = 0.00021470399; // Replace with the actual exchange rate from Pesos to Francos
        setMonedaDestino(getMonedaLocal() * conversionRate);
        fs.ShowScanner("La conversión de " + getMonedaLocal() + " Dólares a Francos es " + getMonedaDestino() + "\n");
    }
    public void DolaresToPesos() {
        this.setMonedaLocal(fn.InputDoubleNumericScanner("Digite el valor en Dólares: "));
        double conversionRate = 4078.97; // Replace with the actual exchange rate from Pesos to Dollars
        this.setMonedaDestino(getMonedaLocal() * conversionRate);
        fs.ShowScanner("La conversión de " + getMonedaLocal() + " Dolares a Pesos colombianos es " + getMonedaDestino() + "\n");
    }
    
    // Convert Colombian Pesos to Bolivares
    public void DolaresToBolivares() {
        setMonedaLocal(fn.InputDoubleNumericScanner("Digite el valor en Dólares: "));
        double conversionRate = 3.105; // Replace with the actual exchange rate from Pesos to Bolivares
        setMonedaDestino(getMonedaLocal() * conversionRate);
        fs.ShowScanner("La conversión de " + getMonedaLocal() + " Dolares a Bolívares es " + getMonedaDestino() + "\n");
    }
    
     // Convert Colombian Pesos to Soles
    public void DolaresToSoles() {
        setMonedaLocal(fn.InputDoubleNumericScanner("Digite el valor en Dólares: "));
        double conversionRate = 3.7000165 ; // Replace with the actual exchange rate from Pesos to Soles
        setMonedaDestino(getMonedaLocal() * conversionRate);
        fs.ShowScanner("La conversión de " + getMonedaLocal() + " Dolares a Soles es " + getMonedaDestino() + "\n");
    }
    
    // Convert Colombian Pesos to Pesetas
    public void DolaresToPesetas() {
        setMonedaLocal(fn.InputDoubleNumericScanner("Digite el valor en Dólares: "));
        double conversionRate = 151; // Replace with the actual exchange rate from Pesos to Pesetas
        setMonedaDestino(getMonedaLocal() * conversionRate);
        fs.ShowScanner("La conversión de " + getMonedaLocal() + " Dolares a Pesetas es " + getMonedaDestino() + "\n");
    }
    
     // Convert Colombian Pesos to Francos
    public void DolaresToFrancos() {
        setMonedaLocal(fn.InputDoubleNumericScanner("Digite el valor en Dólares: "));
        double conversionRate = 0.87; // Replace with the actual exchange rate from Pesos to Francos
        setMonedaDestino(getMonedaLocal() * conversionRate);
        fs.ShowScanner("La conversión de " + getMonedaLocal() + " Dolares a Francos es " + getMonedaDestino() + "\n");
    }
    
     
    // Convert Colombian Pesos to Bolivares
    public void BolivaresToDolares() {
        setMonedaLocal(fn.InputDoubleNumericScanner("Digite el valor en Bolivares: "));
        double conversionRate = 0.00000032204356; // Replace with the actual exchange rate from Pesos to Bolivares
        setMonedaDestino(getMonedaLocal() * conversionRate);
        fs.ShowScanner("La conversión de " + getMonedaLocal() + " Bolivares a Dolares es " + getMonedaDestino() + "\n");
    }
    // Convert Colombian Pesos to Francos
    public void BolivaresToPesos() {
        setMonedaLocal(fn.InputDoubleNumericScanner("Digite el valor en Bolivares: "));
        double conversionRate = 0.0013130609; // Replace with the actual exchange rate from Pesos to Francos
        setMonedaDestino(getMonedaLocal() * conversionRate);
        fs.ShowScanner("La conversión de " + getMonedaLocal() + " Bolivares a Pesos es " + getMonedaDestino() + "\n");
    }
     // Convert Colombian Pesos to Soles
    public void BolivaresToSoles() {
        setMonedaLocal(fn.InputDoubleNumericScanner("Digite el valor en Bolivares: "));
        double conversionRate = 0.0000011923703; // Replace with the actual exchange rate from Pesos to Soles
        setMonedaDestino(getMonedaLocal() * conversionRate);
        fs.ShowScanner("La conversión de " + getMonedaLocal() + " Bolivares a Soles es " + getMonedaDestino() + "\n");
    }
    
    // Convert Colombian Pesos to Pesetas
    public void BolivaresToPesetas() {
        setMonedaLocal(fn.InputDoubleNumericScanner("Digite el valor en Bolivares: "));
        double conversionRate = 0.000048907488; // Replace with the actual exchange rate from Pesos to Pesetas
        setMonedaDestino(getMonedaLocal() * conversionRate);
        fs.ShowScanner("La conversión de " + getMonedaLocal() + " Bolivares a Pesetas es " + getMonedaDestino() + "\n");
    }
    
     // Convert Colombian Pesos to Francos
    public void BolivaresToFrancos() {
        setMonedaLocal(fn.InputDoubleNumericScanner("Digite el valor en Bolivares: "));
        double conversionRate = 0.00000028208095; // Replace with the actual exchange rate from Pesos to Francos
        setMonedaDestino(getMonedaLocal() * conversionRate);
        fs.ShowScanner("La conversión de " + getMonedaLocal() + " Bolivares a Francos es " + getMonedaDestino() + "\n");
    }
    
    // Convert Colombian Pesos to Bolivares
    public void SolesToDolares() {
        setMonedaLocal(fn.InputDoubleNumericScanner("Digite el valor en Soles: "));
        double conversionRate = 0.27020444; // Replace with the actual exchange rate from Pesos to Bolivares
        setMonedaDestino(getMonedaLocal() * conversionRate);
        fs.ShowScanner("La conversión de " + getMonedaLocal() + " Soles a Dólares es " + getMonedaDestino() + "\n");
    }
    // Convert Colombian Pesos to Francos
    public void SolesToPesos() {
        setMonedaLocal(fn.InputDoubleNumericScanner("Digite el valor en Soles: "));
        double conversionRate = 1101.9676; // Replace with the actual exchange rate from Pesos to Francos
        setMonedaDestino(getMonedaLocal() * conversionRate);
        fs.ShowScanner("La conversión de " + getMonedaLocal() + " Soles a Pésos es " + getMonedaDestino() + "\n");
    }
     // Convert Colombian Pesos to Soles
    public void SolesToBolivares() {
        setMonedaLocal(fn.InputDoubleNumericScanner("Digite el valor en Soles: "));
        double conversionRate = 838.778; // Replace with the actual exchange rate from Pesos to Soles
        setMonedaDestino(getMonedaLocal() * conversionRate);
        fs.ShowScanner("La conversión de " + getMonedaLocal() + " Soles a Bolivares es " + getMonedaDestino() + "\n");
    }
    
    // Convert Colombian Pesos to Pesetas
    public void SolesToPesetas() {
        setMonedaLocal(fn.InputDoubleNumericScanner("Digite el valor en Soles: "));
        double conversionRate = 41; // Replace with the actual exchange rate from Pesos to Pesetas
        setMonedaDestino(getMonedaLocal() * conversionRate);
        fs.ShowScanner("La conversión de " + getMonedaLocal() + " Soles a Pesetas es " + getMonedaDestino() + "\n");
    }
    
     // Convert Colombian Pesos to Francos
    public void SolesToFrancos() {
        setMonedaLocal(fn.InputDoubleNumericScanner("Digite el valor en Soles: "));
        double conversionRate = 0.23; // Replace with the actual exchange rate from Pesos to Francos
        setMonedaDestino(getMonedaLocal() * conversionRate);
        fs.ShowScanner("La conversión de " + getMonedaLocal() + " Soles a Francos es " + getMonedaDestino() + "\n");
    }
    
    
}

