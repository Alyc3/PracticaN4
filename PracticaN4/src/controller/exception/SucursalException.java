/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.exception;

/**
 *
 * @author Edison
 */
public class SucursalException extends Exception{
    
    public SucursalException(String msg) {
        super(msg);
    }
    public SucursalException() {
        super("La sucursal que desea acceder no existe o ya tiene sus valores actualizados");
    }
}
