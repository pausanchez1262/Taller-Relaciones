package Punto3;

import java.util.ArrayList;

public class Sala {

    private ArrayList<Semana> semana;
    private int numeroSala;

    public Sala(ArrayList<Semana> semana, int numeroSala) {
        this.semana = new ArrayList<>();
        this.numeroSala = numeroSala;
    }

    public int getNumeroSala() {
        return numeroSala;
    }

    public ArrayList<Semana> getSemana() {
        return semana;
    }

    public void setNumeroSala(int numeroSala) {
        this.numeroSala = numeroSala;
    }

    public void setSemana(ArrayList<Semana> semana) {
        this.semana = semana;
    }

    public void ImprimirSala() {
        System.out.println("En la sala " + this.getNumeroSala() + " La programacion semanal es:");
        for (int i = 0; i < semana.size(); i++) {
            semana.get(i).ImprimirSemana();
        }
    }
}
