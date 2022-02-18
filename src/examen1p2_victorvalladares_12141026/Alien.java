package examen1p2_victorvalladares_12141026;

public class Alien extends Extraterrestre{
    private String planeta;

    public Alien() {
        super();
    }

    public Alien(String planeta, String nombre, String poder, String debilidad, String heroe, String villano, int fuerza, int mental, int fisica, boolean escuadron) {
        super(nombre, poder, debilidad, heroe, villano, fuerza, mental, fisica, escuadron);
        this.planeta = planeta;
    }

    public String getPlaneta() {
        return planeta;
    }

    public void setPlaneta(String planeta) {
        this.planeta = planeta;
    }

    @Override
    public String toString() {
        return super.toString();
    }
    
    @Override
    public void find_chance() {
        
    }
    
    
}
