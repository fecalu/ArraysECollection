package _01_ArrayAtividades;

import java.util.Locale;
import java.util.Scanner;

public class Atv01TDE {

	public static void main(String[] args) {
		// Fazer um programa para ler 5 valores e, em seguida, mostrar a posição onde se encontram o maior e o
		//menor valor.
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		
		
		double [] valores = new double[5];
		System.out.println("Digite os 5 valores: ");
		
		for (int i = 0; i < valores.length; i++) {
			valores[i] = sc.nextDouble();
		}
		double maior = valores[0];
		double menor = valores[0];
		
		for (int i = 0; i < valores.length; i++) {
			
			if (valores[i] > maior) {
				maior = valores[i];	
			}
			
			if (valores[i] < menor ) {
				menor = valores[i];
			}
			
		}
		
		for (int i = 0; i < valores.length; i++) {
			if (valores[i] == maior) {
				System.out.printf("Maior valor tá na posição: %d",i);
			}
			
		}
		
		for (int i = 0; i < valores.length; i++) {
			if (valores[i] == menor) {
				System.out.printf("Menor valor tá na posição: %d",i);
			}
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		sc.close();
		
		
		
		
		
	}

}
