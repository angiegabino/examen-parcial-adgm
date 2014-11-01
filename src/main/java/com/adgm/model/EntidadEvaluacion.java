
package com.adgm.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author ADGM
 */
@Entity
public class EntidadEvaluacion implements Serializable {
    private static final long serialVersionUID = 1L;
    
    @Id
    private String nombre;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    private float calificacion;

    public float getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(float calificacion) {
        this.calificacion = calificacion;
    }
   
    @Override
    public String toString() {
        return "com.adgm.model.EntidadEvaluacion[ nombre=" + nombre + " calificacion = " + calificacion + "]";
    }
    
}
