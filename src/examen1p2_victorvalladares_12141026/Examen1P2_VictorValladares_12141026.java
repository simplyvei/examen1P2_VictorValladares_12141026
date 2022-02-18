package examen1p2_victorvalladares_12141026;

import java.util.ArrayList;
import java.util.Scanner;

public class Examen1P2_VictorValladares_12141026 {
    public static ArrayList <Universo> universos = new ArrayList ();
    public static ArrayList <Persona> Heroes = new ArrayList ();
    public static ArrayList <Persona> Villanos = new ArrayList ();
    
    public static Universo milkyWay = new Universo("Milky Way");
    
    public static Scanner lea = new Scanner (System.in);
    
    public static void main(String[] args) {
        universos.add(milkyWay);
        
        do{
            realizar( menu() );
        }while(true);
    }
    public static int menu(){
        System.out.println("-----------------------------------------------");
        System.out.println("0. Salir");
        System.out.print("1. Crear Universo\n" +
                        "2. Crear heroe o villano\n" +
                        "3. Crear escuadron\n" +
                        "4. Modificar o eliminar\n" +
                        "5. Pelea\n" +
                        "Ingrese la opcion: ");
        int op = lea.nextInt();
        System.out.println("-----------------------------------------------");
        return op;
    }
    public static void realizar(int op){
        if (op == 0){
            System.exit(0);
        }else if (op == 1){
            crearUniverso();
        }else if (op == 2){
           
        }else if (op == 3){
           
        }else if (op == 4){
            
        }
    }
    public static void crearUniverso(){
        lea.nextLine();
        System.out.print("Ingrese el nombre del universo: ");
        String nombre = lea.nextLine();
        universos.add(new Universo(nombre));
    }
    public static void crearPersona(){
        if (universos.isEmpty()){
            System.out.println("No se pueden crear personas porque no hay universos");
        }else{
            lea.nextLine();
            System.out.print("Ingrese el nombre de la persoan: ");
            String nombre = lea.nextLine();
            System.out.print("Ingrese si es heroe o villano\n"+
                            "1. Heroe\n" +
                            "2. Villano\n"+
                            "Ingrese la opcion: ");
            int op = lea.nextInt();
            if (op == 1){
                String villano = "";
                String heroe = "heroe";
                System.out.print("Ingrese el poder: ");
                String poder = lea.nextLine();
                
            }else if (op == 2){

            }
        } 
    }
}
