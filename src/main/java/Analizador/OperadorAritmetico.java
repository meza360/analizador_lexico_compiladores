/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Analizador;

/**
 *
 * @author giova
 * Julio Alberto Farfan Ortiz 5990-16-9943
 * 
 */
public class OperadorAritmetico {
    
    
    public int aceptacion(String cadenaRecibida){
        String[] operadores = {"\\+","\\-","\\*","\\/"};
        boolean operador = false;
       
       
            //System.out.println("\nLa cadena en el array es " + reservadas[i]);
            System.out.println("\nLa cadena recibida es: " + cadenaRecibida);
            
            if (cadenaRecibida.matches(operadores[0]) || cadenaRecibida.matches(operadores[1]) || cadenaRecibida.matches(operadores[2]) || cadenaRecibida.matches(operadores[3])) {
                
                operador = true;
                System.out.println("Coinciden? " + operador);
                return 200;
            }
            else
            {
                
            operador = false;
            System.out.println("Coinciden? " + operador);
            return 0;
            }
        
    }
}
