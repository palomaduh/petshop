/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author info206
 */
public class Util {
    
    private String sql;

    public Connection conecta() throws SQLException{
             Connection conexao = null;
       

        String url = "jdbc:mysql://localhost/farmacia";  //Nome da base de dados
        String user = "root"; //nome do usuário do MySQL
        String password = "123456"; //senha do MySQL
        try{
            conexao = DriverManager.getConnection(url, user, password);
} catch(SQLException sqlex){
System.out.println("Erro na conexão "+ sqlex);
}
        return conexao;
    }

 public void CriaTabela(String nomeTabela,String atributos) throws SQLException {
            Statement statement = null;
            Connection conexao = null;
        try {
            conexao = conecta();
            statement = conexao.createStatement();
            String createTableSQL = "CREATE TABLE "+nomeTabela+"("+atributos+");";
            System.out.println(createTableSQL);
               statement.execute(createTableSQL); // executa o comando de criação
            System.out.println("Tabela \"nomeTabela\" foi criada com sucesso!");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {   // sempre feche o statement a conexão com banco
            if (statement != null) {
                statement.close();
            }
            if (conexao != null) {
                conexao.close();
            }
        }    
 }
 public void criaBanco(String banco) throws SQLException{
     
   String sql="CREATEDATABASE" +banco;
   Connection conexao=conecta();
   Statement stmt=conexao.createStatement();
   stmt.execute(sql);
   
   
 }
 public void  main(String[]args)throws SQLException{
     //criaBanco("farmacia");//criaBanco de dados
     
     //criartabela
     

}
}
