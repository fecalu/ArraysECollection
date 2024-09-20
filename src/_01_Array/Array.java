package _01_Array;

import java.util.Arrays;

public class Array {

	public static void main(String[] args) {
		
		//MODELO PARA INSTANCIAR UM ARRAY 
		
		double[] notasAlunoA = new double[4];
		
		
		System.out.println(Arrays.toString(notasAlunoA)); // Aqui ta tudo zerado ainda pq ainda não foi atriuido os valores

		notasAlunoA[0] = 7.9;
		notasAlunoA[1] = 8;
		notasAlunoA[2] = 6.7;
		notasAlunoA[3] = 9.7;
	//	System.out.println(notasAlunoA);  Dessa forma não é possivel, pois imprime o endereço do array
		System.out.println(Arrays.toString(notasAlunoA)); //Com essa função é possivel chamar todos os valores de uma vez dentro de cada posição.
		System.out.println(notasAlunoA[0]); // Chamou uma posição unica do array. posição 0(zero)
		System.out.println(notasAlunoA[notasAlunoA.length - 1]); //Aqui chamou a posição 3(pq a função length é a qnt do array - 1. (4-1=3) )
		// System.out.println(notasAlunoA[4]); ERRO, pq só tem até a posição 3.
		
		double totalAlunoA = 0;
		
		//FORMA PARA PECORRER ESSSE ARRAY
		for(int i = 0; i < notasAlunoA.length; i++) {
			totalAlunoA += notasAlunoA[i];
		}
		
		System.out.println(totalAlunoA / notasAlunoA.length);
		
		final double notaArmazenada = 5.9;
		double[] notasAlunoB = { 6.9, 8.9, notaArmazenada, 10 }; // Uma boa forma de colocar todos os elementos do arrya de uma só vez usando '{}'
																// e tbm poed colocar variaveis externas
		
		double totalAlunoB = 0;
		for (int i = 0; i < notasAlunoB.length; i++) {
			totalAlunoB += notasAlunoB[i];
		}
		
		System.out.println(totalAlunoB / notasAlunoB.length);
	}

}
