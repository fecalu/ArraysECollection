package _01_ArrayAtividades;

import java.util.Locale;
import java.util.Scanner;


public class Atv02 {

	public static void main(String[] args) {
		
		
		//Dado o vetor do exemplo anterior implemente o procedimento que calcule a soma dos
		//elementos do vetor.
		
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		
		int soma = 0;
		
		int valores[] = {1,2,4,16,32,64,-128};
		
		for (int i = 0; i < valores.length; i++) {
			soma += valores[i];
		}
		
		System.out.printf("soma = %d",soma);
		
		
		
		
		
		
		
		
		
		sc.close();
		
		
	}

}
