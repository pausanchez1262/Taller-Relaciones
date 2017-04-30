package Punto3;

import java.util.ArrayList;

public class Dia {

    private String fecha;
    private String nombreDia;
    private ArrayList<Segmento> segmentosDia;

    public Dia(String fecha, String nombreDia, ArrayList<Segmento> segmentosDia) {
        this.fecha = fecha;
        this.nombreDia = nombreDia;
        this.segmentosDia = new ArrayList<>();
    }

    public String getFecha() {
        return fecha;
    }

    public String getNombreDia() {
        return nombreDia;
    }

    public ArrayList<Segmento> getSegmentosDia() {
        return segmentosDia;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public void setNombreDia(String nombreDia) {
        this.nombreDia = nombreDia;
    }

    public void setSegmentosDia(ArrayList<Segmento> segmentosDia) {
        this.segmentosDia = segmentosDia;
    }

    public void ImprimirDia() {
        System.out.println("En el dia " + this.getNombreDia() + " " + this.getFecha() + "Los segmentos son: ");
        for (int i = 0; i < segmentosDia.size(); i++) {
            segmentosDia.get(i).ImprimirSegmento();
        }
    }
}
