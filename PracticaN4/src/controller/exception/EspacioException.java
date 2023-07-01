/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.exception;

/**
 *
 * @author alyce
 */
public class EspacioException extends Exception{
    
    public EspacioException(String msg) {
        super(msg);
    }
    public EspacioException() {
        super("EL arreglo esta lleno o posicion no valida");
    }
}
