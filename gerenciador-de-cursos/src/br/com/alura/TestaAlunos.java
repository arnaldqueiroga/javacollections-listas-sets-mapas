package br.com.alura;

import java.util.Collection;
import java.util.HashSet;



public class TestaAlunos {

	public static void main(String[] args) {
		Collection<String> alunos = new HashSet<>();
		alunos.add("Rodrigo Turini");
		alunos.add("Cesar Menoti");
		alunos.add("Bob Dylan");
		alunos.add("Tony Ken");
		
		
		boolean arnaldEstaAi = alunos.contains("Arnald Queiroga");
		
		for (String aluno : alunos) {
			System.out.println(aluno);
			
		}
		
		System.out.println(alunos);
		
		System.out.println(arnaldEstaAi);

	}

}
