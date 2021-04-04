/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Separador;

import java.util.StringTokenizer;
import Analizador.*;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author GIOVANI DAVID MEZA POGGIO 5990-18-14676 SECCION A
 * Julio Alberto Farfan Ortiz 5990-16-9943 SECCION A
 * Hanier Iván Cordero Morales 5990-15-13370 SECCION A
 * Armando Otoniel Pineda Perez 5990-17-672 SECCION A
 */

public class Separador {
    
    public Reservadas enlaceReservadas;
    public Separador(){
    
    }
    
    public int separadorLexico(String cadenaRecibida,DefaultTableModel modelo2){
        modelo2.setNumRows(0);
        
        Reservadas enlaceReservadas = new Reservadas();
        Puntuacion enlacePuntuacion = new Puntuacion();
        OperadorAritmetico enlaceOperadorAritmetico = new OperadorAritmetico();
        validador enlaceValidacion = new validador();
        //se crean los elementos para separar las cadenas
        String[] cuerdas;// = new String[20];
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
                 //se enviaria cuerdas[i] dentro del primer for
                 //primer enlace para validar si es una palabra reservada
                 
                 //enlaceReservadas.aceptacion(cuerdas[i].toString());
                 //Si se necesita que se envien los caracteres inviduales
                 //se envian caracteres[j] dentro de este for
             }
                 if (enlaceReservadas.aceptacion(cuerdas[i]) == 100) {
                     modelo2.addRow(new Object[]{100,cuerdas[i],"Valida,reservada"});
                 }
                 else if(enlaceOperadorAritmetico.aceptacion(cuerdas[i]) == 200){
                  modelo2.addRow(new Object[]{200,cuerdas[i],"Operador"});
                 }
                 else if(enlacePuntuacion.aceptacion(cuerdas[i]) == 300){
                  modelo2.addRow(new Object[]{300,cuerdas[i],"Puntuacion"});
                 }    
                 else if(enlaceValidacion.aceptacion(cuerdas[i], contador2) == 400){
                       modelo2.addRow(new Object[]{400,cuerdas[i],"Valida"});
                    }
                 else 
                 {
                    modelo2.addRow(new Object[]{500,cuerdas[i],"No Valida"});
                 }

             //este for no deberia de tener otra funcion de momento
        }
          return cuerdas.length; 
    }
    
}