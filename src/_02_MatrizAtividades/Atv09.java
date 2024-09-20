package _02_MatrizAtividades;

import java.util.Locale;
import java.util.Scanner;

public class Atv09 {

	public static void main(String[] args) {
		/*Leia uma matriz de 3 x 3 elementos. Calcule a soma dos elementos que estão na diagonal secundária.*/
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		int [][] matriz = new int [3][3];
		
		int somaSecundaria = 0;
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				matriz[i][j] = sc.nextInt();
			}
		}
		
		
		int cont1 = 2;
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				if (j == cont1) {
					cont1 --;
					somaSecundaria += matriz[i][j];
				}	
				
				System.out.printf(matriz[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println("Soma da secundaria= "+ somaSecundaria);
		
		sc.close();
	}

}
