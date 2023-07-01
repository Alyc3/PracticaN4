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
public class Insercion {

    public Integer[] insercionT(Integer[] m, Integer tipo) {
        for (int i = 1; i < m.length; i++) {
            Integer key = m[i];
            int j = i - 1;
            boolean band = m[j] > key;
            if (tipo == 1) {
                band = m[j] < key;
            }
            switch (tipo) {
                case 0:
                    while (j >= 0 && m[j] > key) {
                        m[j + 1] = m[j];
                        j = j - 1;
                    }
                    break;
                case 1:
                    while (j >= 0 && m[j] > key) {
                        m[j + 1] = m[j];
                        j = j - 1;
                    }
                    break;

            }


            m[j + 1] = key;
        }
        return m;
    }

    public Object[] insercion(Object[] m, Integer tipo) {
        String tipoDato = m[0].getClass().getSuperclass().getSimpleName();
        if (tipoDato.equalsIgnoreCase("Object")) {
            tipoDato = m[0].getClass().getSuperclass().getSimpleName();
        }
        switch (tipo) {
            case 0:
                switch (tipoDato) {
                    case "Number":
                        for (int i = 1; i < m.length; i++) {
                            Object key = m[i];
                            int j = i - 1;
                            while (j >= 0 && ((Number) m[j]).doubleValue() > ((Number) key).doubleValue()) {
                                m[j + 1] = m[j];
                                j = j - 1;
                            }

                            m[j + 1] = key;
                        }

                        break;
                    case "String":
                        for (int i = 1; i < m.length; i++) {
                            Object key = m[i];
                            int j = i - 1;
                            while (j >= 0 && m[j].toString().compareToIgnoreCase(key.toString()) > 0) {
                                m[j + 1] = m[j];
                                j = j - 1;
                            }
                            m[j + 1] = key;
                        }
                        break;
                }
            case 1:
                switch (tipoDato) {
                    case "Number":
                        for (int i = 1; i < m.length; i++) {
                            Object key = m[i];
                            int j = i - 1;
                            while (j >= 0 && ((Number) m[j]).doubleValue() < ((Number) key).doubleValue()) {
                                m[j + 1] = m[j];
                                j = j - 1;
                            }
                            m[j + 1] = key;
                        }
                        break;
                    case "String":
                        for (int i = 1; i < m.length; i++) {
                            Object key = m[i];
                            int j = i - 1;
                            while (j >= 0 && m[j].toString().compareToIgnoreCase(key.toString()) < 0) {
                                m[j + 1] = m[j];
                                j = j - 1;
                            }
                            m[j + 1] = key;
                        }
                        break;
                }

        }

        return m;
    }

}
