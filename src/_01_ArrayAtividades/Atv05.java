package _01_ArrayAtividades;


import java.util.Locale;
import java.util.Scanner;

public class Atv05 {

	public static void main(String[] args) {
		
		/* Crie um programa que lê 6 valores inteiros usando vetores e, em seguida, mostre na tela os
		valores lidos na ordem inversa.*/
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int [] vetor = new int[6];
		
		System.out.println("Digite os valores: ");
		
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = sc.nextInt();
		}
		
		for (int i = vetor.length -1 ; i > -1; i--) {
			System.out.println(vetor[i]);
		}

		sc.close();

	}

}
