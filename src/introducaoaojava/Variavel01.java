package introducaoaojava;

import java.util.Scanner;

public class Variavel01 {

	public static void main(String[] args) {
		/* Leia quatro valores inteiros (numero1, numero2, numero3 e numero4).
		   A seguir, calcule e mostre a diferença do produto entre o numero1 e o numero2 
		   pelo produto entre o numero3 e o numero4. 
		 */
		
		Scanner leia = new Scanner(System.in);
		//Definindo variaveis do tipo int
		int numero1 = 0, numero2 = 0, numero3, numero4; 
		int diferenca;
		
		System.out.println("Digite o primeiro numero");
		numero1 = leia.nextInt();
		System.out.println("Digite o segundo numero");
		numero2 = leia.nextInt();
		System.out.println("Digite o terceiro numero");
		numero3 = leia.nextInt();
		System.out.println("Digite o quarto numero");
		numero4 = leia.nextInt();
		
		diferenca = (numero1*numero2)-(numero3*numero4);
				
		System.out.println("O resultado da diferença é " + diferenca);
		
		
		
		


	}

}
