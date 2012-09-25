/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Model.CategoriaComodo;
import Model.Edificacao;
import Model.EdificacaoComercial;
import Model.EdificacaoResidencial;
import java.util.ArrayList;

/**
 *
 * @author Bernardo
 */
public class Controle {
 
    //uma lista de categorias
    private ArrayList<CategoriaComodo> listaCategoria = new ArrayList();
    private ArrayList<Edificacao> listaEdificacao = new ArrayList();
    
    public Controle() {
        
    }

    /**
     * @return the listaCategoria
     */
    public ArrayList<CategoriaComodo> getListaCategoria() {
        return listaCategoria;
    }

    /**
     * @param listaCategoria the listaCategoria to set
     */
    public CategoriaComodo addCategoria(String descricao, Double potencia) {
        CategoriaComodo categoria = new CategoriaComodo(descricao, potencia);
        listaCategoria.add(categoria);
        return categoria;
    }

    /**
     * @return the listaEdificacao
     */
    public ArrayList<Edificacao> getListaEdificacao() {
        return listaEdificacao;
    }

    /**
     * @param 
     */
    //comercial
    public void addEdificacao(String nome_, String endereco_, String ramo_) {
        EdificacaoComercial edificacao = new EdificacaoComercial(endereco_, nome_, ramo_);
        listaEdificacao.add(edificacao);
    }
    
    //residencial
    public void addEdificacao(String nome_, String endereco_, String tipoImovel_, int nroMoradores_) {
        EdificacaoResidencial edificacao = new EdificacaoResidencial(endereco_, nome_, tipoImovel_, nroMoradores_);
        listaEdificacao.add(edificacao);
    }
    
    
}