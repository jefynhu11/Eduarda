package aula07_05_19;

public class Calculadora {

	double num = 0.0;
	String soma = "+";
	String Subtracao = "-";
	String dividir = "/";
	String multiplicar = "*";
	
	public double soma(double n1, double n2) {
		double res = n1 + n2;
		return res;
	}
	
	public double subtracao(double n1, double n2) {
		double res = n1 - n2;
		return res;
	}
	
	public double dividir(double n1, double n2) {
		double res = n1 / n2;
		return res;
	}
	
	public double multiplicar(double n1, double n2) {
		double res = n1 * n2;
		return res;
	}
}