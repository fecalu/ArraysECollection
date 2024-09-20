package _01_ArrayAtividades;

import java.util.Locale;
import java.util.Scanner;

public class Atv06 {

	public static void main(String[] args) {
	
		/*Faça um procedimento que leia um vetor de 5 números inteiros, mostre a soma, a multiplicação
		e os números.*/
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int soma = 0;
		double multip = 1; 
		
		int[] vetor = new int[5];
		
		System.out.println("Digite os valores: ");
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = sc.nextInt();
			multip *= vetor[i];
			soma += vetor[i];
		}
		
		System.out.printf("Soma= %d\n",soma);
		System.out.printf("Multiplicação= %.0f",multip);
		
		sc.close();
		
		
	}

}
