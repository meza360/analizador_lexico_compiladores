/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Analizador;

/**
 *
 * @author GIOVANI DAVID MEZA POGGIO 5990-18-14676 SECCION A
 * Julio Alberto Farfan Ortiz 5990-16-9943 SECCION A
 * Hanier Iván Cordero Morales 5990-15-13370 SECCION A
 * Armando Otoniel Pineda Perez 5990-17-672 SECCION A
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
