/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import controller.ed.lista.ListaEnlazada;
import controller.ed.lista.NodoLista;
import controller.ed.lista.exception.PosicionException;
import controller.ed.lista.exception.VacioException;
import java.util.Locale;
import java.util.Random;
import modelo.PoblacionDatos;

/**
 *
 * @author Edison
 */
public class PoblacionControl {

    ListaEnlazada<PoblacionDatos> pc = new ListaEnlazada<>();
    PoblacionDatos poblacion;

    public PoblacionControl() {
        //se utiliza para generar datos aleatorios
        Random random = new Random();
        // en el for se le da la cantidad de datos a generar

        for (int i = 0; i < 15000; i++) {
            //se genera una nueva lista enlazada de poblacion datos
            poblacion = new PoblacionDatos();
            //obtiene la cantidad de datos de poblacion con un formato de hasta 1000000000 de cantidad
            poblacion.setPoblacion(random.nextInt(1000000000));
            //se llama al metodo generarPaises para que se presente igual que la poblacion
            poblacion.setPais(generarPaisesA());
            //se llama a la lista enlazada de poblacion datos y se utiliza el metodo insertar
            pc.insertar(poblacion);
        }
    }

    public ListaEnlazada<PoblacionDatos> getPc() {
        //si pc es nulo se genera una nueva lista enlazada
        if (pc == null) {
            pc = new ListaEnlazada<>();
        }
        return pc;
    }

    public void setPc(ListaEnlazada<PoblacionDatos> pc) {
        this.pc = pc;
    }

    public String generarPaisesA() {
        String countryName = "Ecuador";
        String[] isoCountries = Locale.getISOCountries();
        Random random = new Random();
        for (int i = 0; i < pc.size(); i++) {
            int randomIndex = random.nextInt(isoCountries.length);

            // Obtener el código de país aleatorio
            String countryCode = isoCountries[randomIndex];

            // Crear un objeto Locale utilizando el código de país
            Locale randomLocale = new Locale(" ", countryCode);

            // Obtener el nombre del país en el idioma predeterminado del sistema
            countryName = randomLocale.getDisplayCountry();
            return countryName;
        }
        return countryName;

    }

    public ListaEnlazada<PoblacionDatos> quicksortAs(ListaEnlazada<PoblacionDatos> lista) {
        //si la lista es nula o la lista es igual a 0 se retorna la lista enlazada
        if (lista == null || lista.size() == 0) {
            return lista;
        }
        //se inicializa un arreglo de la clase modelo que antes era una lista enlazada pero se utiliza el metodo to array para convertirlo a arreglo
        PoblacionDatos[] arreglo = lista.toArray();
        //se llama al metodo ordenarAs para ordenarlo
        ordenarAs(arreglo, 0, arreglo.length - 1);
        //se retorna el arreglo convirtiendolo nuevamente a lista con el metodo toList
        return lista.toList(arreglo);
    }

    private static void ordenarAs(PoblacionDatos[] lista, int bajo, int alto) {
        if (bajo < alto) {//si bajo es menor a alto
            int particionIndex = particionAs(lista, bajo, alto);
            ordenarAs(lista, bajo, particionIndex - 1);
            ordenarAs(lista, particionIndex + 1, alto);
        }
    }

    private static int particionAs(PoblacionDatos[] lista, int bajo, int alto) {
        PoblacionDatos pivot = lista[alto];
        int i = bajo - 1;
        for (int j = bajo; j < alto; j++) {
            //se empieza a ordenar de manera ascendente haciendo la comparacion
            if (lista[j].getPoblacion() < pivot.getPoblacion()) {
                //si el arreglo lista en la posicion j es menor a la poblacion del pivot
                i++;
                //se aumenta
                swapAs(lista, i, j);
            }
        }
        swapAs(lista, i + 1, alto);
        return i + 1;
    }

    private static void swapAs(PoblacionDatos[] lista, int i, int j) {
        PoblacionDatos temp = lista[i];
        lista[i] = lista[j];
        lista[j] = temp;
    }

    public ListaEnlazada<PoblacionDatos> quicksortDes(ListaEnlazada<PoblacionDatos> lista) {
        if (lista == null || lista.size() == 0) {
            return lista;
        }
        PoblacionDatos[] arreglo = lista.toArray();
        ordenarDes(arreglo, 0, arreglo.length - 1);
        return lista.toList(arreglo);
    }

    private static void ordenarDes(PoblacionDatos[] lista, int bajo, int alto) {
        if (bajo < alto) {
            int particionIndex = particionDes(lista, bajo, alto);
            ordenarDes(lista, bajo, particionIndex - 1);
            ordenarDes(lista, particionIndex + 1, alto);
        }
    }

    private static int particionDes(PoblacionDatos[] lista, int bajo, int alto) {
        PoblacionDatos pivot = lista[alto];
        int i = bajo - 1;
        for (int j = bajo; j < alto; j++) {
            if (lista[j].getPoblacion() > pivot.getPoblacion()) {
                i++;
                swapDes(lista, i, j);
            }
        }
        swapDes(lista, i + 1, alto);
        return i + 1;
    }

    private static void swapDes(PoblacionDatos[] lista, int i, int j) {
        PoblacionDatos temp = lista[i];
        lista[i] = lista[j];
        lista[j] = temp;
    }

    //Algoritmo MergeSort....................................................................
    public ListaEnlazada<PoblacionDatos> mergeSortA(ListaEnlazada<PoblacionDatos> arr) {
        if (arr == null || arr.size() <= 1) {
            return arr;
        }
        PoblacionDatos[] temp = arr.toArray();
        PoblacionDatos[] aux = new PoblacionDatos[temp.length];

        for (int i = 0; i < temp.length; i++) {
            aux[i] = temp[i];
        }

        mergeSortA(temp, aux, 0, arr.size() - 1);
        return arr.toList(temp);
    }

    private static void mergeSortA(PoblacionDatos[] arr, PoblacionDatos[] temp, int left, int right) {

        if (left >= right) {
            return;
        }
        int mid = left + (right - left) / 2;
        mergeSortA(arr, temp, left, mid);
        mergeSortA(arr, temp, mid + 1, right);
        mergeA(arr, temp, left, mid, right);
    }

    private static void mergeA(PoblacionDatos[] arr, PoblacionDatos[] temp, int left, int mid, int right) {
        for (int i = left; i <= right; i++) {
            temp[i] = arr[i];
        }
        int i = left;
        int j = mid + 1;
        int k = left;
        while (i <= mid && j <= right) {
            if (temp[i].getPoblacion() < temp[j].getPoblacion()) {
                arr[k] = temp[i];
                i++;
            } else {
                arr[k] = temp[j];
                j++;
            }
            k++;
        }
        while (i <= mid) {
            arr[k] = temp[i];
            i++;
            k++;
        }

    }

    public ListaEnlazada<PoblacionDatos> mergeSortDe(ListaEnlazada<PoblacionDatos> arr) {
        if (arr == null || arr.size() <= 1) {
            return arr;
        }
        
        PoblacionDatos[] temp = arr.toArray();
        PoblacionDatos[] aux = new PoblacionDatos[temp.length];

        for (int i = 0; i  < temp.length; i++) {
            aux[i] = temp[i];
        }
        mergeSortDes(temp, aux, 0, arr.size() - 1);
        return arr.toList(temp);
    }

    private void mergeSortDes(PoblacionDatos[] arr, PoblacionDatos[] temp, int left, int right) {
        if (left >= right) {
            return;
        }
        int mid = left + (right - left) / 2;
        mergeSortDes(arr, temp, left, mid);
        mergeSortDes(arr, temp, mid + 1, right);
        mergeDes(arr, temp, left, mid, right);
    }

    private void mergeDes(PoblacionDatos[] arr, PoblacionDatos[] temp, int left, int mid, int right) {
        for (int i = left; i <= right; i++) {
            temp[i] = arr[i];
        }
        int i = left;
        int j = mid + 1;
        int k = left;
        while (i <= mid && j <= right) {
            if (temp[i].getPoblacion() > temp[j].getPoblacion()) {
                arr[k] = temp[i];
                i++;
            } else {
                arr[k] = temp[j];
                j++;
            }
            k++;
        }
        while (i <= mid) {
            arr[k] = temp[i];
            i++;
            k++;
        }

    }

}
