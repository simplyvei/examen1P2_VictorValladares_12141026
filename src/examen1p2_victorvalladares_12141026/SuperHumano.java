package examen1p2_victorvalladares_12141026;

public class SuperHumano extends Persona{
    private String superpoder;

    public SuperHumano() {
        super();
    }

    public SuperHumano(String superpoder, String nombre, String poder, String debilidad, String heroe, String villano, int fuerza, int mental, int fisica, boolean escuadron) {
        super(nombre, poder, debilidad, heroe, villano, fuerza, mental, fisica, escuadron);
        this.superpoder = superpoder;
    }

    public String getSuperpoder() {
        return superpoder;
    }

    public void setSuperpoder(String superpoder) {
        this.superpoder = superpoder;
    }

    @Override
    public String toString() {
        return super.toString();
    }
    
    
    @Override
    public void find_chance() {
        
    }
    
}
