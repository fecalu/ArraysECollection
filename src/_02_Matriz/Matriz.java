package _02_Matriz;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Matriz {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		

		System.out.print("Quantos alunos? ");
		int qtdeAlunos = sc.nextInt();

		System.out.print("Quantas notas por aluno? ");
		int qtdeNotas = sc.nextInt();
		
		//AQUI É A BASE PARA A CRIAÇÃO DE UMA MATRIZ (por padrão é iniciada com 0 zero)
		double[][] notasDaTurma = new double[qtdeAlunos][qtdeNotas];
		
		// UTILIZA-SE DOIS "FORs" PARA PRENCHIMENTO DA MATRIZ
		double total = 0;
		for (int a = 0; a < notasDaTurma.length; a++) {  //Primeiro "for" para percorrer as linhas 
			for (int n = 0; n < notasDaTurma[a].length; n++) {   //Segundo "for" para percorrer as colunas
				System.out.printf("Informe a nota %d do aluno %d: ", n + 1, a + 1);
				notasDaTurma[a][n] = sc.nextDouble();
				total += notasDaTurma[a][n];
			}
		}
		
		// Compentario a parte:  se fosse so mexer na diagonail principal é so trabanhar quando a e n forem iguias a==n, 
		//assim sempre vai mexer na principal.
		
		double media = total / (qtdeAlunos * qtdeNotas);
		System.out.println("Média da turma é " + media);

		for(double[] notasDoAluno: notasDaTurma) {			
			System.out.println(Arrays.toString(notasDoAluno));
		}
		
		sc.close();
		
	}
}