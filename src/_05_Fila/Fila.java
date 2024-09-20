package _05_Fila;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

	public static void main(String[] args) {
		
		/* EXEMPLO DE ONDE USAR FILA : Por exemplo, um servidor de mensagens pode usar uma fila 
		 * para processar as mensagens recebidas dos clientes em ordem de chegada.
		 */
		
		
		//IMPLEMENTAÇÃO DE UMA PILHA 
		Queue<String> fila = new LinkedList<>();
		
		// Offer e Add -> adicionam elementos na fila
		
		// Diferença é o comportamento ocorre
		// quando a fila está cheia!
		fila.add("Ana");  // Lança uma exceção (erro)
		fila.offer("Bia"); // retorna false
		fila.add("Carlos");
		fila.offer("Daniel");
		fila.add("Rafaela");
		fila.offer("Gui");
		
		// Peek e Element -> obter(mostra) o próximo elemento da fila (sem remover)
		
		// Diferença é o comportamento ocorre
		// quando a fila está vazia!
		System.out.println(fila.peek()); // retorna false (null)
		System.out.println(fila.peek());
		System.out.println(fila.element()); // Lança uma exceção (erro)
		System.out.println(fila.element());
				
		// Poll e Remove -> obter o próximo elemento
		// da fila e remove!
		
		// Diferença é o comportamento ocorre
		// quando a fila está vazia!
		System.out.println(fila.poll()); // retorna false (null)
		System.out.println(fila.remove()); // Lança uma exceção
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.remove());
		
		// fila.size();            retorna tamanho da fila 
		// fila.clear();           limpa a fila
		// fila.isEmpty();         para saber se a fila está ou não vazia 
		// fila.contains(...)      pega o primeiro elemento da fila já removendo 
		
	}
}