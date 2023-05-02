package com.Heranca4;

import com.Polimorfismo.Aluno;
import com.Polimorfismo.Pessoa;
import com.Polimorfismo.Professor;

public class Principal {

	public static void main(String[] args) {
		Pessoa pessoa = new Pessoa();
		Pessoa aluno = new Aluno();
		Pessoa professor = new Professor();
		
		pessoa.setEndereco("Rua 1, num 1");
		aluno.setEndereco("Rua 2, num 2");
		professor.setEndereco("Rua 3, num 3");

	}

}
