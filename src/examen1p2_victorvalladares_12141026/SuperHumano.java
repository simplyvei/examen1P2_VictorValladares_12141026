package examen1p2_victorvalladares_12141026;

import java.util.Random;

public class SuperHumano extends Persona{
    Random r = new Random();
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
        int atributo = r.nextInt(3)+1;
        int atributo2 = r.nextInt(3)+1;
        if (atributo == 1){
            p1.setFuerza((int)Math.round(p1.getFuerza()*4));
        }else if (atributo == 2){
            p1.setMental((int)Math.round(p1.getMental()*4));
        }else{
            p1.setFisica((int)Math.round(p1.getFisica()*4));
        }
        
        if (atributo2 == 1){
            p1.setFuerza((int)Math.round(p1.getFuerza()*0.5));
        }else if (atributo2 == 2){
            p1.setMental((int)Math.round(p1.getMental()*0.5));
        }else{
            p1.setFisica((int)Math.round(p1.getFisica()*0.5));
        }
    }
    
}
