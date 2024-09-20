package _01_ArrayAtividades;

import java.util.Locale;
import java.util.Scanner;

public class Atv04 {

	public static void main(String[] args) {
		/*Faça um programa que leia um vetor de 8 posições e, em seguida, leia também dois valores X e
		Y quaisquer correspondentes a duas posições no vetor. Ao final seu programa deverá escrever a
		soma dos valores encontrados nas respectivas posições X e Y .*/
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double[] vetor = new double[8];
		System.out.println("Digite os 8 valores: ");
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = sc.nextDouble();
		}
		
		System.out.println("Digite os valores de X e Y em um intervalo de 0 a 7: ");
		double x = sc.nextDouble();
		double y = sc.nextDouble();
		
		double soma = 0;
		
		for (int i = 0; i < vetor.length; i++) {
			
			if(i == x) {
				soma += vetor[i];
			}
			
			if(i == y) {
				soma += vetor[i];
			}
		}
		
		System.out.printf("Soma = %.0f",soma);
		
		
		
		sc.close();
	}

}
