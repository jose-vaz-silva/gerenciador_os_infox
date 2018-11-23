package com.infox.dal;

import java.sql.*;

/**
 *
 * @author Netinho
 */
public class ModuloConexao {

    //metodo estabelecer conexão
    public static Connection conector() {
        java.sql.Connection conexao = null;
        //chamar driver
        String driver = "com.mysql.jdbc.Driver";
        //Armazenar informações referente ao banco
        String url = "jdbc:mysql://localhost:3306/dbinfox";
        String user = "root";
        String password = "";
        //estabelcer conexão com o banco
        try {
            Class.forName(driver);
            conexao = DriverManager.getConnection(url, user, password);
            return conexao;
        } catch (Exception e) {
            //esclarecer erros
            
            return null;
        }
    }
}
