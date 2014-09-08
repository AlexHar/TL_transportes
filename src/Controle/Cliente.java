/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controle;

import Modelo.ClienteDAO;
import java.io.Serializable;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

/**
 *
 * @author guitonsic
 */
@Entity
@Table(name="Cliente")
@PrimaryKeyJoinColumn (name="id_pessoa")
public class Cliente extends Pessoa implements Serializable {

    private static final long serialVersionUID = 1L;
    
    private String servico;
    
    private int tipo;

    public Cliente() {
    }

    
    
    public Cliente(String servico, int tipo) {
        this.servico = servico;
        this.tipo = tipo;
    }

    public Cliente(String servico, int tipo, Long id, String nome, int rg, int cpf, String endereco, int nEndereco, String cidade, String estado, int telefone, String nascimento, String tipoPessoa) {
        super(id, nome, rg, cpf, endereco, nEndereco, cidade, estado, telefone, nascimento, tipoPessoa);
        this.servico = servico;
        this.tipo = tipo;
    }

    
    
    static List<Veiculo> clientes = new ArrayList();

    public String getServico() {
        return servico;
    }

    public void setServico(String servico) {
        this.servico = servico;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }
  
    public void cadastrarCliente(Cliente P) throws SQLException, ClassNotFoundException, Exception {
        ClienteDAO.cadastrar(P);
    }

    public void excluirCliente(Cliente P) throws SQLException, ClassNotFoundException {
        ClienteDAO.excluir(P);
    }

    public static Collection consultarCliente(){
        clientes = (List<Veiculo>) ClienteDAO.consultar();
        return clientes;
    }

    public void atualizarCliente(Cliente P) throws SQLException, ClassNotFoundException {
        ClienteDAO.atualizar(P);
    }
/*
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id_cliente != null ? id_cliente.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cliente)) {
            return false;
        }
        Cliente other = (Cliente) object;
        if ((this.id_cliente == null && other.id_cliente != null) || (this.id_cliente != null && !this.id_cliente.equals(other.id_cliente))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Modelo.Pessoa[ id=" + id_cliente + " ]";
    }*/

}
