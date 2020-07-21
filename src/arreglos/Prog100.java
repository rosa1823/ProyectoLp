/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arreglos;
import utils.Leer;

/**
 *
 * @author Rosa Ayala
 */
// Utilizando métodos, diseñe un programa que permita el ingreso de valores a
// a un arreglo y los muestre.
// Cuantos elementos vamos a ingresar: 5
//valores del arreglo: 10, 1, -5, 60, 1
public class Prog100 {
    public static int[] numeros = new int[1000];
    public static int cantidad;
    
    public static void escribirarreglo(){
        System.out.println("Agregar valores al arreglo: ");
        for (int i = 0; i < cantidad; i++) {
            System.out.print("numero[ " + i + "]: ");
            numeros[i]=Leer.entero();

        }

    }
    public static void imprimirarreglo(){
        System.out.println("Valores del arreglo");
        for (int i = 0; i < cantidad; i++) {
            System.out.println("numero[ " +i + " ]: " + numeros[i]);


            System.out.println("numero[ " +i + " ]: " + numeros[i]);                         
        }

    }
    public static void inicio(){
        System.out.print("Cantidad de elementos: "); 
        cantidad = Leer.entero();
        escribirarreglo();
        imprimirarreglo();


    }
    public static void main(String[] args) {
        inicio();
    }
    
}
