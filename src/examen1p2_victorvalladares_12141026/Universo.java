package examen1p2_victorvalladares_12141026;

import java.util.ArrayList;

public class Universo {
    private String nombre;
    private ArrayList <Escuadron> squads = new ArrayList ();

    public Universo() {
    }

    public Universo(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Escuadron> getSquads() {
        return squads;
    }

    public void setSquads(ArrayList<Escuadron> squads) {
        this.squads = squads;
    }

    @Override
    public String toString() {
        return "nombre = " + nombre + " squads = " + squads ;
    }
    
}
