package _04_ListaAtividades;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class AtvLista02 {

	public static void main(String[] args) {
		/* Crie um programa que peça ao usuário para digitar uma lista de palavras separadas por espaço e, em seguida,
		 *  imprima a lista na tela em ordem reversa. */
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List <String> lista = new ArrayList<>();
		
		System.out.println("Digite suas palavras separadas por virgula.");
		String todaPalavras = sc.next();
		
		Collections.addAll(lista, todaPalavras.split(" "));
		
		System.out.println(lista.toString());
		
		sc.close();
	}

}
