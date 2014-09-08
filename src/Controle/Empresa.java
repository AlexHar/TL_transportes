/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Controle;

import Modelo.EmpresaDAO;
import java.sql.SQLException;

/**
 *
 * @author Lailson
 */
public class Empresa {
    
    private String nome;
    private String razao;
    private int cnpj;
    private String telefone;
    private String endereco;
    private int numero;
    private String cidade;
    private String estado;
    
    private String proprietario;
    private int rgProp;
    private int cpfProp;

    public Empresa() {
    }

    public Empresa(String nome, String razao, int cnpj, String telefone, String endereco, int numero, String cidade, String estado, String proprietario, int rgProp, int cpfProp) {
        this.nome = nome;
        this.razao = razao;
        this.cnpj = cnpj;
        this.telefone = telefone;
        this.endereco = endereco;
        this.numero = numero;
        this.cidade = cidade;
        this.estado = estado;
        this.proprietario = proprietario;
        this.rgProp = rgProp;
        this.cpfProp = cpfProp;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRazao() {
        return razao;
    }

    public void setRazao(String razao) {
        this.razao = razao;
    }

    public int getCnpj() {
        return cnpj;
    }

    public void setCnpj(int cnpj) {
        this.cnpj = cnpj;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
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

    public String getProprietario() {
        return proprietario;
    }

    public void setProprietario(String proprietario) {
        this.proprietario = proprietario;
    }

    public int getRgProp() {
        return rgProp;
    }

    public void setRgProp(int rgProp) {
        this.rgProp = rgProp;
    }

    public int getCpfProp() {
        return cpfProp;
    }

    public void setCpfProp(int cpfProp) {
        this.cpfProp = cpfProp;
    }

    @Override
    public String toString() {
        return "Empresa{" + "nome=" + nome + ", razao=" + razao + ", cnpj=" + cnpj + ", telefone=" + telefone + ", endereco=" + endereco + ", numero=" + numero + ", cidade=" + cidade + ", estado=" + estado + ", proprietario=" + proprietario + ", rgProp=" + rgProp + ", cpfProp=" + cpfProp + '}';
    }
    
    public void cadastrarCliente(Empresa E) throws SQLException, ClassNotFoundException, Exception {
        EmpresaDAO.cadastrar(E);
    }

    public void consultarEmpresa(Empresa E) throws SQLException, ClassNotFoundException {
        EmpresaDAO.consultar(E);
    }

    public void atualizarCliente(Cliente P) throws SQLException, ClassNotFoundException {
        EmpresaDAO.atualizar(P);
    }
    
    
}
