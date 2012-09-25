/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Bernardo
 */
public abstract class Edificacao {    
    private String endereco;
    private String numeroEndereco; //String pois, segundo exemplo, número pode ser 1500/101
    
    
    public Edificacao(String endereco, String numeroEndereco){
        this.setEndereco(endereco);
        this.setNumeroEndereco(numeroEndereco);
    }
  

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        if(!endereco.isEmpty())
            this.endereco = endereco;
    }

    public String getNumeroEndereco() {
        return numeroEndereco;
    }

    public void setNumeroEndereco(String numeroEndereco) {
        if(!numeroEndereco.isEmpty())
            this.numeroEndereco = numeroEndereco;
    }
    
    
    
    
}
