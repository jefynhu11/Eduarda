package aula6;

public class Metodos {

	public static int temp(int tem) {
		int x;
		x = tem - 32;
		return x;
	}
	
	public static void main(String[] args) {
		int f = 100;
		System.out.println("Grau Celsieus: " + temp(f));
		

	}

}
