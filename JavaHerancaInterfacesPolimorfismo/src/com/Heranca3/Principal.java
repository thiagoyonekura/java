package com.Heranca3;

public class Principal {
public static void main(String[] args) {
		
		Pessoa pessoa = new Pessoa();
		Pessoa aluno = new Aluno();
		Pessoa professor = new Professor();

		pessoa.setEndereco("Rua 1, num 1");
		aluno.setEndereco("Rua 2, num 2");
		professor.setEndereco("Rua 3, num 3");
		 
		System.out.println(pessoa.obterEtiquetaEndereco());
		System.out.println(aluno.obterEtiquetaEndereco());
		System.out.println(professor.obterEtiquetaEndereco());
	}
}

//public todos conseguem ver(tudo)
//default = somente classes do mesmo pacote(classe e pacote)
//protect = (classe, pacote e subclasse)
//private = somente na mesma classe(classe)
