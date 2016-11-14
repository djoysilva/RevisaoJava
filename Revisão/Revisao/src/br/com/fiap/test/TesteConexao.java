package br.com.fiap.test;

import java.sql.Connection;
import javax.swing.JOptionPane;
import br.com.fiap.conexao.ConexaoFactory;
import br.com.fiap.excecao.Excecao;

public class TesteConexao{
	public static void main(String[] args) throws Excecao{
		Connection c = null;
		try{
			String user= JOptionPane.showInputDialog("Digite o usu�rio: ");
			String pass= JOptionPane.showInputDialog("Digite o senha: ");
			c = new ConexaoFactory().controlarInstancia().getConnection(user,pass);
			System.out.println("Conex�o aberta!");
		}catch(Exception e){
			System.out.println("Erro de conex�o");
		}finally{
			try{
				c.close();
			}catch (Exception e){
				System.out.println(e);
				e.printStackTrace();
			}
		}
	}
}