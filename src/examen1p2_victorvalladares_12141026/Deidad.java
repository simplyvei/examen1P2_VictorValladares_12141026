package examen1p2_victorvalladares_12141026;

public class Deidad extends Extraterrestre{
    private boolean Creyentes;
    private String religion;
    
   
    public Deidad() {
        super();
    }

    public Deidad(boolean Creyentes, String religion, String nombre, String poder, String debilidad, String heroe, String villano, int fuerza, int mental, int fisica, boolean escuadron) {
        super(nombre, poder, debilidad, heroe, villano, fuerza, mental, fisica, escuadron);
        this.Creyentes = Creyentes;
        this.religion = religion;
    }

    public boolean isCreyentes() {
        return Creyentes;
    }

    public void setCreyentes(boolean Creyentes) {
        this.Creyentes = Creyentes;
    }

    public String getReligion() {
        return religion;
    }

    public void setReligion(String religion) {
        this.religion = religion;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public void find_chance() {
        
    }
    
    
}
