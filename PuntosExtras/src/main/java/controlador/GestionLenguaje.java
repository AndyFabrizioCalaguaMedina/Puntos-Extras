/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;
import modelo.LenguajeProgramacion;

/**
 *
 * @author User
 */
public class GestionLenguaje {
    
//Declaracion de atributos
    private LenguajeProgramacion[] arregloLenguajes;
    private int contadorLenguajes;
    private static final int FACTOR_CRECIENTO = 2;

    // Constructores
    public GestionLenguaje() {
        arregloLenguajes = new LenguajeProgramacion[FACTOR_CRECIENTO];
        contadorLenguajes = 0;
    }

    // Método para agregar un lenguaje
    public void agregarLenguaje(int anioCreacion, String caracteristicaPrincipal, String nombre, String utilizacion) {
        if (contadorLenguajes == arregloLenguajes.length) {
            expandirArreglo();
        }
        arregloLenguajes[contadorLenguajes++] = new LenguajeProgramacion(anioCreacion, caracteristicaPrincipal, nombre, utilizacion);
    }

    // Método para buscar un lenguaje
    public LenguajeProgramacion buscarLenguaje(String nombre) {
        for (int i = 0; i < contadorLenguajes; i++) {
            if (arregloLenguajes[i].getNombre().equalsIgnoreCase(nombre)) {
                return arregloLenguajes[i];
            }
        }
        return null;
    }

    // Método para eliminar un lenguaje
    public boolean eliminarLenguaje(String nombre) {
        for (int i = 0; i < contadorLenguajes; i++) {
            if (arregloLenguajes[i].getNombre().equalsIgnoreCase(nombre)) {
                for (int j = i; j < contadorLenguajes - 1; j++) {
                    arregloLenguajes[j] = arregloLenguajes[j + 1];
                }
                arregloLenguajes[--contadorLenguajes] = null;
                return true;
            }
        }
        return false;
    }

    // Método para obtener el arreglo actual de lenguajes
    public LenguajeProgramacion[] getArregloLenguajes() {
        LenguajeProgramacion[] copia = new LenguajeProgramacion[contadorLenguajes];
        System.arraycopy(arregloLenguajes, 0, copia, 0, contadorLenguajes);
        return copia;
    }

    // Método para imprimir los lenguajes
    public void imprimirLenguajes() {
                            
        System.out.println("------------------+------------------------------+------------+----------------------");
        System.out.println(String.format(
            "| %-15s | %-30s | %-10s | %-20s |",
            "LENGUAJE", "CARACTERISTICA PRINCIPAL", "ANIO", "UTILIZACION"
        ));                                                                                  
        System.out.println("------------------+------------------------------+------------+----------------------");

        for (int i = 0; i < contadorLenguajes; i++) {
            System.out.println(arregloLenguajes[i]);
        }

        System.out.println("------------------+------------------------------+------------+----------------------");
    }

    // Método para expandir el arreglo
    private void expandirArreglo() {
        LenguajeProgramacion[] nuevoArreglo = new LenguajeProgramacion[arregloLenguajes.length + FACTOR_CRECIENTO];
        System.arraycopy(arregloLenguajes, 0, nuevoArreglo, 0, arregloLenguajes.length);
        arregloLenguajes = nuevoArreglo;
    }

}
