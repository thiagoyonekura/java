package com.Heranca2;

public class Pessoa {
	private String nome;
	private String endereco;
	private String telefone;
	private String cpf;
	
	private String telefoneCelular;
	// Como a Classe Pessoa não está extendendo nenhuma outra Classe, a Classe main será a Object
	
	public Pessoa() {
		
	}
	public Pessoa(String nome, String edereco, String telefone) {
		super();
		this.nome = nome;
		this.endereco = endereco;
		this.telefone = telefone;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEdereco() {
		return endereco;
	}
	public void setEdereco(String edereco) {
		this.endereco = edereco;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getTelefoneCelular() {
		return telefoneCelular;
	}
	public void setTelefoneCelular(String telefoneCelular) {
		this.telefoneCelular = telefoneCelular;
	}
	
}
