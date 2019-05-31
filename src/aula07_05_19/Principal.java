package aula07_05_19;

import java.util.Scanner;

public class Principal {

	public static double inputD() {
		return new Scanner(System.in).nextDouble();
	}
	
	public static void main(String[] args) {
		//thread
		Scanner input = new Scanner (System.in);
		int op;
		double num1,num2;
		Calculadora cal = new Calculadora();
		System.out.println("1: Adicao\n"
				+ "2: Subtracao\n"
				+ "3: divisao\n"
				+ "4: multiplicacao\n");
		System.out.println("Digite opcao");
		op = input.nextInt();
		switch (op) {
			case 1:
				System.out.println("Escolheu ADICAO");
				System.out.println("Digite primeiro numero:");
				num1 = inputD();
				System.out.println("Digite segundo numero:");
				num2 = inputD();
				System.out.println("Resultado:");
				System.out.println(cal.soma(num1,num2));
				break;
			case 2:
				System.out.println("Escolheu SUBTRACAO");
				System.out.println("Digite primeiro numero:");
				num1 = inputD();
				System.out.println("Digite segundo numero:");
				num2 = inputD();
				System.out.println("Resultado:");
				System.out.println(cal.subtracao(num1,num2));
				break;
			case 3:
				System.out.println("Escolheu DIVISAO");
				System.out.println("Digite primeiro numero:");
				num1 = inputD();
				System.out.println("Digite segundo numero:");
				num2 = inputD();
				if(num2>0) {					
					System.out.println("Resultado:");
					System.out.println(cal.dividir(num1,num2));
				}else {
					System.out.println("não é possível dividir um número por zero");
				}
				break;
			case 4:
				System.out.println("Escolheu MULTIPLICACAO");
				System.out.println("Digite primeiro numero:");
				num1 = inputD();
				System.out.println("Digite segundo numero:");
				num2 = inputD();
				System.out.println("Resultado:");
				System.out.println(cal.multiplicar(num1,num2));
				break;
			default:
				System.out.println("Invalido");
			
		}
		

	}

}
