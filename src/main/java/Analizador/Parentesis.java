/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Analizador;

/**
 *
 * @author giova
 */
public class Parentesis {
    public int aceptacion(String cadenaRecibida){
        String[] puntuaciones = {"\\(","\\)"};
        boolean puntuacion = false;
       
       
            //System.out.println("\nLa cadena en el array es " + reservadas[i]);
            System.out.println("\nLa cadena recibida es: " + cadenaRecibida);
        
            if (cadenaRecibida.matches(puntuaciones[0]) || cadenaRecibida.matches(puntuaciones[1])) {
                
                puntuacion = true;
                System.out.println("Coinciden? " + puntuacion);
                return 600;
            }
            else
            {
                
            puntuacion = false;
            System.out.println("Coinciden? " + puntuacion);
            return 0;
            }
        
    }
}
