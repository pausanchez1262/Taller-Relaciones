package Punto6;

public class Hamster extends Mascota {

    protected double peso;

    public Hamster(double peso, String id, String nombre, String colorPelaje) {
        super(id, nombre, colorPelaje);
        this.peso = peso;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso() {
        this.peso = peso;
    }

    @Override
    public String sound() {
        return "snif";
    }

}
