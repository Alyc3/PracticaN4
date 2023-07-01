/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.ordenacion;

/**
 *
 * @author Edison
 */
public class Burbuja {
    
    public Object[]burbuja(Object[]aux,Integer tipo){
//        System.out.println(aux.getClass().getSimpleName());
        String tipoDato = aux[0].getClass().getSuperclass().getSimpleName();
        if(tipoDato.equalsIgnoreCase("Object")){
            tipoDato = aux[0].getClass().getSuperclass().getSimpleName();
        }
        System.out.println(tipoDato);
        for (int i = 1; i < aux.length; i++) {
            for (int j = aux.length -1; j >= i; j--) {
                //System.out.println("TIPOS DE DATOS---" + aux[0].getClass());
                if (tipo == 0) {
                    if(tipoDato.equalsIgnoreCase("String")){
                        if(aux[j].toString().compareToIgnoreCase(aux[j-1].toString())< 0){
                        aux = intercambio((String[])aux, j);
                        }
                    }else if(tipoDato.equalsIgnoreCase("Number")){
                        if (((Number)aux[j]).doubleValue()<((Number)aux[j-1]).doubleValue()){
                        aux = intercambioI((Number[])aux, j);
                    }
                  }
                }else{
                    if(tipoDato.equalsIgnoreCase("String")){
                        if(aux[j].toString().compareToIgnoreCase(aux[j-1].toString())> 0){
                        aux = intercambio((String[])aux, j);
                        }
                    }else if(tipoDato.equalsIgnoreCase("Number")){
                        if (((Number)aux[j]).doubleValue()>((Number)aux[j-1]).doubleValue()){
                        aux = intercambioI((Number[])aux, j);
                    }
                  }
             }             
           }
        }
        return aux;
    }
    
//    public String[]burbuja(String[]aux,Integer tipo){
//        for (int i = 1; i < aux.length; i++) {
//            for (int j = aux.length -1; j >= i; j--) {
//                if (tipo == 0) {
//                    if (aux[j].compareTo(aux[j-1]) <0){
//                        aux = intercambio(aux, j);
//                    }
//                }else{
//                    if (aux[j].compareTo(aux[j-1]) > 0) {
//                     aux = intercambio(aux,j);
//                }
//             }             
//           }
//        }
//        return aux;
//    }
//    
//     public Integer[]burbuja(Integer[]aux,Integer tipo){
//        for (int i = 1; i < aux.length; i++) {
//            for (int j = aux.length -1; j >= i; j--) {
//                if (tipo == 0) {
//                    if (aux[j].compareTo(aux[j-1]) <0){
//                        aux = intercambioI(aux, j);
//                    }
//                }else{
//                    if (aux[j].compareTo(aux[j-1]) > 0) {
//                     aux = intercambioI(aux,j);
//                }
//             }             
//           }
//        }
//        return aux;
//    }
    
    private Number[] intercambioI (Number []aux, Integer j ){
        Number a = aux[j-1];
        aux[j-1]= aux[j];
        aux[j] = a;
        return aux;
    }
    private String[] intercambio (String []aux, Integer j ){
        String a = aux[j-1];
        aux[j-1]= aux[j];
        aux[j] = a;
        return aux;
    }
}
