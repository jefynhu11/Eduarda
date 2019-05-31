package aula6;

import java.util.Scanner;

public class TrocaValores {

	public static int inputI() {
		Scanner input = new Scanner (System.in);
		int x = input.nextInt();
		return x;
	}
	
	public static void main(String[] args) {
		int x,y;
		
		System.out.print("Digite o primeiro numero: ");
		x = inputI();
		System.out.print("Digite o segundo numero: ");
		y = inputI();
		
		System.out.println("Os valores trocados sao: " + y + " " + x);
		

	}

}
