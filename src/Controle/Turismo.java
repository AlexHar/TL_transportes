/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controle;

import static Controle.ClienteTurismo.turista;
import Modelo.ClienteTurismoDAO;
import Modelo.TurismoDAO;
import java.io.Serializable;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
/*
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;
*/

/**
 *
 * @author harada
 */

public class Turismo implements Serializable {
    
    private static final long serialVersionUID = 1L;
    /*@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    }*/
    
    private String NomeViagem;
    private String DestCidad;
    private char Estado;
    private String Endereco;
    private String nEndereco;
    private int DataPart;
    private int HoraPart;
    private int TempoVi;
    private int DataVolta;
    private int HoraVolta;
    private int Distancia;   
    private int Rota;   
    private int TaxaEmp;    
    private double Valor;  
    private String RespViagem; 
    private String Veiculo;  
    private String Motorista;
    private String Passageiro;
    
    
    static List<Turismo> turismo = new ArrayList();
           
    public String getNomeViagem() {
        return NomeViagem;
    }

    public void setNomeViagem(String DestCidad) {
        this.DestCidad = DestCidad;
    }
    
    
    public String getDestCidad() {
        return DestCidad;
    }

    public void setDestcidad(String DestCidad) {
        this.DestCidad = DestCidad;
    }

    public char getEstado() {
        return Estado;
    }

    public void setEstado(char Estado) {
        this.Estado = Estado;
    }
    
    public String getEndereco() {
        return Endereco;
        
    }
    public void setEndereco(String Endereco) {
        this.Endereco = Endereco;
    }
    
    public String getnEndereco() {
        return nEndereco;
        
    }
    public void setnEndereco(String nEndereco) {
        this.nEndereco = nEndereco;
    }

    public int getDataPart() {
        return DataPart;
    }

    public void setDatarPart(int DataPart) {
        this.DataPart = DataPart;
    }

    public int getHoraPart() {
        return HoraPart;
    }
    
    public void setHoraPart(int HoraPart){
        this.HoraPart = HoraPart;
    }
    
        public int getDataVolta() {
        return DataVolta;
    }
    
    public void setDataVolta(int DataVolta) {
        this.DataVolta = DataVolta;
    }
    
    public int getHoraVolta() {
        return HoraVolta;
    }
    
    public void setHoraVolta(int HoraVolta) {
        this.HoraVolta = HoraVolta;
    }
    
    public int getDistancia() {
        return Distancia;
    }

    public void setDistancia(int Distancia) {
        this.Distancia = Distancia;
    }
    
    public int getTempoVi() {
        return TempoVi;
    }

    public void setTempoVi(int TempoVi) {
        this.TempoVi = TempoVi;
    }
    
    public int getRota() {
        return Rota;
    }
    
    public void setRota(int Rota) {
        this.Rota = Rota;
    }
    
    public int getTaxaEmp() {
        return TaxaEmp;
    }
    
    public void setTaxaEmp(int TaxaEmp) {
        this.TaxaEmp = TaxaEmp;
    }
    
    public double getValor() {
        return Valor;
    }
    
    public void setValor(double Valor) {
        this.Valor = Valor;
    }
    
    
    public String getRespViagem() {
        return RespViagem;
    }
    
    public void setRespViagem(String RespViagem) {
        this.RespViagem = RespViagem;
    }
    
    public String getVeiculo() {
        return Veiculo;
    }
    
    public void setVeiculo(String veiculo) {
        this.Veiculo = veiculo;
    }
    
    public String getMotorista() {
        return Motorista;
    }
    
    public void setMotorista(String Motorista) {
        this.Motorista = Motorista;
    }
    
    public String getPassageiro() {
        return Passageiro;
    }
    
    public void setPasageiro(String Passageiro) {
        this.Passageiro = Passageiro;
    }

  
    
    public void cadastrarViagem(Turismo P) throws SQLException, ClassNotFoundException, Exception {
        TurismoDAO.cadastrar(P);
    }

    public void excluirViagem(Turismo P) throws SQLException, ClassNotFoundException {
        TurismoDAO.excluir(P);
    }
    
    public void alterarViagem(Turismo P) throws SQLException, ClassNotFoundException {
        TurismoDAO.alterar(P);
    }


    public static Collection consultarTuristaNome(String nome){
        turista = (List<ClienteTurismo>) ClienteTurismoDAO.consultarTuristaNome(nome);
        return turista;
    }
    public void atualizarTurismo(Turismo P) throws SQLException, ClassNotFoundException {
        TurismoDAO.atualizar(P);
    }


    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Turismo)) {
            return false;
        }
        return true;
        
    }
}
