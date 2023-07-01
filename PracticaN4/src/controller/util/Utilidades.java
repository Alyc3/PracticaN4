/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.util;

import controller.ed.lista.exception.PosicionException;
import controller.ed.lista.exception.VacioException;
import java.util.Iterator;

/**
 *
 * @author alyce
 */
public class Utilidades {
    public static void imprimir(Object[]objs){
        System.out.println("Lista de "+objs.getClass().getSimpleName());
        for (Object o : objs) {
            System.out.println(o.toString());
        }
    }
    
    public static Boolean isNumber(Class clase){
        return clase.getSuperclass().getSimpleName().equalsIgnoreCase("Number");
    }
    
    public static Boolean isString(Class clase){
        return clase.getSimpleName().equalsIgnoreCase("String");
    }
    
    public static Boolean isCharacter(Class clase){
        return clase.getSimpleName().equalsIgnoreCase("Character");
    }
    
    public static Boolean isBoolean(Class clase){
        return clase.getSimpleName().equalsIgnoreCase("Boolean");
    }
    
    public static Boolean isPrimitive(Class clase){
        return clase.isPrimitive();
    }
    
     public static Boolean isObject(Class clase){
        return (!isPrimitive(clase)&&!isBoolean(clase)&&!isCharacter(clase)&&!isNumber(clase)&&!isString(clase));
    }
    
}
