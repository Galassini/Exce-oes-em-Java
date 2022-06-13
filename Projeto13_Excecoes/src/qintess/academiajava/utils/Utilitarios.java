package qintess.academiajava.utils;

public class Utilitarios {
	
	//metodo que recebe dois parametros numericos e retorna sua soma
	public static double somar(double x, double y) {
		double resultado = x + y;
		return resultado;
	}
	
	//Metodo que recebe um valor em dolares e retorna um valor em reais
	//(tomando como base o dolar do dia 14/04/2022
	
	public static double dolarParaReal(double dolar) {
		return dolar * 4.696;
	}

}
