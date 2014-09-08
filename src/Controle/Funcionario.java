/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controle;

import Modelo.FuncionarioDAO;
import java.io.Serializable;
import java.sql.SQLException;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

/**
 *
 * @author guitonsic
 */
@Entity
@Table (name="funcionario")
@PrimaryKeyJoinColumn (name="id_pessoa")
public class Funcionario extends Pessoa implements Serializable {

    private static final long serialVersionUID = 1L;
    
    private int tipo;

    private String cargo;

    private double salario;

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }
    
    public void cadastrarFuncionario(Funcionario P) throws SQLException, ClassNotFoundException {
        FuncionarioDAO.cadastrar(P);
    }

    public void excluirFuncionario(Funcionario P) throws SQLException, ClassNotFoundException {
        FuncionarioDAO.excluir(P);
    }

    public void consultarFuncionario(Funcionario P) throws SQLException, ClassNotFoundException {
        FuncionarioDAO.consultar(P);
    }
/*
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Funcionario)) {
            return false;
        }
        Funcionario other = (Funcionario) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Modelo.Funcion\u00e1rio[ id=" + id + " ]";
    }*/

}
