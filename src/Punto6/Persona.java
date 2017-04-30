package Punto6;

import java.util.ArrayList;

public class Persona {

    private String nombre;
    private String id;
    private ArrayList<Mascota> mascota;

    public Persona(String nombre, String id) {
        this.nombre = nombre;
        this.id = id;
        this.mascota = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public String getId() {
        return id;
    }

    public ArrayList<Mascota> getMascota() {
        return mascota;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setMascota(ArrayList<Mascota> mascota) {
        this.mascota = mascota;
    }

    public void mostrarMascota() {
        for (Mascota m : mascota) {
            System.out.println("Persona: " + "Nombre= " + nombre + "Id= " + id + "Mascota= " + mascota);
        }
    }
}
