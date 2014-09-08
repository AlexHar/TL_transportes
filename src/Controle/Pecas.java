/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Controle;

import Modelo.PecasDAO;
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
 * @author Guilherme
 */
@Entity
public class Pecas implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    private String nomePeca;
    private String tipoPeca;
    private int codigoPeca;
    private double valorPeca;
    
    static List<Pecas> pecas = new ArrayList();

  

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNomePeca() {
        return nomePeca;
    }

    public void setNomePeca(String nomePeca) {
        this.nomePeca = nomePeca;
    }

    public String getTipoPeca() {
        return tipoPeca;
    }

    public void setTipoPeca(String tipoPeca) {
        this.tipoPeca = tipoPeca;
    }

    public int getCodigoPeca() {
        return codigoPeca;
    }

    public void setCodigoPeca(int codigoPeca) {
        this.codigoPeca = codigoPeca;
    }

    public double getValorPeca() {
        return valorPeca;
    }

    public void setValorPeca(double valorPeca) {
        this.valorPeca = valorPeca;
    }
    
    public void cadastrarPeca(Pecas P) throws SQLException, ClassNotFoundException, Exception {
        PecasDAO.cadastrar(P);
    }

    public void excluirPeca(Pecas P) throws SQLException, ClassNotFoundException {
        PecasDAO.excluir(P);
    }

    public void atualizarPeca(Pecas P) throws SQLException, ClassNotFoundException {
        PecasDAO.atualizar(P);
    }
    
    public static Collection consultarPeca(){
        pecas = (List<Pecas>) PecasDAO.consultar();
        return pecas;
    }
    
    public static Collection consultarPecaCodigo(String codigo){
        pecas = (List<Pecas>) PecasDAO.consultarCodigo(codigo);
        return pecas;
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
        if (!(object instanceof Pecas)) {
            return false;
        }
        Pecas other = (Pecas) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Modelo.Pecas[ id=" + id + " ]";
    }
    
}