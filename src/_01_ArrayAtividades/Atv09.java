package _01_ArrayAtividades;

import java.util.Locale;
import java.util.Scanner;

public class Atv09 {

	public static void main(String[] args) {
		/*Faça um procedimento que receba a temperatura média de cada mês do ano e armazene-as em
		um vetor. Após isto, calcule a média anual das temperaturas e mostre todas as temperaturas acima
		da média anual, e em que mês elas ocorreram (mostrar o mês por extenso: 1 – Janeiro, 2 –Fevereiro,
		. . . ). Utilize dois vetores um para cada informação.*/
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double [] tempAnual = new double[12];
		String [] meses = {"Jan","Fev","Mar","Abr","maio", "jun", "jul", "ago", "set", "out", "nov", "dez"};
		
		double soma = 0;
		for (int i = 0; i < meses.length; i++) {
			tempAnual[i] = sc.nextDouble();
			soma += tempAnual[i];
		}
		
		for (int i = 0; i < meses.length; i++) {
			System.out.println(meses[i]+ " - " + tempAnual[i]);
		}
		
		System.out.println("A média anual é de: "+ soma/12 + "°");
		
		sc.close();
		
		
	}

}
