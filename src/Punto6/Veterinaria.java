package Punto6;

import java.util.ArrayList;

public class Veterinaria {

    private String nombre;
    private ArrayList<Mascota> mascota;

    public Veterinaria(String nombre) {
        this.nombre = nombre;
        this.mascota = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public ArrayList<Mascota> getMascota() {
        return mascota;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setMascota(ArrayList<Mascota> mascota) {
        this.mascota = mascota;
    }

    public void eliminarMascota(Mascota m) {
        int index = mascota.indexOf(m);
        if (index != -1) {
            mascota.remove(index);
        }
    }

    Mascota buscarMascota(String m) {
        for (Mascota miMascota : mascota) {
            if (miMascota.getNombre().equals(m)) {
                return miMascota;
            }
        }
        return null;
    }

    public void mostrarPorTipo(String t) {
        switch (t) {
            case "Perro":
                for (Mascota m : mascota) {
                    if (m instanceof Perro) {
                        System.out.println((Perro) m);
                    }
                }
                break;

            case "Gato":
                for (Mascota m : mascota) {
                    if (m instanceof Gato) {
                        System.out.println((Gato) m);
                    }
                }
                break;

            case "Hamster":
                for (Mascota m : mascota) {
                    if (m instanceof Hamster) {
                        System.out.println((Hamster) m);
                    }
                }
                break;
        }
    }

    public void mostrarMascotasVet() {
        for (Mascota m : mascota) {
            System.out.println(m);
        }
    }
}
