/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Modelo;

import Controle.ClienteTurismo;
import Controle.Conexao;
import Controle.Login;
import Controle.Veiculo;
//import Modelo.LoginBanco;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class LoginDAO {
    public static void cadastrar(Login l) throws SQLException {
        try {
            EntityManagerFactory fac = Persistence.createEntityManagerFactory("TLTransportesPU");
            EntityManager em = fac.createEntityManager();
            EntityTransaction tran = em.getTransaction();
            tran.begin();
            em.persist(l);
            tran.commit();
            em.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    public static ArrayList<Login> buscarLogin() throws SQLException {
        ArrayList<Login> LAUX = new ArrayList<Login>();
        try {
            Connection conexao = Conexao.conexao();
            Statement state = conexao.createStatement();
            String sql = "select * from LOGIN";
            ResultSet rs = state.executeQuery(sql);
            while (rs.next()) {
                Login l = new Login();
                l.setLogin(rs.getString("login"));
                l.setSenha(rs.getString("senha"));
                LAUX.add(l);
            }

        } catch (SQLException se) {
            throw new SQLException("Erro ao localizar os dados: " + se.getMessage());
        }
        return LAUX;
    }
    
}
