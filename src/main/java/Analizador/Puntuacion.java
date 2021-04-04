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
public class Puntuacion {
      public int aceptacion(String cadenaRecibida){
        String[] puntuaciones = {"\\.","\\,"};
        boolean puntuacion = false;
       
       
            //System.out.println("\nLa cadena en el array es " + reservadas[i]);
            System.out.println("\nLa cadena recibida es: " + cadenaRecibida);
        
            if (cadenaRecibida.matches(puntuaciones[0]) || cadenaRecibida.matches(puntuaciones[1])) {
                
                puntuacion = true;
                System.out.println("Coinciden? " + puntuacion);
                return 300;
            }
            else
            {
                
            puntuacion = false;
            System.out.println("Coinciden? " + puntuacion);
            return 0;
            }
        
    }
}
