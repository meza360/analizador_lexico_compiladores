/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Analizador;

/**
 *
 * @author GIOVANI DAVID MEZA POGGIO 
 */
public class Numero {
    
    public int aceptacion(String cadenaRecibida){
        String[] operadores = {"0","1","2","3","4","5","6","7","8","9"};
        boolean operador = false;
       
       
            //System.out.println("\nLa cadena en el array es " + reservadas[i]);
            System.out.println("\nLa cadena recibida es: " + cadenaRecibida);
            
            if (cadenaRecibida.matches(operadores[0]) || cadenaRecibida.matches(operadores[1]) || cadenaRecibida.matches(operadores[2]) || cadenaRecibida.matches(operadores[3]) || cadenaRecibida.matches(operadores[4]) || cadenaRecibida.matches(operadores[5]) || cadenaRecibida.matches(operadores[6]) || cadenaRecibida.matches(operadores[7]) || cadenaRecibida.matches(operadores[8]) || cadenaRecibida.matches(operadores[9])) {
                
                operador = true;
                System.out.println("Coinciden? " + operador);
                return 700;
            }
            else
            {
                
            operador = false;
            System.out.println("Coinciden? " + operador);
            return 0;
            }
        
    }
}
