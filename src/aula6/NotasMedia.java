package aula6;

import java.util.Scanner;

public class NotasMedia {

	public static void main(String[] args) {
		
		double nota1 = 0.0;
		double nota2 = 0.0;
		double nota3 = 0.0;
		double mediaPonderada = 0.0;
		
		int peso1 = 0;
		int peso2 = 0;
		int peso3 = 0;
		int somaPeso;
		
		Scanner input = new Scanner (System.in);
		
		System.out.println("Digite a nota 1:");
		nota1 = input.nextDouble();
		System.out.println("Digite o peso nota 1:");
		peso1 = input.nextInt();
		
		System.out.println("Digite a nota 2:");
		nota2 = input.nextDouble();
		System.out.println("Digite o peso nota 2:");
		peso2 = input.nextInt();
		
		System.out.println("Digite a nota 3:");
		nota3 = input.nextDouble();
		System.out.println("Digite o peso nota 3:");
		peso3 = input.nextInt();
		
		somaPeso = peso1 + peso2 + peso3;
		
		mediaPonderada = (nota1*peso1) + (nota2*peso2) + (nota3*peso3)/somaPeso;
		
		System.out.println("A media: " + mediaPonderada );

	}

}
