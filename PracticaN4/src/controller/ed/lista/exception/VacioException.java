/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.ed.lista.exception;

/**
 *
 * @author alyce
 */
public class VacioException extends Exception {

    /**
     * Creates a new instance of <code>VacioException</code> without detail
     * message.
     */
    public VacioException() {
        super("La lista esta vacia cojudo");
    }

    /**
     * Constructs an instance of <code>VacioException</code> with the specified
     * detail message.
     *
     * @param msg the detail message.
     */
    public VacioException(String msg) {
        super(msg);
    }
}
