package _02_MatrizAtividades;

import java.util.Locale;
import java.util.Scanner;

public class Atv03 {

	public static void main(String[] args) {
		/* - Faça um programa que preenche uma matriz 4 x 4 com o produto(multiplicação) do valor da linha e da coluna de cada
		 * elemento. Em seguida, imprima na tela a matriz.*/
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int [][] matriz = new int [4][4];
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				matriz[i][j] = i*j;
				System.out.printf(matriz[i][j] + " ");
			}
			System.out.println();
		}
		sc.close();
	}

}
