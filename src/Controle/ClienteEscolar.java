/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Controle;
import javax.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorValue("2")
@Table(name="Escolar")
public class ClienteEscolar extends Cliente {
    
    public ClienteEscolar() {
        super.setTipo(2);
    }
    
    private String nomeResp;
    
    private String cpfResp;
    
    private double mensalidade;
   
    private String escola;

    public String getNomeResp() {
        return nomeResp;
    }

    public void setNomeResp(String nomeResp) {
        this.nomeResp = nomeResp;
    }

    public String getCpfResp() {
        return cpfResp;
    }

    public void setCpfResp(String cpfResp) {
        this.cpfResp = cpfResp;
    }

    public double getMensalidade() {
        return mensalidade;
    }

    public void setMensalidade(double mensalidade) {
        this.mensalidade = mensalidade;
    }

    public String getEscola() {
        return escola;
    }

    public void setEscola(String escola) {
        this.escola = escola;
    }
    
    
    
}
