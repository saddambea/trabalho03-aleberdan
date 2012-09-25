/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Bernardo
 */
public class CategoriaComodo {
    
    private String descricaoComodo;
    private Double potenciaMetroQuad;
    
    public CategoriaComodo(String descricaoComodo, Double potenciaMetroQuad){
        this.setDescricaoComodo(descricaoComodo);
        this.setPotenciaMetroQuad(potenciaMetroQuad);
    }
    
    /**
     * @return the descricaoComodo
     */
    public String getDescricaoComodo() {
        return descricaoComodo;
    }

    /**
     * @param descricaoComodo the descricaoComodo to set
     */
    public void setDescricaoComodo(String descricaoComodo) {
        if(!descricaoComodo.isEmpty())
            this.descricaoComodo = descricaoComodo;
    }

    /**
     * @return the potenciaMetroQuad
     */
    public Double getPotenciaMetroQuad() {
        return potenciaMetroQuad;
    }

    /**
     * @param potenciaMetroQuad the potenciaMetroQuad to set
     */
    public void setPotenciaMetroQuad(Double potenciaMetroQuad) {
        if(potenciaMetroQuad > 0.0)
            this.potenciaMetroQuad = potenciaMetroQuad;
    }
    
    
}
