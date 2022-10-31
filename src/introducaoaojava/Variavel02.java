package introducaoaojava;

import java.util.Scanner;

public class Variavel02 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		 //Definindo variavel do tipo double
		 double salario, novoSalario, abono;
		 
		 System.out.println("Digite o valor do salario");
		 salario = leia.nextDouble();
		 
		 System.out.println("Qual o valor do abono?");
		 abono = leia.nextDouble();
		 
		 novoSalario = salario + abono;
		 
		 System.out.println("O novo salario é: " + novoSalario);
	

	}

}
