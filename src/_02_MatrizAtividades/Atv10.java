package _02_MatrizAtividades;

import java.util.Locale;
import java.util.Scanner;

public class Atv10 {

	public static void main(String[] args) {
		/* Dada a matriz abaixo implemente procedimento que imprima a seguinte matriz:
		 * 		8 0 7
				4 5 6
				3 10 2 
		  */

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		int [][] matriz = new int [3][3];
		
		int[] vetor = {8,0,7,4,5,6,3,10,2};
		int cont = 0;
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				matriz[i][j] = vetor[cont];
				cont ++;
				System.out.printf(matriz[i][j] + " ");
			}
			System.out.println();
		}
		
		
		
		sc.close();

	}

}
