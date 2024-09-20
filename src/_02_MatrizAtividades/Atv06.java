package _02_MatrizAtividades;

import java.util.Locale;
import java.util.Scanner;

public class Atv06 {

	public static void main(String[] args) {
		/* Leia duas matrizes 4 x 4 e escreva uma terceira com os maiores valores de cada posição das matrizes
		lidas.*/
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int [][] matriz1 = new int[4][4];
		int [][] matriz2 = new int[4][4];
		
		int [][] matrizMaior = new int[4][4];
		
		System.out.println("Digite os valores da matriz 01: ");
		for (int i = 0; i < matriz1.length; i++) {
			for (int j = 0; j < matriz1.length; j++) {
				matriz1[i][j] = sc.nextInt();
				
			}
		}
		
		System.out.println("Digite os valores da matriz 02: ");
		for (int i = 0; i < matriz2.length; i++) {
			for (int j = 0; j < matriz2.length; j++) {
				matriz2[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("Esses são os maiores valores das das duas matrizes: ");
		for (int i = 0; i < matrizMaior.length; i++) {
			for (int j = 0; j < matrizMaior.length; j++) {
				if(matriz1[i][j] > matriz2[i][j]) {
					matrizMaior[i][j] = matriz1[i][j]; 
				} else matrizMaior[i][j] = matriz2[i][j];
				System.out.printf(matrizMaior[i][j] + " ");
			}
			System.out.println();
		}
		sc.close();
	}
}
