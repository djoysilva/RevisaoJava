package br.com.fiap.beans;

import java.io.Serializable;

public class Banco implements Serializable{

	private static final long serialVersionUID = 1L;
	private int codigo;
	private String razaoSocial;	
	private String cnpj;
	private String endereco;
	private Telefone telefone;
	private String site;
	
	public Banco(int codigo, String razaoSocial, String cnpj, String endereco, Telefone telefone, String site) {
		super();
		this.codigo = codigo;
		this.razaoSocial = razaoSocial;
		this.cnpj = cnpj;
		this.endereco = endereco;
		this.telefone = telefone;
		this.site = site;
	}
	
	public Banco() {
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getRazaoSocial() {
		return razaoSocial;
	}

	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public Telefone getTelefone() {
		return telefone;
	}

	public void setTelefone(Telefone telefone) {
		this.telefone = telefone;
	}

	public String getSite() {
		return site;
	}

	public void setSite(String site) {
		this.site = site;
	}
	
	
}