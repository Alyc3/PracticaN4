/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Edison
 */
public class PoblacionDatos {
    
    private Integer poblacion;
    private String pais;

    

    public Integer getPoblacion() {
        return poblacion;
    }

    public void setPoblacion(Integer poblacion) {
        this.poblacion = poblacion;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }
    
    

    @Override
    public String toString() {
        return poblacion +"en el "+ pais  ;
    }
    
    
   
}
