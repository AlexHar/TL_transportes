/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

//import Modelo.Conexao;
import Controle.ClienteEscolar;
import Controle.Conexao;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class ClienteEscolarDAO {
    
    static String status = "";
    Connection con = Conexao.conexao();
    static List<ClienteEscolar> clientes = new ArrayList();
    //static List<Pessoa> pessoas = new ArrayList();
    static List<ClienteEscolar> clienteRetorno = new ArrayList();
    
    
    public static void cadastrar(ClienteEscolar C) throws SQLException {
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

    public static void excluir(ClienteEscolar C) throws SQLException {
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

    /*public static Collection consultar(){
        //List<Veiculo> veiculos;
        long id;
        String cidade;
        int cpf;
        String endereco;
        String estado;
        int nEndereco;
        String nascimento;
        String nome;
        int rg;
        int telefone;
        String servico;
        int tipo;
        String tipoPessoa;
        
        
            EntityManagerFactory factory = Persistence.createEntityManagerFactory("TLTransportesPU");
            EntityManager manager = factory.createEntityManager();
            String tip = "Cliente";
            Query queryPessoa = manager.createQuery("SELECT e FROM Pessoa e where e.tipoPessoa='" + tip + "'");
            System.out.println(queryPessoa);
            Query queryCliente = manager.createQuery("SELECT e FROM Cliente e");
            pessoas = queryPessoa.getResultList();
            System.out.println(pessoas);
            clientes = queryCliente.getResultList();
            System.out.println(clientes);
                        try {
            for (int i=0; i<pessoas.size(); i++){
                
                Pessoa pe = (Pessoa)pessoas.get(i);
                id = pe.getId();
                System.out.println(id);
                cidade = pe.getCidade();
                cpf = pe.getCpf();
                endereco = pe.getEndereco();
                estado = pe.getEstado();
                nEndereco = pe.getnEndereco();
                nascimento = pe.getNascimento();
                nome = pe.getNome();
                rg = pe.getRg();
                telefone = pe.getTelefone();
                tipoPessoa = pe.getTipoPessoa();
                
                ClienteEscolar cli = (ClienteEscolar)clientes.get(i);
                //id = cli.getId();
                servico = cli.getServico();
                tipo = cli.getTipo();
                ClienteEscolar cliente = new ClienteEscolar(servico, tipo, id, nome, rg, cpf, endereco, nEndereco, cidade, estado, telefone, nascimento, tipoPessoa);
                clienteRetorno.add(cliente);
            }
            return clienteRetorno;
        } catch (Exception se) {
            String status = ("Erro ao pesquisar o cliente: " + se.getMessage());
            System.out.println("ta dando erro aqui seu lixo: " + se.getMessage());
        }
        return clienteRetorno;
    }*/
        
    

    public static void atualizar(ClienteEscolar C) throws SQLException {
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
