/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controle;

import Modelo.VeiculoDAO;
import java.io.Serializable;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author guitonsic
 */
@Entity
public class Veiculo implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String placa;

    private int capacidade;

    private int ano;

    private String modelo;

    private String cor;

    private String tipo;
    
    static List<Veiculo> veiculos = new ArrayList();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Veiculo(Long id, String placa, int capacidade, int ano, String modelo, String cor, String tipo) {
        this.id = id;
        this.placa = placa;
        this.capacidade = capacidade;
        this.ano = ano;
        this.modelo = modelo;
        this.cor = cor;
        this.tipo = tipo;
    }

    public Veiculo() {
    }
    
    
    public void cadastrarVeiculo(Veiculo V) throws SQLException, ClassNotFoundException {
        VeiculoDAO.cadastrar(V);
    }
    
    public void excluirVeiculo(Veiculo V) throws SQLException, ClassNotFoundException {
        VeiculoDAO.excluir(V);
    }
    
    public static Collection consultarVeiculo(){
        veiculos = (List<Veiculo>) VeiculoDAO.consultar();
        return veiculos;
    }
    
    public static Collection consultarVeiculoPlaca(String placa) {
        veiculos = (List<Veiculo>) VeiculoDAO.consultarPlaca(placa);
        return veiculos;
    }
    
    //public void atualizarVeiculo(Veiculo V) throws SQLException, ClassNotFoundException {
    //    VeiculoDAO.atualizar(V);
    //}
    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Veiculo)) {
            return false;
        }
        Veiculo other = (Veiculo) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Modelo.Veiculo[ id=" + id + " ]";
    }

}
