package br.com.fiap.bo;

import java.sql.Connection;

import br.com.fiap.beans.Banco;
import br.com.fiap.beans.Telefone;
import br.com.fiap.dao.TelefoneDAO;

public class TelefoneBO extends Exception{
	
	private static final long serialVersionUID = 1L;
	TelefoneDAO dao = new TelefoneDAO();
	
	/*A classe BO nos ajuda a definir as regras dwe negocio,
	 * nesse caso, o ddd precisa ser avaliado antes de gravar, entao vamos
	 * facilitar nossa vida e criar os metodos com o mesmo nome do dao
	 * e ele recebe os mesmos parametros tbm, 
	 * a grande diferença é que aqui ele vai analisar se o que foi recebido 
	 * esta dentro das regras, se não, ele não aceita
	 * e encerra o programa.
	 * Se estiver tudo certo, ele manda os mesmos parametros pro DAO.
	 */
	
	public void gravar(Banco banco, Connection conexao) throws Exception{
		if(banco.getTelefone().getDdd() < 10 || banco.getTelefone().getDdd() > 99){
			throw new Exception("O ddd deve ter dois digitos");
		}
		dao.gravar(banco, conexao);
	}
	
	public Telefone buscar(String departamento, Connection conexao) throws Exception{
		departamento.toUpperCase();
		return dao.buscar(departamento, conexao);
	}
}
