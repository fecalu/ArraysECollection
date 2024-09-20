package _04_ListaAtividades;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;


public class AtvLista03 {

	public static void main(String[] args) {
		/*Crie um programa que peça ao usuário para digitar uma lista de palavras separadas por espaço e,
		 *  em seguida, imprima a palavra mais longa na lista.
		 */
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Você irá digitar quantas palavras ?");
		int x = sc.nextInt();
		sc.next();
		
		List <String> lista = new ArrayList<>();
		
		for (int i = 0; i < x; i++) {
			String nomes = sc.nextLine();
			lista.add(nomes);
		}
		
		int maior = 0;
		String maiorPalavra = null;
		for (String y : lista) {
			if (y.length() > maior) {
				maior = y.length();
				maiorPalavra = y;
			}
		}
		
		System.out.println("Maior Palavra é: " + maiorPalavra);
		
		sc.close();

	}

}
