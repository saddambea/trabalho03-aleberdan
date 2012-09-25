/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Bernardo
 */
public class Comodo extends CategoriaComodo{
    private double largura;
    private double comprimento;
    
    
    public Comodo(String descricaoComodo, Double potenciaMetroQuad, double largura, double comprimento){
        super(descricaoComodo, potenciaMetroQuad);
        this.setLargura(largura);
        this.setComprimento(comprimento);
    }
    
    
    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        if(largura > 0.0)
            this.largura = largura;
    }

    public double getComprimento() {
        return comprimento;
    }

    public void setComprimento(double comprimento) {
        if(comprimento > 0.0)
            this.comprimento = comprimento;
    }   
    
    public double getAreaComodo(){
        return this.getLargura() * this.getComprimento();
    }
    
    public double getPotenciaCalculada(){
        return 0.0;
    }
    
    public double getPotenciaIluminacao(){
        return 0.0;
    }
    
    public int getMinLampadas(){
        return 0;
    }    
}
