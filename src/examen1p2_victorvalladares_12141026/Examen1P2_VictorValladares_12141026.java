package examen1p2_victorvalladares_12141026;

import java.util.ArrayList;
import java.util.Collections;
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
        System.out.print("1. Opciones Universo\n" +
                        "2. Opciones Escuadron\n" +
                        "3. Opciones Persona\n" +
                        "Ingrese la opcion: ");
        int op = lea.nextInt();
        System.out.println("-----------------------------------------------");
        return op;
    }
    
    
    public static void realizar(int op){
        if (op == 0){
            System.exit(0);
        }else if (op == 1){
            realizarUniverso( menuUniverso() );
        }else if (op == 2){
           realizarPersona( menuPersona() );
        }else if (op == 3){
           
        }else if (op == 4){
            
        }
    }
    
    public static void crearUniverso(){
        lea.nextLine();
        System.out.print("Ingrese el nombre del universo: ");
        String nombre = lea.nextLine();
        for(Universo lista : universos){
            if (lista.getNombre().equalsIgnoreCase(nombre)){
                System.out.print("Este nombre ya existe, intente de nuevo: ");
                nombre = lea.next();
            }
        }
        universos.add(new Universo(nombre));
    }
    
    public static void eliminarUniverso(){
        System.out.print("Ingrese la posicion a eliminar: ");
        int pos = lea.nextInt();
        universos.remove(pos);
    }
    
    public static void listarUniverso(){
        for (Universo lista : universos){
            System.out.print(lista.toString());
            System.out.println("---------------------------------------------");
        }
    }
    
    public static void modificarUniverso(){
        System.out.print("Ingrese la posicion que desea modificar: ");
        int pos = lea.nextInt();
        System.out.print("Ingrese el nombre del universo: ");
        String nombre = lea.nextLine();
        for(Universo lista : universos){
            if (lista.getNombre().equalsIgnoreCase(nombre)){
                System.out.print("Este nombre ya existe, intente de nuevo: ");
                nombre = lea.next();
            }
        }
        universos.get(pos).setNombre(nombre);
    }
    
    
    public static int menuUniverso(){
        System.out.println("-----------------------------------------------");
        System.out.print("1. Crear\n" +
                        "2. Modificar\n" +
                        "3. Eliminar\n" +
                        "4. Listar\n" +   
                        "Ingrese la opcion: ");
        int op = lea.nextInt();
        System.out.println("-----------------------------------------------");
        return op;
    }
    
    public static void realizarUniverso(int op){
        if (op == 1){
            crearUniverso();
        }else if (op == 2){
           modificarUniverso();
        }else if (op == 3){
           eliminarUniverso();
        }else if (op == 4){
            listarUniverso();
        }
    }
    
    public static void crearPersona(){
        if (universos.isEmpty()){
            System.out.println("No se pueden crear personas porque no hay universos");
        }else{
            lea.nextLine();
            System.out.print("Ingrese el nombre de la persoan: ");
            String nombre = lea.nextLine();
            System.out.print("Ingrese la Fuerza: ");
            int fuerza = lea.nextInt();
            System.out.print("Ingrese la habilidad mental: ");
            int mental = lea.nextInt();
            System.out.print("Ingrese la habilidad fisica: ");
            int fisica = lea.nextInt();
            System.out.print("Ingrese la debilidad: ");
            String debilidad = lea.nextLine();
            System.out.print("Ingrese el poder: ");
            String poder = lea.nextLine();
            
            System.out.print("Ingrese si es heroe o villano\n"+
                            "1. Heroe\n" +
                            "2. Villano\n"+
                            "Ingrese la opcion: ");
            int op = lea.nextInt();
            lea.nextLine();
            
            String villano = "";
            String heroe = "";
            
            if (op == 1){
                heroe = "heroe";
            }else if (op == 2){
                villano = "villano";
            }
            
            System.out.print("Ingrese el tipo de persona\n"+
                            "1. Normal\n" +
                            "2. Super Humano\n"+
                            "3. Accidente Radioactivo\n"+
                            "4. Mutante\n"+
                            "5. Diedad\n"+
                            "6. Alien\n"+
                            "Ingrese la opcion: ");
            int op1 = lea.nextInt();
            
            if (op1 == 1){
                Normal normal = new Normal(nombre, poder, debilidad, heroe, villano, fuerza, mental, fisica);
                if (op == 1){
                    Heroes.add(normal);
                }else{
                    Villanos.add(normal);
                }
            }else if(op1 == 2){
                lea.nextLine();
                System.out.print("Ingrese el superpoder: ");
                String superpoder = lea.nextLine();
                SuperHumano s_humano = new SuperHumano(superpoder, nombre, poder, debilidad, heroe, villano, fuerza, mental, fisica);
                if (op == 1){
                    Heroes.add(s_humano);
                }else{
                    Villanos.add(s_humano);
                }
            }else if (op1 == 3){
                System.out.print("Ingrese la edad que tenia cuando ocurrio el accidente: ");
                int edad = lea.nextInt();
                lea.nextLine();
                System.out.print("Que tipo de accidente tuvo: ");
                String tipo = lea.nextLine();
                Accidente accidente = new Accidente (edad, tipo, nombre, poder, debilidad, heroe, villano, fuerza, mental, fisica);
                if (op == 1){
                    Heroes.add(accidente);
                }else{
                    Villanos.add(accidente);
                }
            }else if (op1 == 4){
                lea.nextLine();
                char r = 's';
                Mutante mutante = new Mutante (nombre, poder, debilidad, heroe, villano, fuerza, mental, fisica);
                while (r == 's' || r == 'S'){
                    System.out.print("Ingrese un factor mutante: ");
                    String factor = lea.nextLine();
                    mutante.getFactores().add(factor);
                    System.out.print("Desea agreagar otro factor [s/n]: ");
                    r = lea.next().charAt(0);
                }
                if (op == 1){
                    Heroes.add(mutante);
                }else{
                    Villanos.add(mutante);
                }
            }else if (op1 == 5){
                lea.nextLine();
                boolean creyentes = false;
                System.out.print("Tiene creyentes [si/no]: ");
                String val = lea.next();
                if (val.equalsIgnoreCase("si")){
                    creyentes = true;
                }
                System.out.print("Ingrese el nombre de la mitologia o religion a la que pertenece: ");
                String religion = lea.nextLine();
                Deidad deidad = new Deidad (creyentes, religion, nombre, poder, debilidad, heroe, villano, fuerza, mental, fisica);
                if (op == 1){
                    Heroes.add(deidad);
                }else{
                    Villanos.add(deidad);
                }
            }else if (op1 == 6){
                lea.nextLine();
                System.out.print("De que planeta viene: ");
                String planeta = lea.nextLine();
                Alien alien = new Alien (planeta, nombre, poder, debilidad, heroe, villano, fuerza, mental, fisica);
                if (op == 1){
                    Heroes.add(alien);
                }else{
                    Villanos.add(alien);
                }
            }
        } 
    }
    
    
    
    public static void realizarPersona(int op){
        if (op == 1){
            crearPersona();
        }else if (op == 2){
           
        }else if (op == 3){
           
        }else if (op == 4){
            
        }
    }
    
    public static int menuPersona(){
        System.out.println("-----------------------------------------------");
        System.out.print("1. Crear\n" +
                        "2. Modificar\n" +
                        "3. Eliminar\n" +
                        "4. Listar\n" +   
                        "Ingrese la opcion: ");
        int op = lea.nextInt();
        System.out.println("-----------------------------------------------");
        return op;
    }
}
