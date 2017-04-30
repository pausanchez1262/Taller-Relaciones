package Punto3;

import java.util.ArrayList;

public class Programacion {

    private ArrayList<Sala> sala;

    public Programacion(ArrayList<Sala> sala) {
        this.sala = new ArrayList<>();
    }

    public void ImprimirProgramacionGeneral() {
        System.out.println("La programacion general es: ");
        for (int i = 0; i < sala.size(); i++) {
            sala.get(i).ImprimirSala();
        }
    }
}
