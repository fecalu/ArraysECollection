package _02_MatrizAtividades;

import java.util.Locale;
import java.util.Scanner;

public class Atv04 {

	public static void main(String[] args) {
		/* - Leia uma matriz 4 x 4, imprima a matriz e retorne a localização (linha e a coluna) do maior valor.*/

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		int maior = 0;
		
		int[][] matriz = new int[4][4];
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				matriz[i][j] = sc.nextInt();
				
				if(matriz[i][j] > maior) {
					maior = matriz[i][j];
				}
			}
		}
		
		System.out.println();
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				System.out.printf(matriz[i][j] + " ");
			}
			System.out.println();
		}
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				
				if(matriz[i][j] == maior) {
					System.out.println("MAIOR VALOR ESTÁ NA POSIÇÃO (" + i + "," + j + ")");
				}
			}
		}
		
		
		
		
		
		
		sc.close();
		
	}

}
