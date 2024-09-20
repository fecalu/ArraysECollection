package _02_MatrizAtividades;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Atv02 {

	public static void main(String[] args) {

		/*
		 * Declare uma matriz 5 x 5. Preencha com 1 a diagonal principal e com 0 os
		 * demais elementos. Escreva ao final a matriz obtida.
		 */

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int[][] matriz = new int[5][5];

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				matriz[i][j] = sc.nextInt();
				if (i == j) {
					matriz[i][j] = 1;
				} else {
					matriz[i][j] = 0;
				}
			}
		}

		String matrizString = Arrays.deepToString(matriz);
		System.out.printf(matrizString);

		sc.close();
	}

}
