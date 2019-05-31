package aula6;

import java.util.Scanner;

public class NotasMediaMetodoJef {
	
	public static double nota() {
		Scanner input = new Scanner (System.in);
		double x = input.nextDouble();
		return x;
	}
	
	public static int peso() {
		Scanner input = new Scanner (System.in);
		int x = input.nextInt();
		return x;
	}
	
	public static double mediaPonderada(double n1, double n2, double n3, int p1, int p2, int p3) {
		int somaPeso = p1 + p2 + p3;		
		double mediaPonderada = (n1*p1) + (n2*p2) + (n3*p3)/somaPeso;
		return mediaPonderada; 
	}

	public static void main(String[] args) {
		
		double n1= 0.0;
		double n2= 0.0;
		double n3= 0.0;
		
		int p1 = 0;
		int p2 = 0;
		int p3 = 0;
		
		System.out.println("Digite nota1: ");
		n1 = nota();
		System.out.println("Digite peso1: ");
		p1 = peso();
		
		System.out.println("Digite nota2: ");
		n2 = nota();
		System.out.println("Digite peso2: ");
		p2 = peso();
		
		System.out.println("Digite nota3: ");
		n3 = nota();
		System.out.println("Digite peso3: ");
		p3 = peso();
		
//		System.out.println(somaPesos(p1,p2,p3));
		System.out.println(mediaPonderada(n1,n2,n3,p1,p2,p3));
	}

}
