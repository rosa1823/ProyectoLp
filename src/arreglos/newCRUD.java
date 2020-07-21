/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arreglos;
import utils.Leer;

/**
 *@author Rosa Ayala
 *trabajare una lista de alumnos 
 * alumnos: nombre, edad, codigo, numero de orden
 * menu principal: agregar alumos, listar alumnos, quitar alumnos
 */
public class newCRUD {
      //VAR staticas
   public static String[] nombre = new String[1000];
   public static String[] apellido = new String[1000];
   public static String[] edad = new String[1000]; 
   public static String[] ndeorden = new String[1000];
   public static String[] codigo = new String[1000];
   public static String[] turno = new String[1000];
   
   public static int posicion = -1; 

    public static void agregaralumno() {
        String continuar;
        do {            
            posicion++;
            System.out.println("Agregar alumno");
            System.out.print("Nombre: ");
            nombre[posicion] = Leer.cadena ();
            System.out.print("apellido: ");
            apellido[posicion] = Leer.cadena ();
            System.out.print("Edad: ");
            edad[posicion] = Leer.cadena ();
            System.out.println("Numero de orden: ");
            ndeorden[posicion] = Leer.cadena ();
            System.out.println("Codigo: ");
            codigo[posicion] = Leer.cadena ();
            System.out.println("Turno: ");
            turno[posicion] = Leer.cadena ();
            continuar = Leer.cadena();
        } while (continuar.equalsIgnoreCase("S"));
    }

    public static void eliminaralumno() {
        String continuar;
        do {
        listarAlumno();
        System.out.print("Ingrese el numero del alumno a eliminar: ");
        int numero = Leer.entero(); 
        numero --;
        for (int i = numero; i < posicion; i++) {
            nombre[i] = nombre[i+1];
            codigo[i] = codigo[i+1];
            edad[i] = edad[i+1];
            ndeorden[i] = ndeorden[i+1];
        }
        nombre[posicion] = "";
        codigo[posicion] = "";
        edad[posicion] = "";
        ndeorden[posicion] = "";
        posicion--;
        System.out.println("¿deseas agregar otro[S/N]?");
            continuar = Leer.cadena();
        } while (continuar.equalsIgnoreCase("S"));
    }

    public static void editarAlumno() {
        String continuar;
        do {
        listarAlumno();
        System.out.println("ingrese el numero del alumno a editar:");
        int numero = Leer.entero();
        numero--;
        System.out.println("resultado" + nombre[numero] + apellido[numero] + codigo[numero] + edad[numero] + ndeorden[numero] + turno[numero]) ;
        System.out.print("nuevo nombre: ");
        nombre[numero] = Leer.cadena();
        System.out.print("nuevo apellido: ");
        apellido[numero] = Leer.cadena();
        System.out.print("nuevo codigo: ");
        codigo[numero] = Leer.cadena();
        System.out.print("nueva edad: ");
        edad[numero] = Leer.cadena();
        System.out.print("nuevo n° de orden: ");
        ndeorden[numero]= Leer.cadena ();
        System.out.print("nuevo turno: ");
        turno[numero]= Leer.cadena ();
        System.out.println("¿deseas agregar otro[S/N]?");
            continuar = Leer.cadena();
        } while (continuar.equalsIgnoreCase("S"));
    }

    public static void listarAlumno() {
        System.out.println("Listado");
        System.out.print("N°\tcodigo\t\tedad\t\tturno\t\tnumero de orden\t\tNombre completo");
        
        for (int i = 0; i < posicion; i++) {
            System.out.println ((i+1) + "t" + codigo[i] + "t" + edad[i] + "t" + turno[i] + "t" + ndeorden[i] + "t"  + nombre[i] + "t" + apellido[i] );
            
        }

    }

    public static void salir() {
        System.out.println("Gracias por su visita");

    }

    public static void error() {
        System.out.println("Error; Opcion incorrecta...");

    }

    public static void menu() {
        System.out.println(" ");
        System.out.println("Menu principal");
        System.out.println("Menu principal");
        System.out.println("1.Agregar alumnos");
        System.out.println("2.Eliminar alumnos");
        System.out.println("3.Editar alumnos");
        System.out.println("4.Listar alumnos");
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
                    agregaralumno();
                    break;
                case 2:
                    editarAlumno();
                    break;
                case 3:
                    eliminaralumno();
                    break;
                case 4:
                    listarAlumno();
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
    

