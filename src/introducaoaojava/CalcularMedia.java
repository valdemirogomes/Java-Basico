package introducaoaojava;

import java.util.Scanner;

public class CalcularMedia {

	public static void main(String[] args) {
		
		double nota, contador = 0;
		  
		
		Scanner leia = new Scanner(System.in);
		
		
		for(int i = 0; i<=3; i++) {
			System.out.print("Digite a "+(i+1)+" nota ");
			nota = leia.nextDouble();

			
			contador += nota;
			
			
		}
		System.out.println("Media = "+contador/4);


	}

}
