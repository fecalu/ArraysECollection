package _02_MatrizAtividades;

import java.util.Locale;
import java.util.Scanner;

public class Atv01 {

	public static void main(String[] args) {
		
		/* Leia uma matriz 4 x 4, conte e escreva quantos valores maiores que 10 ela possui.*/
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int cont = 0;
		
		int [][] matriz = new int[4][4];
		
		System.out.println("Digite os 16 valores: ");
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				matriz[i][j] = sc.nextInt();
				
				if (matriz[i][j] > 10) {
					cont += 1;
				}
				
			}
		}
		
		System.out.printf("Possui %d maio(res) que 10", cont);
			
		sc.close();

	}

}
