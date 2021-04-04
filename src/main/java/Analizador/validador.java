/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Analizador;

import java.util.StringTokenizer;

/**
 *
 * @author GIOVANI DAVID MEZA POGGIO 5990-18-14676 SECCION A
 * Julio Alberto Farfan Ortiz 5990-16-9943 SECCION A
 * Hanier Iván Cordero Morales 5990-15-13370 SECCION A
 * Armando Otoniel Pineda Perez 5990-17-672 SECCION A
 */

public class validador {
    
    
    
    public int aceptacion(String cadenaRecibida,int cantidadCaracteres){
        
        
        char[] validas = {'a','e','i','o','u','m','p'};
        char[] caracteresSeparados;
        int valido = 4;
        //se inicia la separacion
        caracteresSeparados = cadenaRecibida.toCharArray();
        //se inicia el ciclo por la cantidad de caracteres
        for (int i = 0; i < cantidadCaracteres; i++) {
            //se imprime el valor en consola para confirmar
            System.out.println("El valor en el validador es: " + String.valueOf(caracteresSeparados[i]));
            //se valida
                if(caracteresSeparados[i] == validas[0] || caracteresSeparados[i] == validas[1] || caracteresSeparados[i] == validas[2] || caracteresSeparados[i] == validas[3] || caracteresSeparados[i] == validas[4] || caracteresSeparados[i] == validas[5] || caracteresSeparados[i] == validas[6]) {
                //si el caracter es valido, se mantendra el valor de 400 en todo el ciclo
                    valido = 400;  
                }
                else
                {    
                    //si el caracter es invalido, el valor de valido sera cero, y se rompera el ciclo.
                valido = 0;
                break;
                }

            }
            System.out.println("El valor de valido es: " + valido);
          return valido;
        }
        
        
    }




