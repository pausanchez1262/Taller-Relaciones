package Punto6;

public class Gato extends Mascota {

    protected boolean esCazador;

    public Gato(boolean esCazador, String id, String nombre, String colorPelaje) {
        super(id, nombre, colorPelaje);
        this.esCazador = esCazador;
    }

    public boolean getEsCazador() {
        return esCazador;
    }

    public void setEsCazador(boolean esCazador) {
        this.esCazador = esCazador;
    }

    @Override
    public String sound() {
        return "miau";
    }

}
