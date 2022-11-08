package introducaoaojava;

import java.util.Scanner;

public class Vetor02 {
	
	public static void main(String[] args) {
	/*
	 * 
	 *	Elabore um algoritmo que leia 10 números inteiros e armazene em um vetor.
	 *  Em seguida, mostre na tela:
		Todos os elementos dos índices ímpares do vetor 
		Todos os elementos do vetor que são números pares
		A Soma de todos os elementos do vetor
		A Média de todos os elementos do vetor, armazenada em uma variável do tipo real

	 * 
	 */
		Scanner leia = new Scanner(System.in);
		int numImpar;
		
		//int vetor[] = new int [10];
		int vetor[] = {1,2,3,4,5,6,7,8,9,10};
			
		for(int i=0; i<10; i++) {
			if(vetor[i]%2!=0) {
				numImpar = vetor[i];
				System.out.println(numImpar);
				
			}
			
					
			
		}
		
	}
}
