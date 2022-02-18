package examen1p2_victorvalladares_12141026;

import java.util.ArrayList;

public class Mutante extends Persona{
    private ArrayList <String> factores = new ArrayList ();

    public Mutante() {
        super();
    }   

    public Mutante(String nombre, String poder, String debilidad, String heroe, String villano, int fuerza, int mental, int fisica, boolean escuadron) {
        super(nombre, poder, debilidad, heroe, villano, fuerza, mental, fisica, escuadron);
    }

    public ArrayList<String> getFactores() {
        return factores;
    }

    public void setFactores(ArrayList<String> factores) {
        this.factores = factores;
    }

    @Override
    public String toString() {
        return super.toString();
    }
    
    
    @Override
    public void find_chance() {
        
    }
    
}
