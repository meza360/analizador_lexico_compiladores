/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Separador;



/**
 *
 * @author GIOVANI DAVID MEZA POGGIO 5990-18-14676 SECCION A
 */
public class Separador {
    
    public Separador(){}
    
    public void separadorLexico(String cadenaRecibida){
        
        //se crean los elementos para separar las cadenas
        String[] cadenas = new String[20];
        cadenas = cadenaRecibida.split(" ");
        
        
        //como no se permite el envio de vectores en Java
        //se enviaran las palabras individualmente a la clase Analizador
        //para que esta asigne una clase de 3 digitos
        //dependiendo si es una palabra reservada, cadena, o signo de puntuacion
        
        for (int i = 0; i < cadenas.length; i++) {
            // aqui se enviaran los datos, probablemente como un array list, o
            //hacia un array list
            
            if (cadenas[i] != null || cadenas[i] != "") {
                //se comprueba que la posicion no este vacia antes de enviarla
            }
        }
           
    }
    
}
