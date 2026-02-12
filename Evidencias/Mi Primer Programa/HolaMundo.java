/*Programa Creado por Samuel Campo y Nicolas Gonzalez Toro */

import java.util.Scanner;

public class HolaMundo {
    public static void main(String[] args) {

        // Mensaje inicial
        System.out.println("Bienvenido al programa");

        // Pedir nombre
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa tu nombre: ");
        String nombre = sc.nextLine();

        // Mostrar información
        System.out.println("Hola " + nombre);
        

    }
}