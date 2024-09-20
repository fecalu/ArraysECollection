package _01_ArrayAtividades;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class atv03 {

	public static void main(String[] args) {
		/*Ler um conjunto de números reais, armazenando-o em vetor e calcular o quadrado das
		componentes deste vetor, armazenando o resultado em outro vetor. Os conjuntos têm 10 elementos
		cada. Imprimir todos os conjuntos.*/
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		double[] vetorOrigem = new double[10];
		
		for (int i = 0; i < vetorOrigem.length; i++) {
			vetorOrigem[i] = sc.nextDouble();
		}
		
		double[] vetorSecun = new double[vetorOrigem.length];
		
		for (int i = 0; i < vetorSecun.length; i++) {
			vetorSecun[i] = vetorOrigem[i] * vetorOrigem[i];
		}
		
		System.out.println("Elementos digitados: ");
		System.out.println(Arrays.toString(vetorOrigem));
		System.out.println("Elementos ao quadrado: ");
		System.out.println(Arrays.toString(vetorSecun));
		
		sc.close();
		
	}

}
