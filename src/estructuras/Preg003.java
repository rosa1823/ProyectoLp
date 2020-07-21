/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructuras;

import java.util.Scanner;

/**
 *
 * @author Rosa Ayala
 */
public class Preg003 {
    public static void main (String[] args) {
        Scanner teclado = new Scanner(System.in);
        String cadena;
        System.out.println("***MANEJO DE CADENAS***");
        System.out.println("leer cadena con nextline(): " );
        cadena = teclado.nextLine();
        System.out.println("valor inicial ingresado es: " + cadena);
        System.out.println("mayuscula con toUpperCase(): " + cadena);
        System.out.println("mayuscula con toLowerCase(): " + cadena);
        System.out.println("elimina espacios con trim: " + cadena);
        System.out.println("subcadena con substring(int)" + cadena);
        System.out.println("subcadena con substring(int,int)" + cadena);
        System.out.println("tamaño de cadena" + cadena.length());
        System.out.println("extraer letra: " + cadena.charAt(0));
        System.out.println("extraer letra: " + cadena.charAt(1));
        
        System.out.println("ultima letra: " + cadena.charAt(0));
    }
    
}

