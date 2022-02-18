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
    
    public void validarFuerza(int fuerza, int mental, int fisica) throws Validacion{
        if (getVillano().equalsIgnoreCase("villano")){
            if (fuerza + mental + fisica < 150){
                throw new Validacion("No tiene lo suficiente para ser un villano");
            }
        }else{
            if (fuerza + mental + fisica < 100){
                throw new Validacion("No tiene lo suficiente para ser un heroe");
            }
        }
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public void find_chance(Persona p1, Persona p2) {
        p1.setFisica((int)Math.round(p1.getFisica()*4));
        p1.setMental((int)Math.round(p1.getMental()*4));
        p1.setFuerza((int)Math.round(p1.getFuerza()*4));
        
        p1.setFuerza((int)Math.round(p1.getFuerza()*0.5));
        p1.setMental((int)Math.round(p1.getMental()*0.5));
        p1.setFisica((int)Math.round(p1.getFisica()*0.5));
    }
    
    
}
