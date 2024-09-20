package _02_MatrizAtividades;

import java.util.Locale;
import java.util.Scanner;

public class Atv08 {

	public static void main(String[] args) {
		/* Faça uma função que aloca uma matriz m × m (quadrada) e preenche com 1 sua diagonal principal e
		com 0 os demais elementos (matriz identidade). Sua função deve receber o valor de m.*/
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um valor par a matriz: ");
		int m = sc.nextInt();
		
		System.out.println(matrizIdentidade(m));

		sc.close();
		
	}
	
	public static int [][] matrizIdentidade (int m) {
		int [][] matriz = new int[m][m];
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				if (i == j) {
					matriz[i][j] = 1;
				}else matriz[i][j] = 0;
				System.out.printf(matriz[i][j] + " ");
			}
			System.out.println();
		}
		return matriz;
	}
}
