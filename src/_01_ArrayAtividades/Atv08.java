package _01_ArrayAtividades;

import java.util.Locale;
import java.util.Scanner;

public class Atv08 {

	public static void main(String[] args) {
		/* Escreva um procedimento em para ler um vetor X de 10 elementos inteiros. Logo após copie os
	       elementos do vetor X para um vetor Y fazendo com que o 1o. elemento de X seja copiado para o 10.
	       De Y, o 2o. de X para o 9o. de Y e assim sucessivamente. Após o término da cópia, imprimir o vetor Y.*/
			
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		
		int [] vetorX = new int [5];
		int [] vetorY = new int [5];
		
		for (int i = 0; i < vetorX.length; i++) {
			vetorX[i] = sc.nextInt();
		}
		int cont = vetorY.length - vetorY.length;
		for (int i = vetorY.length-1; i >= 0; i--) {
			vetorY[i] = vetorX[cont];
			cont++;
		}
		
		for (int i = 0; i < vetorY.length; i++) {
			System.out.println(vetorY[i]);

		}
		
		sc.close();
		
	}

}
