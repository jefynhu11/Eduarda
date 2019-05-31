package aula4;

public class Atividade2 {

	public static void main(String[] args) {
		
		int [][] m = new int [5][5];
		int numerico = 1;
		
		for (int linha = 0; linha < m.length; linha++) {		
			for (int coluna = 0; coluna < m.length; coluna++) {
				m[linha][coluna] = numerico;
				numerico++;
			}
		}
		
		for (int linha = 0; linha < m.length; linha++) {
			System.out.println();			
			for (int coluna = 0; coluna < m.length; coluna++) {
				System.out.print(m[linha][coluna] + " ");
			}
		}

	}

}
