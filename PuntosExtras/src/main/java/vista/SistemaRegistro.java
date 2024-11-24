/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;
import controlador.GestionLenguaje;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class SistemaRegistro {
    
    private static final GestionLenguaje gestionLenguaje = new GestionLenguaje();

    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
        Scanner Lector = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n--- MENU DE OPCIONES ---");
            System.out.println("1. Agregar lenguaje");
            System.out.println("2. Buscar lenguaje");
            System.out.println("3. Eliminar lenguaje");
            System.out.println("4. Listar lenguajes");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opcion: ");
            opcion = Lector.nextInt();
            Lector.nextLine(); // Consumir salto de línea

            switch (opcion) {
                case 1 -> {
                    System.out.print("Ingrese el nombre: ");
                    String nombre = Lector.nextLine();
                    System.out.print("Ingrese la caracteristica principal: ");
                    String caracteristica = Lector.nextLine();
                    System.out.print("Ingrese el anio de creacion: ");
                    int anio = Lector.nextInt();
                    Lector.nextLine(); // Consumir salto de línea
                    System.out.print("Ingrese la utilizacion: ");
                    String utilizacion = Lector.nextLine();
                    gestionLenguaje.agregarLenguaje(anio, caracteristica, nombre, utilizacion);
                }
                case 2 -> {
                    System.out.print("Ingrese el nombre del lenguaje a buscar: ");
                    String nombre = Lector.nextLine();
                    var lenguaje = gestionLenguaje.buscarLenguaje(nombre);
                    if (lenguaje != null) {
                        System.out.println("Lenguaje encontrado: " + lenguaje);
                    } else {
                        System.out.println("Lenguaje no encontrado.");
                    }
                }
                case 3 -> {
                    System.out.print("Ingrese el nombre del lenguaje a eliminar: ");
                    String nombre = Lector.nextLine();
                    if (gestionLenguaje.eliminarLenguaje(nombre)) {
                        System.out.println("Lenguaje eliminado.");
                    } else {
                        System.out.println("Lenguaje no encontrado.");
                    }
                }
                case 4 -> gestionLenguaje.imprimirLenguajes();
                case 5 -> System.out.println("Saliendo del sistema...");
                default -> System.out.println("Opción inválida.");
            }
        } while (opcion != 5);
        
    } 
}
