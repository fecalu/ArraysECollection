package _04_ListaAtividades;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class AtvLista01 {

	public static void main(String[] args) {
		/* Crie um programa que crie uma lista vazia, adicione alguns elementos a ela e imprima a lista na tela.*/
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		
		
		List<String> lista = new ArrayList<>();
		
		System.out.println("Quantos elemetos você vai colocar na lista ?");
		int quantElementos = sc.nextInt();
		
		for (int i = 0; i < quantElementos; i++) {
			System.out.println("Digite o elemento "+(i+1));
			String adicionando = sc.next();
			lista.add(adicionando);
		}
		
		System.out.println(lista.toString());
		
		
		
		
		
		
		
		sc.close();

	}

}
