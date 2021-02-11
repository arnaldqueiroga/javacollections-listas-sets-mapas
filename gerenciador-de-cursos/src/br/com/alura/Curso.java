package br.com.alura;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Curso {

	private String nome;
	private String instrutor;
	// quais aulas pertence a este curso (criando relacionamento entre as classe)
	private List<Aula> aulas = new LinkedList<Aula>();

	public Curso(String nome, String instrutor) {
		super();
		this.nome = nome;
		this.instrutor = instrutor;
	}

	public String getNome() {
		return nome;
	}

	public String getInstrutor() {
		return instrutor;
	}

	public List<Aula> getAulas() {
		return Collections.unmodifiableList(aulas);
	}
	
	// método responsável por adicionar aula no curso
	public void adiciona(Aula aula) {
		this.aulas.add(aula);
		
	}

}
