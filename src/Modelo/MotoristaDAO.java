/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Controle.Motorista;
import Controle.Veiculo;
import java.sql.SQLException;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 *
 * @author guitonsic
 */
public class MotoristaDAO {

    public static void cadastrar(Motorista F) throws SQLException {
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

    public static void excluir(Motorista F) throws SQLException {
        try {
            EntityManagerFactory fac = Persistence.createEntityManagerFactory("TLTransportesPU");
            EntityManager em = fac.createEntityManager();
            EntityTransaction tran = em.getTransaction();
            tran.begin();
            em.remove(F);
            tran.commit();
            em.close();
        } catch (Exception se) {
            throw new SQLException("Erro ao excluir o cliente: " + se.getMessage());
        }
    }

    public static void consultar(Motorista F) throws SQLException {
        try {
            EntityManagerFactory fac = Persistence.createEntityManagerFactory("TLTransportesPU");
            EntityManager em = fac.createEntityManager();
            EntityTransaction tran = em.getTransaction();
            tran.begin();
            List<Veiculo> pe;
            Query qe = em.createQuery("from Veiculo where nome='" + F.getNome() + "'");
            pe = qe.getResultList();
            for (Veiculo p : pe) {
                System.out.println("ID Veiculo: " + p.getId());
            }
            tran.commit();
            em.close();
        } catch (Exception se) {
            throw new SQLException("Erro ao pesquisar o cliente: " + se.getMessage());
        }
    }
}
