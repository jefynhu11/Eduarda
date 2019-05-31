package aula4;

import java.util.Scanner;

public class Atividade3 {
	
	public static double input() {
		Scanner teclado = new Scanner (System.in);
		double input = teclado.nextDouble();
		return input;
	}

	public static void main(String[] args) {

		int [][] alunos = new int [7][5];
		
		for (int linha = 0; linha < alunos.length; linha++) {
			for (int coluna = 0; coluna < 5; coluna++) {
				System.out.printf("%d Aluno %d nota: ", (linha+1),(coluna+1));
				alunos[linha][coluna] = (int)input();
			}
		}
		
		int[] mediaAluno = new int [alunos.length];
		int acu=0;
		for (int linha = 0; linha < alunos.length; linha++) {
			acu=0;
			System.out.println();			
			System.out.print((linha+1)+" Aluno notas: ");
			for (int coluna = 0; coluna < 5; coluna++) {
				System.out.print(alunos[linha][coluna] + " | ");
				acu = acu + alunos[linha][coluna];
				double media = acu/5;			
				mediaAluno[linha] = (int)media;
			}
			System.out.println("A media eh: "+mediaAluno[linha]);
		}
		System.out.println();

		for (int i = 0; i < alunos.length; i++) {
		}
		double mediaTurma=0;
		acu=0;
		System.out.println();
		for (int i = 0; i < alunos.length; i++) {
			acu = acu + mediaAluno[i];
			mediaTurma = acu/mediaAluno.length;
		}
		System.out.println("A media na turma: " + mediaTurma);
	}
}