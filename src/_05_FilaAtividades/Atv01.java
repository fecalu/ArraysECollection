package _05_FilaAtividades;

import java.util.LinkedList;
import java.util.Locale;
import java.util.Queue;
import java.util.Scanner;

public class Atv01 {

	public static void main(String[] args) {
		
		// Crie um programa que crie uma fila vazia, adicione alguns elementos a ela e imprima a fila na tela e também fazer estruturas de condição para
		// adicionar ou remover elemetos da fila.
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		Queue<String> filaDoPao = new LinkedList<>();
		
		String clientes = "";
		
		System.out.println("Digite os nomes dos clientes que irão comprar pão e digite 0(ZERO) para PARAR: ");
		
		while (!clientes.equals("0") ) {

			clientes = sc.nextLine();	
			if (!clientes.equals("0")) {
				filaDoPao.add(clientes);
			}
			
		}
		
		System.out.println("A ordem da fila do pão é a seguinte: ");
		
		for (String x : filaDoPao) {
			System.out.println(x);
		}
		System.out.println();
		System.out.println("Você gostaria de adicionar mais alguem ou remover ? Digite: sim/não");
		
		String resposta = sc.nextLine();
		
		
		if(resposta.equals("sim")) {
			System.out.println("Adicionar ou remover ? ('1' para add / '2' para remover)");
			int resposta2 = sc.nextInt();
			sc.nextLine();
			
			if(resposta2 == 1) {
				System.out.println("Diga o nome da pessoa que você que adicionar: ");
				String pessoa = sc.nextLine();
				filaDoPao.add(pessoa);
  			}
		}
		
		sc.nextLine();
		
		System.out.println("A ordem da fila do pão agora é essa: ");
		
		for (String x : filaDoPao) {
			System.out.println(x);
		}
		
		
			
		sc.close();
		
	}

}
