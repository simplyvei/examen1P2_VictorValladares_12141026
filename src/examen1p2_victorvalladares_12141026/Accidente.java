package examen1p2_victorvalladares_12141026;

public class Accidente extends Persona{
    private int edad;
    private String tipo;

    public Accidente() {
        super();
    }

    public Accidente(int edad, String tipo, String nombre, String poder, String debilidad, String heroe, String villano, int fuerza, int mental, int fisica, boolean escuadron) {
        super(nombre, poder, debilidad, heroe, villano, fuerza, mental, fisica, escuadron);
        this.edad = edad;
        this.tipo = tipo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return super.toString();
    }
    
    
    @Override
    public void find_chance() {
        
    }
    
}
