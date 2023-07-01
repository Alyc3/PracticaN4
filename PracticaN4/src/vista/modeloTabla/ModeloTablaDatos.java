/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista.modeloTabla;

import controller.ed.lista.ListaEnlazada;
import javax.swing.table.AbstractTableModel;
import modelo.PoblacionDatos;

/**
 *
 * @author Edison
 */
public class ModeloTablaDatos extends AbstractTableModel{
    
    private ListaEnlazada<PoblacionDatos> lista = new ListaEnlazada();

    public ListaEnlazada<PoblacionDatos> getLista() {
        return lista;
    }

    public void setLista(ListaEnlazada<PoblacionDatos> lista) {
        this.lista = lista;
    }
    
    

    @Override
    public int getRowCount() {
        return lista.size();
    }

    @Override
    public int getColumnCount() {
        return 2;
    }
    
    @Override
    public String getColumnName(int i) {
        
        switch(i) {
            case 0: return "Poblacion";   
            case 1: return "Pais";
 
            default: return null;
        }
    }

    @Override
    public Object getValueAt(int i, int i1) {
        PoblacionDatos s = null;
        try {
            s = lista.get(i);
        } catch (Exception e) {
        }
        switch(i1) {
            
            case 0: return (s != null)? s.getPoblacion():"NO DEFINIDO";
            case 1: return (s != null)? s.getPais():"NO DEFINIDO";
           
            default: return null;
        }
    }
    
}
