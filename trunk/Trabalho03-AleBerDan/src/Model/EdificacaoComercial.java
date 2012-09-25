/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Bernardo
 */
public class EdificacaoComercial extends Edificacao{
    private String nomeEmpresa;
    private String ramoAtuacao;
    
    public EdificacaoComercial(String endereco, String numeroEndereco, String nomeEmpresa, String ramoAtuacao){
        super(endereco, numeroEndereco);
        this.setNomeEmpresa(nomeEmpresa);
        this.setRamoAtuacao(ramoAtuacao);
    }
    
    public String getNomeEmpresa() {
        return nomeEmpresa;
    }

    public void setNomeEmpresa(String nomeEmpresa) {
        if(!nomeEmpresa.isEmpty())
            this.nomeEmpresa = nomeEmpresa;
    }

    public String getRamoAtuacao() {
        return ramoAtuacao;
    }

    public void setRamoAtuacao(String ramoAtuacao) {
        if(!ramoAtuacao.isEmpty())
            this.ramoAtuacao = ramoAtuacao;
    }
    
    
    
}
