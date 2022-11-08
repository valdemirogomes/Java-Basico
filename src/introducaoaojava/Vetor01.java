package introducaoaojava;

import java.util.Scanner;

public class Vetor01 {
	
	public static void main(String[] args) {
		
		/*
		 Dado um vetor contendo 10 números inteiros não ordenados e não repetidos, construa um
		 algoritmo que consiga pesquisar dados no vetor, onde o usuário irá digitar um número e o 
		 programa deve exibir na tela a posição deste número no vetor. 
		 */
		
		Scanner leia = new Scanner(System.in);
		int vetor[] = {1,2,3,4,5,6,7,8,9,10};
		int valor;
		
		for(int i = 0; i<10; i++) {
			System.out.println(i + " "+vetor[i]+"\n");
			
		}
		
		System.out.println("Digite um valor entre 0 e 9");
		valor = leia.nextInt();
		
		for(int i = 0; i<10; i++) {
			
		}
		System.out.println(valor + " "+vetor[valor]);


	}

}
