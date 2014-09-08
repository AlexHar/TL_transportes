/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

//import Modelo.Conexao;
import Controle.Cliente;
import Controle.Conexao;
/*import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;*/
//import br.universidadejava.jpa.exemplo.modelo.Pessoa;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Collection;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public interface ClienteDAO {
    
    
    
    public static void cadastrar(Cliente C) throws SQLException {
        try {
            EntityManagerFactory fac = Persistence.createEntityManagerFactory("TLTransportesPU");
            EntityManager em = fac.createEntityManager();
            EntityTransaction tran = em.getTransaction();
            tran.begin();
            em.persist(C);
            tran.commit();
            em.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void excluir(Cliente C) throws SQLException {
        try {
            EntityManagerFactory fac = Persistence.createEntityManagerFactory("TLTransportesPU");
            EntityManager em = fac.createEntityManager();
            EntityTransaction tran = em.getTransaction();
            tran.begin();
            em.remove(C);
            tran.commit();
            em.close();
        } catch (Exception se) {
            throw new SQLException("Erro ao excluir o cliente: " + se.getMessage());
        }
    }

    public static Collection consultar() throws SQLException {
        try {
            EntityManagerFactory fac = Persistence.createEntityManagerFactory("TLTransportesPU");
            EntityManager em = fac.createEntityManager();
            EntityTransaction tran = em.getTransaction();
            tran.begin();
            List<Cliente> pe;
            Query qe=em.createQuery("from Pessoa");
            pe = qe.getResultList();
            for(Cliente p:pe){
                System.out.println("ID Pessoa: "+p.getId());
            }
            tran.commit();
            em.close();
            return pe;
        } catch (Exception se) {
            throw new SQLException("Erro ao pesquisar o cliente: " + se.getMessage());
        }
        
    }

    public static void atualizar(Cliente C) throws SQLException {
        try {
            try (Connection conexao = Conexao.conexao()) {
                Statement state = conexao.createStatement();
                //String sql = "update pessoa set nome='" + C.getNome() + "', rg=" + C.getRg() + ", cpf=" + C.getCpf() + ", idade=" + C.getIdade() + ", telefone=" + C.getTelefone() + ", endereco='" + C.getEndereco() + "', nEndereco=" + C.getnEndereco()+ ", cidade='" + C.getCidade() + "', uf='" + C.getUf() + ", servico='" + C.getServico() + "' where codCliente=" + C.getId()+ "";
                //state.execute(sql);
                state.close();
            }
        } catch (SQLException se) {
            throw new SQLException("Erro ao atualizar o cliente: " + se.getMessage());
        }
    }
}
