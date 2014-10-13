/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Controle.Conexao;
import Controle.Turismo;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.swing.JOptionPane;

/**
 *
 * @author guitonsic
 */
public class TurismoDAO {

    static String status = "";

    public static void atualizar(Turismo P) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public static void excluir(Turismo P) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    Connection con = Conexao.conexao();
    static List<Turismo> turismo = new ArrayList();
    
    public static void cadastrar(Turismo F) throws SQLException {
        try {
            EntityManagerFactory fac = Persistence.createEntityManagerFactory("TLTransportesPU");
            EntityManager em = fac.createEntityManager();
            EntityTransaction tran = em.getTransaction();
            tran.begin();
            em.persist(F);
            tran.commit();
            em.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    /*
    public static void excluir(Turismo C) throws SQLException {
        try {
            EntityManagerFactory fac = Persistence.createEntityManagerFactory("TLTransportesPU");
            EntityManager em = fac.createEntityManager();
            EntityTransaction tran = em.getTransaction();
            tran.begin();
            //C = em.find(Pecas.class,);  
            C = em.merge(C);
            em.remove(C);
            em.flush();
            tran.commit();
            em.close();
        } catch (Exception se) {
            throw new SQLException("Erro ao excluir o cliente: " + se.getMessage());
        }
    }
    */
    public static void alterar(Turismo F) throws SQLException {
        try {
            EntityManagerFactory fac = Persistence.createEntityManagerFactory("TLTransportesPU");
            EntityManager em = fac.createEntityManager();
            EntityTransaction tran = em.getTransaction();
            tran.begin();
            em.merge(F);
            tran.commit();
            em.close();
        } catch (Exception se) {
            throw new SQLException("Erro ao alterar a viagem: " + se.getMessage());
        }
    }

    public static Collection consultar(){
       try {
            EntityManagerFactory factory = Persistence.createEntityManagerFactory("TLTransportesPU");
            EntityManager manager = factory.createEntityManager();
            Query query = manager.createQuery("SELECT e FROM Motorista e");
            turistas = query.getResultList();
            return turistas;
        } catch (Exception se) {
            String status = ("Erro ao pesquisar o Motorista: " + se.getMessage());
            JOptionPane.showMessageDialog(null, "Erro ao pesquisar Motoristas: " + se.getMessage());
        }
        return turistas;
    }
    public static Collection consultarViagem(String cpf){
       try {
            EntityManagerFactory factory = Persistence.createEntityManagerFactory("TLTransportesPU");
            EntityManager manager = factory.createEntityManager();
            Query query = manager.createQuery("SELECT e FROM Turismo e where e.cpf='" + cpf +"'");
            viagem = query.getResultList();
            return viagem;
        } catch (Exception se) {
            String status = ("Erro ao pesquisar o viagem: " + se.getMessage());
            JOptionPane.showMessageDialog(null, "Erro ao pesquisar Motoristas: " + se.getMessage());
        }
        return turistas;
    }
    public static Collection consultarMotoristaNome(String nome){
       try {
            EntityManagerFactory factory = Persistence.createEntityManagerFactory("TLTransportesPU");
            EntityManager manager = factory.createEntityManager();
            Query query = manager.createQuery("SELECT e FROM Motorista e where e.nome='" + nome + "'");
            motoristas = query.getResultList();
            return motoristas;
        } catch (Exception se) {
            String status = ("Erro ao pesquisar o Motorista: " + se.getMessage());
            JOptionPane.showMessageDialog(null, "Erro ao pesquisar Motoristas: " + se.getMessage());
        }
        return motoristas;
    }
}
