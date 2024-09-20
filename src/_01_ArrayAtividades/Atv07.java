package _01_ArrayAtividades;

import java.util.Locale;
import java.util.Scanner;

public class Atv07 {

	public static void main(String[] args) {
		
		/*Faça um procedimento que peça a idade e a altura de 5 pessoas, armazene cada informação no
		seu respectivo vetor. Imprima a media das idades, a media das alturas, o mais novo, o mais velho,
		o mais alto e mais baixo.*/
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int somaIdade = 0;
		double somaAltura = 0;

		
		
		int[] idade = new int[5];
		double[] altura =  new double[5];
		
		System.out.println("Digite a idade e altura dos candidados: ");
		
		for (int i = 0; i < 5; i++) {
		System.out.printf("Candidato %d\n",i+1);
			idade[i] = sc.nextInt();
			altura[i] = sc.nextDouble();
			
			somaIdade += idade[i];
			somaAltura += altura[i];
			
		}
		
		int maiorIdade = idade[0];
		int menorIdade = idade[0];
		
		for (int i = 0; i < 5; i++) {
			if (idade[i] > maiorIdade) {
				maiorIdade = idade[i];
			}
			
			if (idade[i] < menorIdade) {
				menorIdade = idade[i];
			}
		
		}

	
		double mediaIdade = somaIdade/idade.length;
		double mediaAltura = somaAltura/altura.length;
		
		
		System.out.printf("Média Idade = %f\n",mediaIdade);
		System.out.printf("Média Altura = %f\n",mediaAltura);
		
		System.out.printf("Maior Idade = %d\n",maiorIdade);
		System.out.printf("Menor Idade = %d\n",menorIdade);
		
		sc.close();

	}

}
