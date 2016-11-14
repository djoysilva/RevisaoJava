package br.com.fiap.conexao;

import java.sql.Connection;
import java.sql.DriverManager;

public final class ConexaoFactory {
	private static ConexaoFactory conexao = null;
	
	public static ConexaoFactory controlarInstancia(){
		if(conexao == null){
			conexao = new ConexaoFactory();
		}
		return conexao;
	}
	
	public Connection getConnection(String usuario, String senha) throws Exception{
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
	
		return DriverManager.getConnection("jdbc:oracle:thin:/:@localhost:1521:xe", usuario, senha);
	}
	
}
