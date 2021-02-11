package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TestaListaDeAula {

	public static void main(String[] args) {
		Aula a1 = new Aula("Revisitando as ArrayLists", 21 );
		Aula a2 = new Aula("Listas de objetos", 15 );
		Aula a3 = new Aula("Relacionamento de listas e objetos", 17 );
		
		ArrayList<Aula> aulas = new ArrayList<>();
		
		aulas.add(a1);
		aulas.add(a2);
		aulas.add(a3);
		
		System.out.println(aulas);
		
		Collections.sort(aulas);
		
		// ordenando lista por ordem alfabética
		System.out.println(aulas);
		
		// ordenando lista por tempo de aulas		
		Collections.sort(aulas, Comparator.comparing(Aula::getTempo));
		System.out.println(aulas);
		
		// outra forma de comparar por tempo de aulas
		aulas.sort(Comparator.comparing(Aula::getTempo));
		
		
	}
	
		

}
