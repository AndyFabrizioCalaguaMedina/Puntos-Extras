/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author User
 */
public class LenguajeProgramacion {
    private int anioCreacion;
    private String caracteristicaPrincipal;
    private String nombre;
    private String utilizacion;

    // Constructores
    public LenguajeProgramacion(int anioCreacion, String caracteristicaPrincipal, String nombre, String utilizacion) {
        this.anioCreacion = anioCreacion;
        this.caracteristicaPrincipal = caracteristicaPrincipal;
        this.nombre = nombre;
        this.utilizacion = utilizacion;
    }
    
    /**
     * @return the anioCreacion
     */
    public int getAnioCreacion() {
        return anioCreacion;
    }

    /**
     * @param anioCreacion the anioCreacion to set
     */
    public void setAnioCreacion(int anioCreacion) {
        this.anioCreacion = anioCreacion;
    }

    /**
     * @return the caracteristicaPrincipal
     */
    public String getCaracteristicaPrincipal() {
        return caracteristicaPrincipal;
    }

    /**
     * @param caracteristicaPrincipal the caracteristicaPrincipal to set
     */
    public void setCaracteristicaPrincipal(String caracteristicaPrincipal) {
        this.caracteristicaPrincipal = caracteristicaPrincipal;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the utilizacion
     */
    public String getUtilizacion() {
        return utilizacion;
    }

    /**
     * @param utilizacion the utilizacion to set
     */
    public void setUtilizacion(String utilizacion) {
        this.utilizacion = utilizacion;
    }
    
    // Método toString
    @Override
    public String toString() {
        return String.format("║ %-15s ║ %-30s ║ %-10d ║ %-20s ║", getNombre(), getCaracteristicaPrincipal(), getAnioCreacion(), getUtilizacion());
    }   
}


