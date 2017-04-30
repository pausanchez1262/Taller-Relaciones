package Punto3;

public class Segmento {

    private String horaInicio;
    private String horaFin;

    public Segmento(String horaInicio, String horaFin) {
        this.horaInicio = horaInicio;
        this.horaFin = horaFin;
    }

    public String getHoraInicio() {
        return horaInicio;
    }

    public String getHoraFin() {
        return horaFin;
    }

    public void setHoraInicio() {
        this.horaInicio = horaInicio;
    }

    public void setHoraFin() {
        this.horaFin = horaFin;
    }

    public void ImprimirSegmento() {
        System.out.println("Hora Inicio: " + this.getHoraInicio() + "Hora Fin: " + this.getHoraFin());
    }
}
