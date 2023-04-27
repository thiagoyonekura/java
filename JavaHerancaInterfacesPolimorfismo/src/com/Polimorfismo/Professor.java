package com.Polimorfismo;

public class Professor extends Pessoa {
	
	private String salario;
	private double nomeCurso;
	
	public String getSalario() {
		return salario;
	}
	public void setSalario(String salario) {
		this.salario = salario;
	}
	public double getNomeCurso() {
		return nomeCurso;
	}
	public void setNomeCurso(double nomeCurso) {
		this.nomeCurso = nomeCurso;
	}
	
	public double calcularSalarioLiquido() {
		return 0;
	}
	
	public String obterEtiquetaEndereco() {
		
		String s = "Endereço do Professor: ";
		s += super.getEndereco();
		
		return s;
	}
	
}
