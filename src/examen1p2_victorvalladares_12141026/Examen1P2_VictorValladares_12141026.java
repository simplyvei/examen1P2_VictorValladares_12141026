package examen1p2_victorvalladares_12141026;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class Examen1P2_VictorValladares_12141026 {
    public static Random r = new Random();
    public static ArrayList <Universo> universos = new ArrayList ();
    public static ArrayList <Persona> Heroes = new ArrayList ();
    public static ArrayList <Persona> Villanos = new ArrayList ();
    public static ArrayList <Escuadron> Squad_V = new ArrayList ();
    public static ArrayList <Escuadron> Squad_H = new ArrayList ();
    
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
           realizarEscuadron( menuEscuadron() );
        }else if (op == 3){
           realizarPersona( menuPersona() );
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
            System.out.println(lista.toString());
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
            for (Persona lista_v : Villanos){
                if (lista_v.getNombre().equalsIgnoreCase(nombre)){
                    System.out.println("Ese nombre ya existe, intente de nuevo");
                    System.out.print("Ingrese un nombre: ");
                    nombre = lea.nextLine();
                }
            }
            for (Persona lista_h : Heroes){
                if (lista_h.getNombre().equalsIgnoreCase(nombre)){
                    System.out.println("Ese nombre ya existe, intente de nuevo");
                    System.out.print("Ingrese un nombre: ");
                    nombre = lea.nextLine();
                }
            }
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
    
    public static void listarPersona(){
        System.out.print("Desea ver los heroes o villanos\n"+
                        "1. Heroe\n" +
                        "2. Villano\n"+
                        "Ingrese la opcion: ");
        int op = lea.nextInt();
        if (op == 1){
            for (Persona lista : Villanos){
                System.out.println(lista.toString());
                System.out.println("-----------------------------------------");
            }
        }else {
            for (Persona lista : Heroes){
                System.out.println(lista.toString());
                System.out.println("------------------------------------------");
            }
        }
    }
    
    public static void modificarPersona(){
        System.out.print("Desea modificar un heroe o un villano\n"+
                        "1. Heroe\n" +
                        "2. Villano\n"+
                        "Ingrese la opcion: ");
        int op = lea.nextInt();
        System.out.print("Ingrese la posicion que desea modificar: ");
        int pos = lea.nextInt();
        lea.nextLine();
        System.out.print("Ingrese el nuevo nombre de la persoan: ");
        String nombre = lea.nextLine();
        System.out.print("Ingrese la nueva Fuerza: ");
        int fuerza = lea.nextInt();
        System.out.print("Ingrese la nueva habilidad mental: ");
        int mental = lea.nextInt();
        System.out.print("Ingrese la nueva habilidad fisica: ");
        int fisica = lea.nextInt();
        System.out.print("Ingrese la nueva debilidad: ");
        String debilidad = lea.nextLine();
        System.out.print("Ingrese el nuevo poder: ");
        String poder = lea.nextLine();
        
        if (op == 1){
            Villanos.get(pos).setNombre(nombre);
            Villanos.get(pos).setFuerza(fuerza);
            Villanos.get(pos).setMental(mental);
            Villanos.get(pos).setFisica(fisica);
            Villanos.get(pos).setDebilidad(debilidad);
            Villanos.get(pos).setPoder(poder);
        }else{
            Heroes.get(pos).setNombre(nombre);
            Heroes.get(pos).setFuerza(fuerza);
            Heroes.get(pos).setMental(mental);
            Heroes.get(pos).setFisica(fisica);
            Heroes.get(pos).setDebilidad(debilidad);
            Heroes.get(pos).setPoder(poder);
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
        
        if (op == 1){
            System.out.print("No hay nada que editar");
        }else if(op == 2){
            lea.nextLine();
            System.out.print("Ingrese el superpoder: ");
            String superpoder = lea.nextLine();
            ((SuperHumano)Villanos.get(pos)).setSuperpoder(superpoder);
        }else if (op == 3){
            System.out.print("Ingrese la edad que tenia cuando ocurrio el accidente: ");
            int edad = lea.nextInt();
            lea.nextLine();
            System.out.print("Que tipo de accidente tuvo: ");
            String tipo = lea.nextLine();
            ((Accidente)Villanos.get(pos)).setEdad(edad);
            ((Accidente)Villanos.get(pos)).setTipo(tipo);
        }else if (op == 4){
            System.out.print("Ingrese la posicion del factor que desea editar: ");
            int f_op = lea.nextInt();
            lea.nextLine();
            System.out.print("Ingrese un factor: ");
            String factor = lea.nextLine();
            ((Mutante)Villanos.get(pos)).getFactores().remove(f_op);
            ((Mutante)Villanos.get(pos)).getFactores().add(f_op, factor);
        }else if (op == 5){
            lea.nextLine();
            boolean creyentes = false;
            System.out.print("Tiene creyentes [si/no]: ");
            String val = lea.next();
            if (val.equalsIgnoreCase("si")){
                creyentes = true;
            }
            System.out.print("Ingrese el nombre de la mitologia o religion a la que pertenece: ");
            String religion = lea.nextLine();
            ((Deidad)Villanos.get(pos)).setCreyentes(creyentes);
            ((Deidad)Villanos.get(pos)).setReligion(religion);
        }else if (op == 6){
            lea.nextLine();
            System.out.print("De que planeta viene: ");
            String planeta = lea.nextLine();
            ((Alien)Villanos.get(pos)).setPlaneta(planeta);
        }
    }
    
    public static void eliminarPersona(){
        System.out.print("Ingrese la posicion a eliminar: ");
        int pos = lea.nextInt();
        System.out.print("Ingrese si es heroe o villano\n"+
                        "1. Heroe\n" +
                        "2. Villano\n"+
                        "Ingrese la opcion: ");
        int op = lea.nextInt();
        if (op == 1){
            Villanos.remove(pos);
        }else{
            Heroes.remove(pos);
        }
    }
    
    public static void realizarPersona(int op){
        if (op == 1){
            crearPersona();
        }else if (op == 2){
           modificarPersona();
        }else if (op == 3){
           eliminarPersona();
        }else if (op == 4){
            listarPersona();
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
    
    public static int menuEscuadron(){
        System.out.println("-----------------------------------------------");
        System.out.print("1. Crear\n" +
                        "2. Modificar\n" +
                        "3. Eliminar\n" +
                        "4. Listar\n" +
                        "5. Agreagar persona\n" +
                        "6. Simular Batalla\n" +
                        "Ingrese la opcion: ");
        int op = lea.nextInt();
        System.out.println("-----------------------------------------------");
        return op;
    }
    
    public static void realizarEscuadron(int op){
        if (op == 1){
            crearSquad();
        }else if (op == 2){
           modificarSquad();
        }else if (op == 3){
           eliminarSquad();
        }else if (op == 4){
            listarSquad();
        }else if (op == 5){
            agregarPersona();
        }else if (op == 6){
            batalla();
        } 
    }
    
    public static void crearSquad(){
        boolean tipo = false;
        System.out.print("Es un escuadron de villanos [si/no]: ");
        String resp = lea.next();
        System.out.print("Ingrese el nombre de la squad: ");
        String nombre = lea.nextLine();
        int i = 0;
        for (Universo lista : universos){
            if (lista.getSquads().get(i).getNombre().equalsIgnoreCase(nombre)){
                System.out.println("Este nombre ya existe, intente de nuevo");
                System.out.print("Ingrese el nombre de la squad: ");
                nombre = lea.nextLine();
            }
            i++;
        }
        System.out.print("Ingrese el nombre de la base: ");
        String base = lea.nextLine();
        System.out.print("Lugar donde se encuentra el escuadron: ");
        String lugar = lea.nextLine();
        if (resp.equalsIgnoreCase("si")){
            tipo = true;
        }
        System.out.print("Ingrese la posicion del universo al que lo desea agregar: ");
        int pos = lea.nextInt();
        universos.get(pos).getSquads().add(new Escuadron(nombre, base, lugar, tipo));
        if (tipo == true){
            Squad_V.add(new Escuadron(nombre, base, lugar, tipo));
        }else {
            Squad_H.add(new Escuadron(nombre, base, lugar, tipo));
        }
    }
    
    public static void listarSquad(){
        System.out.print("Desea ver escuadrones de heroes o villanos\n"+
                        "1. Heroe\n" +
                        "2. Villano\n"+
                        "Ingrese la opcion: ");
        int op = lea.nextInt();
        if (op == 1){
            for (Escuadron lista : Squad_H){
                System.out.println(lista.toString());
                System.out.println("-------------------------------------------");
            }
        }else{
            for (Escuadron lista : Squad_V){
                System.out.println(lista.toString());
                System.out.println("-------------------------------------------");
            }
        }
    }
    
    public static void modificarSquad(){
        System.out.print("Ingrese la posicion del universo donde se encuentra el escuadron: ");
        int pos1 = lea.nextInt();
        System.out.print("Ingrese la posicion del escuadron al que desea agregar: ");
        int pos2 = lea.nextInt();
        System.out.print("Ingrese el nombre de la squad: ");
        String nombre = lea.nextLine();
        int i = 0;
        for (Universo lista : universos){
            if (lista.getSquads().get(i).getNombre().equalsIgnoreCase(nombre)){
                System.out.println("Este nombre ya existe, intente de nuevo");
                System.out.print("Ingrese el nombre de la squad: ");
                nombre = lea.nextLine();
            }
            i++;
        }
        System.out.print("Ingrese el nombre de la base: ");
        String base = lea.nextLine();
        System.out.print("Lugar donde se encuentra el escuadron: ");
        String lugar = lea.nextLine();
        universos.get(pos1).getSquads().get(pos2).setNombre(nombre);
        universos.get(pos1).getSquads().get(pos2).setLugar(lugar);
        universos.get(pos1).getSquads().get(pos2).setBase(base);
        System.out.print("Desea cambiar el lider [si/no]: ");
        String resp = lea.next();
        if (resp.equalsIgnoreCase("si")){
            System.out.print("Ingrese la posicion de la persona que desea poner como lider: ");
            int pos3 = lea.nextInt();
            Persona lider = universos.get(pos1).getSquads().get(pos2).getMiembros().get(pos3);
            universos.get(pos1).getSquads().get(pos2).setLider(lider);
        }
        boolean tipo = false;
        System.out.print("Es un escuadron de villanos [si/no]: ");
        String resp2 = lea.next();
        int k = 0;
        if (resp2.equalsIgnoreCase("si")){
            tipo = true;
            for (Universo lista : universos){
                lista.getSquads().get(pos2).getMiembros().get(k).setVillano("villano");
                lista.getSquads().get(pos2).getMiembros().get(k).setHeroe("");
                k++;
            }
        }else{
            for (Universo lista : universos){
                lista.getSquads().get(pos2).getMiembros().get(k).setVillano("");
                lista.getSquads().get(pos2).getMiembros().get(k).setHeroe("heroe");
                k++;
            }
        }
    }
    
    public static void agregarPersona(){
        System.out.print("Ingrese la posicion del universo donde se encuentra el escuadron: ");
        int pos1 = lea.nextInt();
        System.out.print("Ingrese la posicion del escuadron al que desea agregar: ");
        int pos2 = lea.nextInt();
        System.out.print("Ingrese la posicion de la persona que desea agregar: ");
        int pos3 = lea.nextInt();
        System.out.print("Desea agreagar esta persona como lider [si/no]: ");
        String val = lea.next();
        if (universos.get(pos1).getSquads().get(pos2).isTipo() == true){
            if (Villanos.get(pos3).isEscuadron() == true){
                System.out.println("No se puede agreagar ya que ya esta en un escuadron");
            }else{
                if (val.equalsIgnoreCase("si")){
                    universos.get(pos1).getSquads().get(pos2).setLider(Villanos.get(pos3));
                }
                universos.get(pos1).getSquads().get(pos2).getMiembros().add(Villanos.get(pos3));
                Villanos.get(pos3).setEscuadron(true);
            }
            
        }else{
            if (Heroes.get(pos3).isEscuadron() == true){
                System.out.println("No se puede agreagar ya que ya esta en un escuadron");
            }else{
                if (val.equalsIgnoreCase("si")){
                    universos.get(pos1).getSquads().get(pos2).setLider(Heroes.get(pos3));
                }
                universos.get(pos1).getSquads().get(pos2).getMiembros().add(Heroes.get(pos3));
                Heroes.get(pos3).setEscuadron(true);
            }
        }
    }
    
    public static void eliminarSquad(){
        System.out.print("Ingrese la posicion del universo donde se encuentra el escuadron a eliminar: ");
        int pos1 = lea.nextInt();
        System.out.print("Ingrese la posicion del escuadron que desea eliminar: ");
        int pos2 = lea.nextInt();
        universos.get(pos1).getSquads().remove(pos2);
    }
    
    public static void batalla(){
        System.out.print("Ingrese la posicion del universo donde se encuentra los escuadrones: ");
        int pos1 = lea.nextInt();
        System.out.print("Ingrese la posicion del primer escuadrona a pelear: ");
        int pos2 = lea.nextInt();
        System.out.print("Ingrese la posicion del segundo escuadrona a pelear: ");
        int pos3 = lea.nextInt();
        Persona p1 = universos.get(pos1).getSquads().get(pos2).getLider();
        Persona p2 = universos.get(pos1).getSquads().get(pos3).getLider();
        int atributo = r.nextInt(3)+1;
        int index = 0;
        int i = 0;
        if (atributo == 1){
            System.out.println("DUELO DE FUERZA");
            if (p1.getFuerza() > p2.getFuerza()){
                System.out.println("Ha ganado el lider del primer equipo "+ p1.getNombre()+ ", con una fuerza de " + p1.getFuerza() 
                        +" sobre una fuerza de "+ p2.getFuerza()+ "preparandose para ultima chance");
                
                p2.setFuerza(999999999);
                for (Universo lista : universos){
                    if (p2.getFuerza() > lista.getSquads().get(pos3).getMiembros().get(i).getFuerza()){
                        p2 = lista.getSquads().get(pos3).getMiembros().get(i);
                        index = lista.getSquads().get(pos3).getMiembros().indexOf(universos.get(pos1).getSquads().get(pos3).getLider());
                    }
                    i++;
                }
                
                universos.get(pos1).getSquads().get(pos2).getMiembros().get(index).find_chance(p1, p2);
                
            }else if (p1.getFuerza() < p2.getFuerza()){
                System.out.println("Ha ganado el lider del segundo equipo "+ p2.getNombre()+ ", con una fuerza de " + p2.getFuerza() 
                        +" sobre una fuerza de "+ p1.getFuerza()+ "preparandose para ultima chance");
                
                p1.setFuerza(999999999);
                for (Universo lista : universos){
                    if (p1.getFuerza() > lista.getSquads().get(pos3).getMiembros().get(i).getFuerza()){
                        p1 = lista.getSquads().get(pos3).getMiembros().get(i);
                    }
                    i++;
                }
            }else{
                System.out.println("Hubo empate fuerza del primer lider fue de: "+ p1.getFuerza()+ " y la fuerza del segundo lider fue:"+ p2.getFuerza()+  ", no hay ganador");
            }
        }else if (atributo == 2){
            System.out.println("DUELO DE HABILIDAD FISICA");
            if (p1.getFisica() > p2.getFisica()){
                System.out.println("Ha ganado el lider del primer equipo "+ p1.getNombre()+ ", con una habilidad fisica de " + p1.getFisica() 
                        +" sobre una habilidad fisica de "+ p2.getFisica()+ "preparandose para ultima chance");
                
                p2.setFisica(999999999);
                for (Universo lista : universos){
                    if (p2.getFisica() > lista.getSquads().get(pos3).getMiembros().get(i).getFisica()){
                        p2 = lista.getSquads().get(pos3).getMiembros().get(i);
                    }
                    i++;
                }
                
            }else if (p1.getFisica() < p2.getFisica()){               
                System.out.println("Ha ganado el lider del segundo equipo "+ p2.getNombre()+ ", con una habilidad fisica de " + p2.getFisica() 
                        +" sobre una fuerza de "+ p1.getFisica()+ "preparandose para ultima chance");
                
                p1.setFisica(999999999);
                for (Universo lista : universos){
                    if (p1.getFisica() > lista.getSquads().get(pos3).getMiembros().get(i).getFisica()){
                        p1 = lista.getSquads().get(pos3).getMiembros().get(i);
                    }
                    i++;
                }
                
                
            }else{
                System.out.println("Hubo empate, habiliadad fisica del primer lider fue de: "+ p1.getFisica()+ " y la habilidad fisica del segundo lider fue:"+ p2.getFisica()+  ", no hay ganador");
            }
        }else if (atributo == 3){
            System.out.println("DUELO DE HABILIDAD MENTAL");
            if (p1.getMental() > p2.getMental()){
                System.out.println("Ha ganado el lider del primer equipo "+ p1.getNombre()+ ", con una habilidad mental de " + p1.getMental() 
                        +" sobre una habilidad mental de "+ p2.getMental()+ "preparandose para ultima chance");
                
                p2.setMental(999999999);
                for (Universo lista : universos){
                    if (p2.getMental() > lista.getSquads().get(pos3).getMiembros().get(i).getMental()){
                        p2 = lista.getSquads().get(pos3).getMiembros().get(i);
                    }
                    i++;
                }
                
            }else if (p1.getMental() < p2.getMental()){
                System.out.println("Ha ganado el lider del segundo equipo "+ p2.getNombre()+ ", con una habilidad mental de " + p2.getMental() 
                        +" sobre una fuerza de "+ p1.getMental()+ "preparandose para ultima chance");
                
                p1.setMental(999999999);
                for (Universo lista : universos){
                    if (p1.getMental() > lista.getSquads().get(pos3).getMiembros().get(i).getMental()){
                        p1 = lista.getSquads().get(pos3).getMiembros().get(i);
                    }
                    i++;
                }
                
            }else{
               System.out.println("Hubo empate, habiliadad mental del primer lider fue de: "+ p1.getMental()+ " y la habilidad mental del segundo lider fue:"+ p2.getMental()+  ", no hay ganador");
                
                
            }
        }
    }
    
    
}
