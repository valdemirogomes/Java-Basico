package introducaoaojava;

import java.util.Scanner;

public class LacoDeRepeticaoFor {

	public static void main(String[] args) {
		/*
		Escreva um algoritmo em Java, que leia 10 números inteiros via teclado e 
		mostre na tela quantos números são pares e quantos número são ímpares. 
		*/
			
		Scanner leia = new Scanner(System.in);
		int numero = 0, numPar=0, numImpar = 0, contador = 0;
		 
		 for(int i = 1; i <11; i++) {
			 System.out.println("Digite o " + i + " valor");
			 numero = Integer.parseInt(leia.nextLine());
			 if(numero%2==0) {
				 System.out.println(contador);
				 numPar++;
				 
			 }else if(numero%2>0){
				 numImpar++;
			 }
		 }
		 System.out.print(" Total de numeros Par " + numPar);
		 System.out.println(" Total de numeros Impar " + numImpar);
	}
	
}




		

		 

