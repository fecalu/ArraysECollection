package _02_MatrizAtividades;

import java.util.Locale;
import java.util.Scanner;

public class Atv07 {

	public static void main(String[] args) {
		/* Faça um programa em Python que preencha uma matriz 3x3 de inteiros e escreva:
			a) A soma dos números ímpares fornecidos;
			b) A soma de cada uma das 3 colunas;
			c) A soma de cada uma das 3 linhas.*/

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int somaImpares = 0;
		
		int [][] matriz = new int[3][3];
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				matriz[i][j] = sc.nextInt();
				if (matriz[i][j] % 2 == 1) {
					somaImpares += matriz[i][j];
				}
			}
		}
		//Só para mostrar a matriz bonitinha
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				System.out.printf(matriz[i][j] + " ");	
			}
			System.out.println();
		}
		
		int somaColuna1 = 0;
		int somaColuna2 = 0;
		int somaColuna3 = 0;
		for (int i = 0; i < matriz.length; i++) {
			somaColuna1 += matriz[i][0];
			somaColuna2 += matriz[i][1];
			somaColuna3 += matriz[i][2];
		}
		
		int somaLinha1 = 0;
		int somaLinha2 = 0;
		int somaLinha3 = 0;
		
		for (int i = 0; i < matriz.length; i++) {
			somaLinha1 += matriz[0][i];
			somaLinha2 += matriz[1][i];
			somaLinha3 += matriz[2][i];
		}
		
		System.out.println("Soma Impares = ");
		System.out.println(somaImpares);
		
		System.out.println("Soma das Colunas = ");
		System.out.println(somaColuna1);
		System.out.println(somaColuna2);
		System.out.println(somaColuna3);
		
		System.out.println("Soma das Linhas = ");
		System.out.println(somaLinha1);
		System.out.println(somaLinha2);
		System.out.println(somaLinha3);
		
		
		
		
		sc.close();
	}

}
