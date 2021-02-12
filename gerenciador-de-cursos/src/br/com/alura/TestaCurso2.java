package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;

import java.util.List;

public class TestaCurso2 {

	public static void main(String[] args) {
		Curso javaColecoes = new Curso("Dominado as coleções do Java",
				"Paulo Silveira");
		
		
		
		// javaColecoes.getAulas().add(new Aula("Trabalhando com ArrayList", 21));
		
		// Adicionando aulas no Curso		
		javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
		javaColecoes.adiciona(new Aula("Criando uma aula", 20));
		javaColecoes.adiciona(new Aula("Modelando com coleções", 24));
		
		List<Aula> aulasImutaveis = javaColecoes.getAulas();
		System.out.println(aulasImutaveis);
		
		// para que me seja permitido utilizar o collections.sort sem que eu tenha uma exceção
		// como retorno, por causa do getAulas com seu método defensivo na classe Curso
		List<Aula> aulas = new ArrayList<Aula>(aulasImutaveis);
		
		Collections.sort(aulas);
		System.out.println(aulas);
		
		System.out.println(javaColecoes.getTempoTotal());
		
		System.out.println(javaColecoes);

	}

}
