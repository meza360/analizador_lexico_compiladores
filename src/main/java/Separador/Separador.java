/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Separador;

import java.util.StringTokenizer;



/**
 *
 * @author GIOVANI DAVID MEZA POGGIO 5990-18-14676 SECCION A
 */
public class Separador {
    
    public Separador(){}
    
    public void separadorLexico(String cadenaRecibida){
        
        //se crean los elementos para separar las cadenas
        String[] cuerdas = new String[20];
        char[] caracteres = new char[20];
        StringTokenizer contador;
        int contador2;
        cuerdas = cadenaRecibida.split(" ");
        
        
        //como no se permite el envio de vectores en Java
        //se enviaran las palabras individualmente a la clase Analizador
        //para que esta asigne una clase de 3 digitos
        //dependiendo si es una palabra reservada, cadena, o signo de puntuacion
        
        for (int i = 0; i < cuerdas.length; i++) {
            
             contador = new StringTokenizer(cuerdas[i]);//un tokenizador, o contador temporal
             contador2 = cuerdas[i].length();// un contador, que es lo mismo que el token, pero en formato entero
             
             System.out.println("El contador2 es: " + contador2);//se imprime el contador, para verificar que la salida del numero
                                                                   //sea el mismo que la cantidad de caracteres en la salida del siguiente for
             System.out.println("La cadena es: " + cuerdas[i]);//imprime la cuerda completa
             
             for (int j = 0; j < contador2; j++) {//mientras j sea menor a la cantidad de caracteres que los que contiene la cuerda
                caracteres = cuerdas[i].toCharArray();//se envia cada caracter de la cuerda a un array de caracteres
                System.out.println("El caracter es: " + caracteres[j]);//se imprime el caracter
                 //ANOTACION PARA EL EQUIPO
                 //Si necesitan que se envie la cadena completa para verificarla y asignarle la clase
                 //se enviaria cuerdas[i] dentro de este for
                 
                 //Si se necesita que se envien los caracteres inviduales
                 //se envian caracteres[j] dentro de este for
                 
                 
                 
            }

             //este for no deberia de tener otra funcion de momento
        }
           
    }
    
}
