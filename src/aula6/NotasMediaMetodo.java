package aula6;

import java.util.Scanner;

public class NotasMediaMetodo {
	
	public static double inputValues(Scanner input) {
		double nota;
		System.out.println("Digite a nota");
		nota = input.nextDouble();
		return nota;
	}

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		double n1= 0.0;
		n1 = inputValues(input);
		System.out.println("Nota 1: " + n1);

	}

}
