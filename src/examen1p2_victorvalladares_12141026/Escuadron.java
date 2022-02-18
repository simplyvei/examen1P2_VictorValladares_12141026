package examen1p2_victorvalladares_12141026;

import java.util.ArrayList;

public class Escuadron {
    private String nombre;
    private String base;
    private String lugar;
    private Persona lider;
    private boolean tipo;
    private ArrayList <Persona> miembros = new ArrayList ();

    public Escuadron() {
    }

    public Escuadron(String nombre, String base, String lugar, Persona lider, boolean tipo) {
        this.nombre = nombre;
        this.base = base;
        this.lugar = lugar;
        this.lider = lider;
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getBase() {
        return base;
    }

    public void setBase(String base) {
        this.base = base;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public Persona getLider() {
        return lider;
    }

    public void setLider(Persona lider) {
        this.lider = lider;
    }

    public boolean isTipo() {
        return tipo;
    }

    public void setTipo(boolean tipo) {
        this.tipo = tipo;
    }

    public ArrayList<Persona> getMiembros() {
        return miembros;
    }

    public void setMiembros(ArrayList<Persona> miembros) {
        this.miembros = miembros;
    }

    @Override
    public String toString() {
        return " nombre = " + nombre + " lider = " + lider + " miembros = " + miembros;
    }
    
}
