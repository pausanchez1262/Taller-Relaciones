package Punto6;

public abstract class Mascota {

    protected String id;
    protected String nombre;
    protected String colorPelaje;

    public Mascota(String id, String nombre, String colorPelaje) {
        this.id = id;
        this.nombre = nombre;
        this.colorPelaje = colorPelaje;
    }

    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getColorPelaje() {
        return colorPelaje;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setColorPelaje(String colorPelaje) {
        this.colorPelaje = colorPelaje;
    }

    public abstract String sound();

    @Override
    public String toString(){
        return "Mascota{" + "id=" + id + ", nombre=" + nombre + ", colorPelaje=" + colorPelaje + '}';
    }
}
