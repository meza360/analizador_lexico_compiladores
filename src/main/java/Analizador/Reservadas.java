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
public class Reservadas {
    
    //public String cadenaRecibida;
    public char caracterRecibido;
    //public String[] reservadas;
    
    
    public void Reservadas(){
     
//    reservadas[0] = "aiu";
//    reservadas[1] = "aim";
//    reservadas[2] = "aip";
//    reservadas[3] = "aii";
//    reservadas[4] = "aaa";
    }
    
    
    public int aceptacion(String cadenaRecibida){
        String[] reservadas = {"aiu","aim","aip","aii","aaa"};
        boolean reservada = false;
       
       
            //System.out.println("\nLa cadena en el array es " + reservadas[i]);
            System.out.println("\nLa cadena recibida es: " + cadenaRecibida);
        
            if (cadenaRecibida.matches(reservadas[0]) || cadenaRecibida.matches(reservadas[1]) || cadenaRecibida.matches(reservadas[2]) || cadenaRecibida.matches(reservadas[3]) || cadenaRecibida.matches(reservadas[4])) {
                
                reservada = true;
                System.out.println("Coinciden? " + reservada);
                return 100;
            }
            else
            {
                
            reservada = false;
            System.out.println("Coinciden? " + reservada);
            return 0;
            }
        
        
        
    }
    
    
}
