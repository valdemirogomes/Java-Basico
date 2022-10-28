package introducaoaojava;

import java.util.Scanner;

public class LogicaDeProgramacao {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		 double salario, novoSalario, abono;
		 
		 System.out.println("Digite o valor do salario");
		 salario = leia.nextDouble();
		 
		 System.out.println("Qual o valor do abono?");
		 abono = leia.nextDouble();
		 
		 novoSalario = salario + abono;
		 
		 System.out.println("O novo salario é: " + novoSalario);
	

	}

}
