package br.com.alura;

public class TestaBuscaAlunosNoCurso {

	public static void main(String[] args) {
		Curso javaColecoes = new Curso("Dominado as coleções do Java",
				"Paulo Silveira");
		
		
		
		// Adicionando aulas no Curso		
		javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
		javaColecoes.adiciona(new Aula("Criando uma aula", 20));
		javaColecoes.adiciona(new Aula("Modelando com coleções", 22));
		
		Aluno a1 = new Aluno("Rodrigo Turiini", 34672);
		Aluno a2 = new Aluno("Arnald Queiroga", 24910);
		Aluno a3 = new Aluno("Guilherme SIlveira", 34899);
		
		javaColecoes.matricula(a1);
		javaColecoes.matricula(a2);
		javaColecoes.matricula(a3);
		
		System.out.println("Quem é o aluno com matricula 5617?");
		Aluno aluno = javaColecoes.buscaMatriculado(3333);
		System.out.println("aluno : " + aluno);
		
		
		
		

	}

}
