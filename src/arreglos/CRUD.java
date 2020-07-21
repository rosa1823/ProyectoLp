/*
 * persona : nombre, dni, fecha de nacimiento
   Menu principal:
agregar persona, eliminar, editar, listar, salir
 */
package arreglos;

import utils.Leer;

/**
 *
 * @author Rosa Ayala
 */
public class CRUD {
    //VAR staticas
   public static String[] nombre = new String[1000];
   public static String[] dni = new String[1000]; 
   public static String[] fnacimiento = new String[1000];
   public static int posicion = -1; 

    public static void agregarpersona() {
        String continuar;
        do {            
            posicion++;
            System.out.println("Agregar persona");
            System.out.print("Nombre: ");
            nombre[posicion] = Leer.cadena ();
            System.out.print("DNI: ");
            dni[posicion] = Leer.cadena ();
            System.out.println("Fecha de nacimiento");
            fnacimiento[posicion] = Leer.cadena ();
            System.out.println("¿deseas agregar otro[S/N]?");
            continuar = Leer.cadena();
        } while (continuar.equalsIgnoreCase("S"));
    }

    public static void eliminarpersona() {
        String continuar;
        do {
        listarpersona();
        System.out.print("Ingrese el numero de la persona a eliminar: ");
        int numero = Leer.entero(); 
        numero --;
        for (int i = numero; i < posicion; i++) {
            nombre[i] = nombre[i+1];
            dni[i] = dni [i+1];
            fnacimiento[i] = fnacimiento[i+1]; 
        }
        nombre[posicion] = "";
        dni[posicion] = "";
        fnacimiento[posicion] = "";
        posicion--;
        System.out.println("¿deseas agregar otro[S/N]?");
            continuar = Leer.cadena();
        } while (continuar.equalsIgnoreCase("S"));
    }

    public static void editarpersona() {
        String continuar;
        do {
        listarpersona();
        System.out.println("ingrese el numero de la persona a editar:");
        int numero = Leer.entero();
        numero--;
        System.out.println("resultado" + nombre[numero] + "(" + dni[numero] +")" + fnacimiento[numero]) ;
        System.out.print("nuevo nombre: ");
        nombre[numero] = Leer.cadena();
        System.out.print("nuevo DNI: ");
        dni[numero] = Leer.cadena();
        System.out.print("nueva fecha de nacimiento: ");
        fnacimiento[numero]= Leer.cadena ();
        System.out.println("¿deseas agregar otro[S/N]?");
            continuar = Leer.cadena();
        } while (continuar.equalsIgnoreCase("S"));
    }

    public static void listarpersona() {
        System.out.println("Listado");
        System.out.print("N°\tDNI\t\tF. Nac.\t\tNombre completo");
        
        for (int i = 0; i < posicion; i++) {
            System.out.print ((i+1) + "t" + dni[i] + "t" + fnacimiento[i] + "t" + nombre[i]);
            
        }

    }

    public static void salir() {
        System.out.println("Gracias por su visita");

    }

    public static void error() {
        System.out.println("Error; Opcion incorrecta...");

    }

    public static void menu() {
        System.out.println("Menu principal");
        System.out.println("1.Agregar personas");
        System.out.println("2.Eliminar personas");
        System.out.println("3.Editar personas");
        System.out.println("4.Listar personas");
        System.out.println("5.Salir");
        System.out.println("Escoga una de la opciones");
    }

    public static void inicio() {
        int opcion;
        do {
            menu();
            opcion = Leer.entero();
            switch (opcion) {
                case 1:
                    agregarpersona();
                    break;
                case 2:
                    editarpersona();
                    break;
                case 3:
                    eliminarpersona();
                    break;
                case 4:
                    listarpersona();
                    break;
                case 5:
                    salir();
                    break;
                default:
                    error();
            }
        } while (opcion != 5);

    }

    public static void main(String[] args) {
        inicio();
    }

}
