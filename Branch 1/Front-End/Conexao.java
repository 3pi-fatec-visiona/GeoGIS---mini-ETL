package org.teste;

import java.io.File;
import java.sql.*;


// Classe conex�o criada para ser utilizada na Segunda Tela a fim de realizar liga��o com o Banco de Dados PostGREsql
public class Conexao {
	 
    static final String URL = "jdbc:postgresql://localhost:5432/postgres"; //incica o caminho do banco de dados
    static final String USER = "postgres"; // nome de usu�rio configurado na instala��o do PostGRE
    static final String PASS = "123456"; // senha configurada na instala��o do PostGRE
 
    public static Connection criarConexao() throws ClassNotFoundException, SQLException{
    Class.forName("org.postgresql.Driver");
    Connection Conexao = DriverManager.getConnection(URL, USER, PASS);
    if (Conexao != null){
    System.out.print("Conex�o efetuada com sucesso...");
    return Conexao;
    }
    return null;
    }
}

