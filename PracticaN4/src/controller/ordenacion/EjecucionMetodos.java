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
public class EjecucionMetodos {

    public static Integer ASCENDENTE = 0;
    public static Integer DESCENDENTE = 1;

    public void imprimir(Object[] m) {
        System.out.println("IMPRIMIR MATRIZ");
        for (int i = 0; i < m.length; i++) {
            System.out.print(m[i].toString() + " ,");
        }
        System.out.println("\n FIN---------------");
    }

    public static void main(String[] args) {
//        Double[] m = new Double[1500];
//        Double[] n = new Double[1500];
        Integer[] matriz = new Integer[100];
        for (int i = 0; i < matriz.length; i++) {
            double mn = (Math.random() * 100);
//            m[i] = mn;
//            n[i] = mn;
            matriz[i] =(int)(Math.random() * 1000);
        }
//        for (int i = 0; i < m.length; i++) {
//            m[i] = (Math.random() * 1000);
//        }

        EjecucionMetodos em = new EjecucionMetodos();
        //em.imprimir(m);
//        Burbuja b = new Burbuja();
//        long startTime = System.currentTimeMillis();
//         m =(Double[])b.burbuja(m, ASCENDENTE);
//         long finalTime = System.currentTimeMillis()-startTime;
//         System.out.println("TIEMPO BURBUJA: "+ finalTime);
//        Integer cond = 1;
//        
//         
//        System.out.println("BURBUJA");
//        em.imprimir(m);
//        ///////////////////////////
////         String[] n = new String[20];
////         for (int i = 0; i < m.length; i++) {
////            m[i] = (int)(Math.random()*1000);
////        }
//
//        String[] p = {"hola", "Alyce", "W", "ji", "juan", "erick", "vivi", "elian"};
//        em.imprimir(p);
//        p = (String[])b.burbuja(n, ASCENDENTE);
//        em.imprimir(p);
        Insercion i = new Insercion();
        em.imprimir(matriz);
        matriz = i.insercionT(matriz,EjecucionMetodos.ASCENDENTE);
        em.imprimir(matriz);
    }

}
