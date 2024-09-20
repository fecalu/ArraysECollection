package _02_MatrizAtividades;

import java.util.Locale;
import java.util.Scanner;

public class Atv05 {

	public static void main(String[] args) {
		/* Leia uma matriz 5 x 5. Leia também um valor X. O programa deverá fazer uma busca desse valor na
			matriz e, ao final, escrever a localização (linha e coluna) ou uma mensagem de “não encontrado”.*/

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
int maior = 0;
		
		int[][] matriz = new int[2][2];
		
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
		
		
		System.out.println("Digite um valor: ");
		double x = sc.nextDouble();
		
		int z=0;
		int y=0;
		int tem =0;

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				
				if(matriz[i][j] == x) {
					tem =1;
					z = i;
					y = j;
					
				}
			}
		}
			if (tem == 1) {
				System.out.println("Seu valor digitado está na posição " + "(" + z +"," + y + ")" );
			} else System.out.println("N tem esse valor na matriz");
		
		
		sc.close();
	}

}
