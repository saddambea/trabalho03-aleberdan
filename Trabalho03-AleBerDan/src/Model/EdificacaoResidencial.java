/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Bernardo
 */
public class EdificacaoResidencial extends Edificacao{
    private String nomeResponsavel;
    private String tipoImovel; //Apartamento / Casa / Sobrado
    private int numMoradores;
    
    public EdificacaoResidencial(String endereco, String nomeResponsavel, String tipoImovel, int numMoradores){
        super(endereco);
        this.setNomeResponsavel(nomeResponsavel);
        this.setTipoImovel(tipoImovel);
        this.setNumMoradores(numMoradores);        
    }

    public String getNomeResponsavel() {
        return nomeResponsavel;
    }

    public void setNomeResponsavel(String nomeResponsavel) {
        if(!nomeResponsavel.isEmpty())
            this.nomeResponsavel = nomeResponsavel;
    }

    public String getTipoImovel() {
        return tipoImovel;
    }

    public void setTipoImovel(String tipoImovel) {
        if(!tipoImovel.isEmpty())
            this.tipoImovel = tipoImovel;
    }

    public int getNumMoradores() {
        return numMoradores;
    }

    public void setNumMoradores(int numMoradores) {
        if(numMoradores > 0)
            this.numMoradores = numMoradores;
    }
    
   
    
    
}
