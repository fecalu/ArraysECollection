package _01_ArrayAtividades;

import java.util.Locale;
import java.util.Scanner;


public class Atv01 {

	public static void main(String[] args) {
		
		
		//Dado o seguinte vetor [1,2,4,16,32,64,-128] implemente um procedimento que indique menor e
		//o maior elemento do vetor.
		
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
	
		
		int valores[] = {1000,2,4,16,32,64,-128};
		
		int maior = valores[0];
		int menor = valores[0];
		
		for (int i = 0; i < valores.length; i++) {
			
			if (valores[i] > maior) {
				maior = valores[i];	
			}
			
			if (valores[i] < menor ) {
				menor = valores[i];
			}
			
		}
		
		System.out.printf("menor = %d\n",menor);
		System.out.printf("maior = %d",maior);

		sc.close();
		
		
	}

}
