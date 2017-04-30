package Punto6;

public class Perro extends Mascota{
    protected String raza;
    
    public Perro(String raza, String id, String nombre, String colorPelaje){
        super(id, nombre, colorPelaje);
        this.raza = raza;
    }
    
    public String getRaza(){
        return raza;
    }
    
    public void setRaza(String raza){
        this.raza = raza;
    }

    @Override
    public String sound() {
        return "guau";
    }
}
