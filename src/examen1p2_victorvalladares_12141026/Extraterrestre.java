package examen1p2_victorvalladares_12141026;

public abstract class Extraterrestre extends Persona{

    public Extraterrestre() {
        super();
    }

    public Extraterrestre(String nombre, String poder, String debilidad, String heroe, String villano, int fuerza, int mental, int fisica, boolean escuadron) {
        super(nombre, poder, debilidad, heroe, villano, fuerza, mental, fisica, escuadron);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    
    @Override
    public abstract void find_chance();
    
}
