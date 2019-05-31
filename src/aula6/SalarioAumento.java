package aula6;

import java.util.Scanner;

public class SalarioAumento {
	
	public static double inputD() {
		Scanner input = new Scanner (System.in);
		double x = input.nextDouble();
		return x;
	}
	
	public static double aumento(double salario, double percentual) {
		double calcule = percentual/100;
		double aumento = salario * calcule;
		return aumento;
	}
	
	public static double novoSalario(double salario, double percentual) {
		double calcule = percentual/100;
		double aumento = salario * calcule;
		double novoSalario = salario + aumento;
		return novoSalario;
	}

	public static void main(String[] args) {
		
		System.out.print("Digite o salario do funcionario: ");
		double salario = inputD();
		System.out.print("Digite percentual de aumento: ");
		double percentual = inputD();
		
		System.out.println("O valor do aumentou: " + aumento(salario,percentual));
		System.out.println("O salario novo: " + novoSalario(salario,percentual));
	}

}
