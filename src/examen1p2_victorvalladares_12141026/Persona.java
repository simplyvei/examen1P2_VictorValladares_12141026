package examen1p2_victorvalladares_12141026;

public abstract class Persona {
    private String nombre;
    private String poder;
    private String debilidad;
    private String heroe;
    private String villano;
    private int fuerza;
    private int mental;
    private int fisica;
    private boolean escuadron;

    public Persona() {
    }

    public Persona(String nombre, String poder, String debilidad, String heroe, String villano, int fuerza, int mental, int fisica, boolean escuadron) {
        this.nombre = nombre;
        this.poder = poder;
        this.debilidad = debilidad;
        this.heroe = heroe;
        this.villano = villano;
        this.fuerza = fuerza;
        this.mental = mental;
        this.fisica = fisica;
        this.escuadron = escuadron;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPoder() {
        return poder;
    }

    public void setPoder(String poder) {
        this.poder = poder;
    }

    public String getDebilidad() {
        return debilidad;
    }

    public void setDebilidad(String debilidad) {
        this.debilidad = debilidad;
    }

    public String getHeroe() {
        return heroe;
    }

    public void setHeroe(String heroe) {
        this.heroe = heroe;
    }

    public String getVillano() {
        return villano;
    }

    public void setVillano(String villano) {
        this.villano = villano;
    }

    public int getFuerza() {
        return fuerza;
    }

    public void setFuerza(int fuerza) {
        this.fuerza = fuerza;
    }

    public int getMental() {
        return mental;
    }

    public void setMental(int mental) {
        this.mental = mental;
    }

    public int getFisica() {
        return fisica;
    }

    public void setFisica(int fisica) {
        this.fisica = fisica;
    }

    public boolean isEscuadron() {
        return escuadron;
    }

    public void setEscuadron(boolean escuadron) {
        this.escuadron = escuadron;
    }

    @Override
    public String toString() {
        String devolver = "";
        if (getVillano().equalsIgnoreCase("villano")){
            devolver = "nombre = " + nombre + " debilidad = " + debilidad;
        }else if (getHeroe().equalsIgnoreCase("heroe")){
            devolver = "nombre = " + nombre + " poder = " + poder;
        }
        return devolver;
    }
    
    public abstract void find_chance();
}
