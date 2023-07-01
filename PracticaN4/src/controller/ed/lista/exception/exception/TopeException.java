/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.ed.lista.exception.exception;

/**
 *
 * @author alyce
 */
public class TopeException  extends Exception{
   

    /**
     * Constructs an instance of <code>VacioException</code> with the specified
     * detail message.
     *
     * @param msg the detail message.
     */
    public TopeException(String msg) {
        super(msg);
    }
    public TopeException() {
        super("La pila esta llena");
    }

}
