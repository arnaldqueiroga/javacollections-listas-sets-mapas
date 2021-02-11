package br.com.alura;



public class TestaCurso {

	public static void main(String[] args) {
		Curso javaColecoes = new Curso("Dominado as coleções do Java",
				"Paulo Silveira");
		
		
		
		// javaColecoes.getAulas().add(new Aula("Trabalhando com ArrayList", 21));
		
		javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
		javaColecoes.adiciona(new Aula("Criando uma aula", 20));
		javaColecoes.adiciona(new Aula("Modelando com coleções", 22));
		
		System.out.println(javaColecoes.getAulas());

	}

}
