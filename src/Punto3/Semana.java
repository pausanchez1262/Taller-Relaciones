package Punto3;

import java.util.ArrayList;

public class Semana {

    private int numeroSemana;
    private Dia[] diasLaborales;

    public Semana(int numeroSemana, Dia[] diasLaborales) {
        this.numeroSemana = numeroSemana;
        this.diasLaborales = diasLaborales;
    }

    public int getNumeroSemana() {
        return numeroSemana;
    }

    public Dia[] getDiasLaborales() {
        return diasLaborales;
    }

    public void setNumeroSemana(int numeroSemana) {
        this.numeroSemana = numeroSemana;
    }

    public void setDiasLaborales(Dia[] diasLaborales) {
        this.diasLaborales = diasLaborales;
    }

    public int SegmentosLibres() {
        int segmentosOc = 0;
        for (int i = 0; i < 5; i++) {
            segmentosOc = segmentosOc + diasLaborales[i].getSegmentosDia().size();
        }
        return 40 - segmentosOc;
    }

    public void ImprimirSemana() {
        System.out.println("En la semana " + this.getNumeroSemana() + "La programacion diaria es:");
        for (int i = 0; i < diasLaborales.length; i++) {
            diasLaborales[i].ImprimirDia();
        }
    }
}
