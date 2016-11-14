package br.com.fiap.excecao;

public class Excecao extends Exception{

	private static final long serialVersionUID = 1L;

	public Excecao(String msg){
		super(msg);
	}
	
	public Excecao(String msg, Exception e){
		super(msg, e);
		e.printStackTrace();
	}
}
