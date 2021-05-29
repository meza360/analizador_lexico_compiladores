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
public class Asignacion {
    
    
    
    public int aceptacion(String cadenaRecibida){
        String[] operadores = {"\\="};
        boolean operador = false;
       
       
            //System.out.println("\nLa cadena en el array es " + reservadas[i]);
            System.out.println("\nLa cadena recibida es: " + cadenaRecibida);
            
            if (cadenaRecibida.matches(operadores[0])) {
                
                operador = true;
                System.out.println("Coinciden? " + operador);
                return 500;
            }
            else
            {
                
            operador = false;
            System.out.println("Coinciden? " + operador);
            return 0;
            }
        
    }
}
