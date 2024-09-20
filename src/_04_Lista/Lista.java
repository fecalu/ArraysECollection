package _04_Lista;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Lista {
	public static void main(String[] args) {
		
	
	List <String> lista = new ArrayList<>();
	
	lista.add("Maria");
	lista.add("Alex");
	lista.add("Bob");
	lista.add("Anna");
	
	
	// percorrer a lista e em seguida imprimir cada nome dentro dela
	for (String x : lista) {
		System.out.println(x);
	} 	
	System.out.println("------------------------------------");

	
		//verificar o tamanho da lista
		System.out.println(lista.size());
		
	System.out.println("------------------------------------");
		
		// adicionar o nome "Marcola" na posição 2 da lista
		System.out.println("vc add Joselito na posição 2");
		lista.add(2, "Joselito");  // sobrecarga 
		for (String x : lista) {
			System.out.println(x);
		} 
		//remove a posição 1
		lista.remove(1);
		System.out.println("vc removeu o nome da posiçõa 1");
		//remove o nome "Anna"
		for (String x : lista) {
			System.out.println(x);
		} 
		lista.remove("Anna");
		System.out.println("vc removeu o nome Anna");
		for (String x : lista) {
			System.out.println(x);
		} 
		
		//remover todos os nomes com a letra M no inicio
		lista.removeIf(x -> x.charAt(0) == 'M');   /*Entendendo essa expressão lambda: 
		ta dizendo assim: pega essa esse valor(variavel) x e se for verdadeiro que x na posição (0) é igual a 'M' então remova
		da list esse Elemento */
		System.out.println("vc removeu nomer que começam com letra 'M'");
	
		
		for (String x : lista) {
			System.out.println(x);
		} 
		
		System.out.println("------------------------------------");
		
		lista.add("Maria");
		lista.add("Alex");
		lista.add("Anna");
		
		for (String x : lista) {
			System.out.println(x);
		} 
		
		
		// Estamos declarando uma NOVA lista com o nome 'result'(poderia ser outro)
		// Queremos filtrar somente os elementos que começam com a letra 'A' e devolver para 'result' como uma nova lista só com os nomes com a letra A
		List<String> result = lista.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
		/* 
		 *  Estamos pegando a lista "lista" trasformando ela pra 'stream'
		 *  depois chamamos a função filter que aceita uma predicado.
		 *  O predicado está dizendo: pega esse valor x e se for verdadeiro que x na posição 0 é igual a 'A' então filta esses elementos
		 *  O strem n é compativel com lista então precisa converter de novo para lista 
		 *  ai entra o 'collect(collectors.toList()) 
		 *  
		 *  RESUMINDO: Ta filtrando elementos que começam com a letra 'A' e jogando dentro de uma nova lista chamada 'result'
		 */
		
		System.out.println("------------------------------------");
		
		//AQUI IMPRIME A LISTA 'result'
		
		for (String x : result) {   
			System.out.println(x);
		} 
		
		
		
	}
}