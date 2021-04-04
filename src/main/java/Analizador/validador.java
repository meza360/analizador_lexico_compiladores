/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Analizador;

/**
 *
 * @author 14AM006LA
 *//**
 *
 * @author Hanier Iván Cordero Morales 5990-15-13370
 */
public class validador {
    
    
     public int aceptacion(String cadenaRecibida){
        String[] operadores = {"a","e","i","o","u","m","p"};
        boolean validacion = false;
       
       
            //System.out.println("\nLa cadena en el array es " + reservadas[i]);
            System.out.println("\nLa cadena recibida es: " + cadenaRecibida);
            
            if (cadenaRecibida.matches(operadores[0]) || cadenaRecibida.matches(operadores[1]) || cadenaRecibida.matches(operadores[2]) || cadenaRecibida.matches(operadores[3])) {
                
                validacion = true;
                System.out.println("Coinciden? " + validacion);
                return 400;
            }
            else
            {
                
            validacion = false;
            System.out.println("Coinciden? " + validacion);
            return 0;
            }
        
    }
    
}

