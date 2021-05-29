/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AnalizadorSemantico;


import java.util.List;
import java.util.ArrayList;
/**
 *
 * @author giova
 */
public class AnalizadorSemantico {
    
    List listaRecibida;
    public AnalizadorSemantico(){
    
    }
    
    public AnalizadorSemantico(List lista){
    this.listaRecibida = lista;
    }

    public List getListaRecibida() {
        return listaRecibida;
    }

    public void setListaRecibida(List listaRecibida) {
        this.listaRecibida = listaRecibida;
    }
    
    
    
    public void analizador(List lista){
        this.setListaRecibida(lista);
        //lista local
        int contParenInicio = 0;
        int contParenFin = 0;
        //this.listaRecibida = lista;
        String[] vectorSimbolos = new String[lista.size()];
        String temp;
        
        //se inician los caracteres necesarios
//        for (int i = 0; i < lista.size(); i++) {
//            temp = lista.toString();
//            vectorSimbolos = temp.split(",");
//        }

        for (int i = 0; i < lista.size(); i++) {
            vectorSimbolos[i] = lista.get(i).toString();
        }
        
    
    //for para verificar la pariedad de simbolos
        for (int i = 0; i < lista.size(); i++) {
            if (vectorSimbolos[i].matches("\\(")) {
                contParenInicio++;
            }
            else if(vectorSimbolos[i].matches("\\)")){
                contParenFin++;
            }
        }
        
        try {
             if (contParenInicio != contParenFin) {
                 System.out.println("No se ha impreso ninguna lista");
                generadorVariables(lista);
             }
            else{
                 generadorVariables(lista);
                }
        } catch (Exception error) {
            System.out.println("Error en la generacion de respuesta" + error);
            error.printStackTrace();
        }
       
        
    }
    
    public void generadorVariables(List lista){
        List listaCompleta = new ArrayList<>();
        
        int contador1;
        String nombre = "x";
        double valor = 0.0;
        
        for (contador1 = 0; contador1 < lista.size(); contador1++) {
            if (lista.get(contador1) == "\\=") {
                nombre = lista.get(contador1 - 1).toString();
                valor = Double.parseDouble(lista.get(contador1 + 1).toString());
                listaCompleta.add(nombre + valor);
                System.out.println("El valor de la lista completa de variables es: " + listaCompleta.get(contador1));
                contador1++;
            }    
        }
        
        
    }
    
}
