/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Controle;
import javax.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorValue("1")

public class Motorista extends Funcionario {
    public Motorista() {
        super.setTipo(1);
    }
    
    @Column(nullable = false, length = 2)
    private int tipoHabilitacao;

    public int getTipoHabilitacao() {
        return tipoHabilitacao;
    }

    public void setTipoHabilitacao(int tipoHabilitacao) {
        this.tipoHabilitacao = tipoHabilitacao;
    }
    
}
