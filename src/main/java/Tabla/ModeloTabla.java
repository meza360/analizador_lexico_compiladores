/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tabla;

import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import javax.swing.text.TableView;

/**
 *
 * @author giova
 * Julio Alberto Farfan Ortiz 5990-16-9943
 */
public class ModeloTabla {
    
    public DefaultTableModel modelo; 
    public TableView.TableRow fila;
    public int con_filas;
    
     public void modeloTabla(){

    }
     
     public void insercionTabla(int token,int idClase,String cadena,boolean valido,DefaultTableModel modelo){
      
        TableColumn columna;
        modelo = new DefaultTableModel();
        String columnas[] = {"Id de clase","Cadena","Valido"};    
        modelo.setColumnIdentifiers(columnas);
    
        token = 1;idClase=100;cadena="holamundo";valido=true;
    
        modelo.addRow(new Object[]{token,idClase,cadena,valido});
     }
    
    
    
   
}
