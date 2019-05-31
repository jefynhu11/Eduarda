package aula4;

public class Atividade4 {

	public static void main(String[] args) {
		
		int [][] m = new int [8][8];
		int numerico = 0;
		
		for (int linha = 0; linha < m.length; linha++) {		
			for (int coluna = 0; coluna < m.length; coluna++) {
				m[linha][coluna] = numerico;
			}
			numerico++;
		}
		
		for (int linha = 0; linha < m.length; linha++) {
			System.out.println();			
			for (int coluna = 0; coluna < m.length; coluna++) {
				System.out.print(m[linha][coluna] + " ");
			}
		}

	}

}
