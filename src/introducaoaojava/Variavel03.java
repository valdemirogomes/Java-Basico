package introducaoaojava;

import javax.swing.JOptionPane;

public class Variavel03 {

	public static void main(String[] args) { 
	    /*  
	    Elabore um algoritmo que leia o Salário Bruto, o Adicional Noturno, as Horas Extras
		e os Descontos de um Colaborador, em variáveis do tipo float e exiba na tela o 
		Salário Líquido.
	    */
		
		//Scanner leia = new Scanner(System.in);
		
		float salarioBruto, adicionalNoturno, horasExtras, salarioLiquido, desconto = 0;
		
		
	     salarioBruto = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor do salario."));
	     adicionalNoturno = Float.parseFloat(JOptionPane.showInputDialog("Valor do adicional noturno."));
	     horasExtras = Float.parseFloat(JOptionPane.showInputDialog("Horas extras trabalhadas."));
	     horasExtras = Float.parseFloat(JOptionPane.showInputDialog("Valor do desconto."));
	     
	     
	     salarioLiquido = salarioBruto + adicionalNoturno + (horasExtras*5) - desconto;
	     JOptionPane.showInternalMessageDialog(null, salarioLiquido);

	     

	}

}
