package examen1p2_victorvalladares_12141026;

import java.util.Scanner;

public class Examen1P2_VictorValladares_12141026 {
    
    public static Scanner lea = new Scanner (System.in);
    
    public static void main(String[] args) {
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
            
        }else if (op == 2){
           
        }else if (op == 3){
           
        }else if (op == 4){
            
        }
    }
}
