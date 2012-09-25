/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;

/**
 *
 * @author Bernardo
 */
public abstract class Edificacao {    
    private String endereco;
    
    private ArrayList<Comodo> listaComodos = new ArrayList();
    
    
    public Edificacao(String endereco){
        this.setEndereco(endereco);
    }  

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        if(!endereco.isEmpty()) {
            this.endereco = endereco;
        }
    }

    /**
     * @return the listaComodos
     */
    public ArrayList<Comodo> getListaComodos() {
        return listaComodos;
    }

    /**
     * @param listaComodos the listaComodos to set
     */
    public void setListaComodos(ArrayList<Comodo> listaComodos) {
        this.listaComodos = listaComodos;
    }
          
    
}
