package _03_Hashset;

import java.util.HashSet;
import java.util.Set;

public class Hashset {  

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		
		/*INTRODUÇÃO: Em Java, um HashSet é uma coleção de elementos que não permite a inserção de elementos duplicados
		e não mantém a ordem de inserção dos elementos. */
		
		/* Quando Usar ? 
		 * Quando se precisa armazenar um grande número de elementos em uma coleção e garantir que não haverá elementos duplicados;
		 * Quando a ordem dos elementos não é importante e não se precisa ordená-los;
		 * Quando se precisa fazer busca rápida de um elemento em uma coleção grande.
		 * 
		 * Quando não usar?
		 * Quando a ordem dos elementos for importante.
		 */
		
		//CRIANDO UM HASHSET
		
		HashSet conjuntoBagunçado = new HashSet();  // Dessa forma pode-se colocar varios tipos. Doulbe, int, String... tudo muisturado.
		
	//	HashSet<String> conjuntoOrganizado = new HashSet<>();  //Dessa forma só recebe elementos do tipo String(mas poderia ser Integer, Double...)
		
		//ADD ELEMENTOS AO HASHSET
		
		conjuntoBagunçado.add(1.2); // double -> Double (Lembrando que ele já transforma primitivo para Wrappers, pois não aceita primitivo)
		conjuntoBagunçado.add(true);
		conjuntoBagunçado.add("Teste");
		conjuntoBagunçado.add(1);
		conjuntoBagunçado.add('x');
		
		System.out.println("Tamanho é " + conjuntoBagunçado.size());
		
		conjuntoBagunçado.add("Teste");
		conjuntoBagunçado.add('x');
		System.out.println("Tamanho é " + conjuntoBagunçado.size());
		
		System.out.println(conjuntoBagunçado.remove("teste"));
		System.out.println(conjuntoBagunçado.remove("Teste"));
		System.out.println(conjuntoBagunçado.remove('x'));
		
		System.out.println("Tamanho é " + conjuntoBagunçado.size());
		
		System.out.println(conjuntoBagunçado.contains('x'));
		System.out.println(conjuntoBagunçado.contains(1));
		System.out.println(conjuntoBagunçado.contains(true));
		
		Set nums = new HashSet();
		nums.add(1);
		nums.add(2);
		nums.add(3);
		
		System.out.println(nums);
		System.out.println(conjuntoBagunçado);
		
		// conjunto.addAll(nums); // União entre dois conjuntos
		conjuntoBagunçado.retainAll(nums);
		System.out.println(conjuntoBagunçado);
		
		conjuntoBagunçado.clear();
		System.out.println(conjuntoBagunçado);
	}
}