/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Controle;
import Modelo.MotoristaDAO;
import java.io.Serializable;
import java.sql.SQLException;
import javax.persistence.*;

@Entity
@Table (name = "Motorista")

public class Motorista implements Serializable {

    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    
    private String nome;

    private int rg;

    private int cpf;

    private String endereco;
    
    private int nEndereco;

    private String cidade;

    private String estado;

    private int telefone;

    private String nascimento;
    
    private double salario;
    
    private int numHabilitacao;
    
    private String tipoHabilitacao;

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getNumHabilitacao() {
        return numHabilitacao;
    }

    public void setNumHabilitacao(int numHabilitacao) {
        this.numHabilitacao = numHabilitacao;
    }
    
    public String getTipoHabilitacao() {
        return tipoHabilitacao;
    }

    public void setTipoHabilitacao(String tipoHabilitacao) {
        this.tipoHabilitacao = tipoHabilitacao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getRg() {
        return rg;
    }

    public void setRg(int rg) {
        this.rg = rg;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getnEndereco() {
        return nEndereco;
    }

    public void setnEndereco(int nEndereco) {
        this.nEndereco = nEndereco;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public String getNascimento() {
        return nascimento;
    }

    public void setNascimento(String nascimento) {
        this.nascimento = nascimento;
    }

    public void cadastrarMotorista(Motorista P) throws SQLException, ClassNotFoundException {
        MotoristaDAO.cadastrar(P);
    }

    public void excluirFuncionario(Motorista P) throws SQLException, ClassNotFoundException {
        MotoristaDAO.excluir(P);
    }

    public void consultarMotorista(Motorista P) throws SQLException, ClassNotFoundException {
        MotoristaDAO.consultar(P);
    }
    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Motorista)) {
            return false;
        }
        Motorista other = (Motorista) object;
        return (this.id != null || other.id == null) && (this.id == null || this.id.equals(other.id));
    }

    @Override
    public String toString() {
        return "Modelo.Motorista[ id=" + id + " ]";
    }
    
    
}
