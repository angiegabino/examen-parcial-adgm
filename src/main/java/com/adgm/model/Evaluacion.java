
package com.adgm.model;

/**
 *
 * @autor ADGM
 */
public class Evaluacion {
    String nombre;
    float calificacion;

    public Evaluacion() {
    }

    public Evaluacion(String nombre, float calificacion) {
        this.nombre = nombre;
        this.calificacion = calificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public float getCalificacion() {
        return calificacion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCalificacion(float calificacion) {
        this.calificacion = calificacion;
    }
    
    
}
