package introducaoaojava;

import java.util.Arrays;
import java.util.Scanner;

public class MaiorMenor {

	public static void main(String[] args) {
		//Faça um programa que receba três inteiros e diga qual deles é o maior.
		Scanner leia = new Scanner(System.in);
		int valor[] = new int[3];
		int resultado = 0;
		
		// Preenche o vetor a parti da posição 1
		for(int i =0; i<valor.length; i++) {
			System.out.println("Digite o "+(i+1)+" valor");
			valor[i] = leia.nextInt();
		}
		
		//Ordenar vetor
		Arrays.sort(valor);
		
        // Lista o vetor em ordem crescente
		for(int x = 0; x<valor.length; x++) {
			System.out.println(valor[x]);
		}

	}

}
