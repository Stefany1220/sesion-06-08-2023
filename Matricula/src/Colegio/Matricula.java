package Colegio;

import Utils.FunctionNumeric;
import Utils.FunctionString;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Ambiente 209-2
 */
public class Matricula extends Notas {

    private String nombre;
    private Double totalPagar;
    private Double porcentajeDescuento;
    private Byte cantidadUnidad;
    private Notas nota;
    private Byte reprobadas;

    final Double costePreparatoria = 180.0;
    final Double costeProfesional = 300.0;

    public Byte getReprobadas() {
        return reprobadas;
    }

    public void setReprobadas(Byte reprobadas) {
        this.reprobadas = reprobadas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getTotalPagar() {
        return totalPagar;
    }

    private void setTotalPagar(Double totalPagar) {
        this.totalPagar = totalPagar;
    }

    public Double getPorcentajeDescuento() {
        return porcentajeDescuento;
    }

    private void setPorcentajeDescuento(Double porcentajeDescuento) {
        this.porcentajeDescuento = porcentajeDescuento;
    }

    public Byte getCantidadUnidad() {
        return cantidadUnidad;
    }

    private void setCantidadUnidad(Byte cantidadUnidad) {
        this.cantidadUnidad = cantidadUnidad;
    }

    public void GenerarFactura() {
        this.CapturarDatos();
        if (super.getTipo().equals("preparatoria")) {
            this.FacturaPreparatoria();
            this.setTotalPagar((costePreparatoria * (this.getCantidadUnidad() / 5)) * 1 - this.getPorcentajeDescuento());
        } else {
            if (super.getTipo().equals("profesional")) {
                this.FacturaProfesional();
            }
            this.setTotalPagar((costeProfesional * (this.getCantidadUnidad() / 5)) * 1 - this.getPorcentajeDescuento());
        }
    }

    public void CapturarDatos() {
        FunctionString fs = new FunctionString();
        FunctionNumeric fn = new FunctionNumeric();
        do {
            super.setTipo(fs.InputScanner("digite Preparatoria/Profesional: "));
        } while (!(super.getTipo().equals("Preparatoria") || super.getTipo().equals("Profesional")));
        super.setPromedio(fn.InputDoubleNumericRangeScanner("digite el promedio:", 0.0, 10.0));

        if (super.getPromedio() <= 7 && super.getTipo().equals("preparatoria")) {
            this.setReprobadas(fn.InputDoubleNumericRangeScanner("digite la cantidad de materias reprobadas 0/6: ", 0.0, 6.0).byteValue());
        }
    }

    public void FacturaPreparatoria() {
        if (getPromedio() >= 9.5) {
            setCantidadUnidad((byte) 55);
            setPorcentajeDescuento(0.25);
        }
        if (getPromedio() >= 9.0) {
            setCantidadUnidad((byte) 50);
            setPorcentajeDescuento(0.10);
        }
        if (getPromedio() > 7.0) {
            setCantidadUnidad((byte) 50);
            setPorcentajeDescuento(0.0);
        }
        if (getPromedio() <= 7.0 && this.getReprobadas() <= 3) {
            setCantidadUnidad((byte) 45);
            setPorcentajeDescuento(0.0);
        }
        if (getPromedio() <= 7.0 && this.getReprobadas() > 3) {
            setCantidadUnidad((byte) 40);
            setPorcentajeDescuento(0.0);
        }
    }

    public void FacturaProfesional() {
        if (getPromedio() >= 9.5) {
            setCantidadUnidad((byte) 55);
            setPorcentajeDescuento(0.20);
        }
        if (getPromedio() < 9.5) {
            setCantidadUnidad((byte) 55);
            setPorcentajeDescuento(0.0);
        }
    }
}
