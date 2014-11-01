
package com.adgm.model;
import java.util.ArrayList;



/**
 *
 * @author ADGM
 */
public class GeneradorCalificaciones {
    public static void main(String args[]){
        
    ArrayList<Evaluacion> evaluaciones = new ArrayList<Evaluacion>();
    Evaluacion e = new Evaluacion("Petra", 5.8);
    Evaluacion e1 = new Evaluacion("Jose", 7.4);
    Evaluacion e2 = new Evaluacion("Roberta", 8.6);
    
  
                 

        System.out.print(" La calificacion de" + e.getNombre() + "es de " + e.getCalificacion() );
        System.out.print(" La calificacion de" + e1.getNombre() + "es de " + e1.getCalificacion() );
        System.out.print(" La calificacion de" + e2.getNombre() + "es de " + e2.getCalificacion() ); 
    }
}
    

