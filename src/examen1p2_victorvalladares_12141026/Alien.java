package examen1p2_victorvalladares_12141026;

import java.util.Random;

public class Alien extends Extraterrestre{
    Random r = new Random();
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
    public void find_chance(Persona p1, Persona p2) {
        int atributo = r.nextInt(3)+1;
        int atributo2 = r.nextInt(3)+1;
        while (atributo == atributo2){
            atributo2 = r.nextInt(3)+1;
        }
        if (atributo == 1){
            p2.setFuerza((int)Math.round(p2.getFuerza()*0.5));
        }else if (atributo == 2){
            p2.setMental((int)Math.round(p2.getMental()*0.5));
        }else{
            p2.setFisica((int)Math.round(p2.getFisica()*0.5));
        }
        
        if (atributo2 == 1){
            p2.setFuerza((int)Math.round(p2.getFuerza()*0.5));
        }else if (atributo2 == 2){
            p2.setMental((int)Math.round(p2.getMental()*0.5));
        }else{
            p2.setFisica((int)Math.round(p2.getFisica()*0.5));
        }
    }
    
    
}
