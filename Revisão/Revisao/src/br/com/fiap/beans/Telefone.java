package br.com.fiap.beans;

import java.io.Serializable;

public class Telefone implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private int ddd;
	private String numero;
	private String departamento;
	
	public Telefone(short ddd, String numero, String departamento) {
		this.ddd = ddd;
		this.numero = numero;
		this.departamento = departamento;
	}
	
	
	public String getDepartamento() {
		return departamento;
	}


	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}


	public Telefone() {
	}
	
	public int getDdd() {
		return ddd;
	}
	public void setDdd(int i) {
		this.ddd = i;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
}
