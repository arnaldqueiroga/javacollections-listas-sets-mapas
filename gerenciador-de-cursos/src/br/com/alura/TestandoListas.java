package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;

public class TestandoListas {

	public static void main(String[] args) {
		String aula1 = "Conhecendo mais de listas";
		String aula2 = "Modelando a classe Aula";
		String aula3 = "Trabalhando com Cursos e Sets";

		// criando uma lista da string chamada aulas
		ArrayList<String> aulas = new ArrayList<>();

		aulas.add(aula1);
		aulas.add(aula2);
		aulas.add(aula3);

		System.out.println(aulas);

		aulas.remove(0);

		System.out.println(aulas);

		for (String aula : aulas) {
			System.out.println("Aula: " + aula);

		}

		String primeiraAula = aulas.get(0);
		System.out.println("A primeira aula é: " + primeiraAula);

		for (int i = 0; i < aulas.size(); i++) {
			System.out.println("aula: " + aulas.get(i));
		}

		aulas.forEach(aula -> {
			System.out.println("percorrendo ");
			System.out.println("Aula : " + aula);
		});
		
		//criando mais uma aula
		aulas.add("Aumentando nosso conhecimento");
		// ordenar os elementos dentro do ArrayList
		Collections.sort(aulas);
		System.out.println("Depois de ordenado: ");
		System.out.println(aulas);

	}

}
