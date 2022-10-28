package introducaoaojava;

import java.util.Scanner;

public class OrdemCrescente {
	
	public static void main(String[] args) {
		//Faça um programa que receba três inteiros e diga qual deles é o maior.
		Scanner leia = new Scanner(System.in);
		int valor[] = new int[3];
		int resultado = 0;
		
		for(int i =0; i<valor.length; i++) {
			System.out.println("Digite o "+(i+1)+" valor");
			valor[i] = leia.nextInt();
			if(valor[i]>resultado) {
				resultado = valor[i];
				System.out.println(resultado);
				
			}
			
			
		}

	}

}
