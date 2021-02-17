package br.com.alura;



public class TestaCursoComAluno {

	public static void main(String[] args) {
		
		Curso javaColecoes = new Curso("Dominado as cole��es do Java",
				"Paulo Silveira");
		
		
		
		// Adicionando aulas no Curso		
		javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
		javaColecoes.adiciona(new Aula("Criando uma aula", 20));
		javaColecoes.adiciona(new Aula("Modelando com cole��es", 22));
		
		Aluno a1 = new Aluno("Rodrigo Turiini", 34672);
		Aluno a2 = new Aluno("Arnald Queiroga", 24910);
		Aluno a3 = new Aluno("Guilherme SIlveira", 34899);
		
		javaColecoes.matricula(a1);
		javaColecoes.matricula(a2);
		javaColecoes.matricula(a3);
		
		System.out.println("Todos os alunos matriculados: ");
		
		javaColecoes.getAlunos().forEach(a -> {
			System.out.println(a);
		});
		
		System.out.println("O aluno " + a1 + " est� matriculado?");
		System.out.println(javaColecoes.estaMatriculado(a1));
		
		Aluno turini = new Aluno("Rodrigo Turini", 34672);
		
		System.out.println();
		
		System.out.println("O aluno " + turini + " est� matriculado?");	
		System.out.println(javaColecoes.estaMatriculado(turini));
		
		javaColecoes.matricula(turini);
		System.out.println("E agora, o aluno " + turini + " est� matriculado?");	
		System.out.println(javaColecoes.estaMatriculado(turini));
		
		
		System.out.println("O a1 � equals ao Tutini?");
		System.out.println(a1.equals(turini));
		
		// obrigatoriamente o seguinte � true:
		
		System.out.println(a1.hashCode() == turini.hashCode());
		
	
		
		
		
		
		
		

	}

}
