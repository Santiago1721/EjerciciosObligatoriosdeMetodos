package Metodos;

public class Ejercicio2 {
	
	public static void main(String [] args) {
		
		System.out.println("10001 " + esCapicua(1001));
		System.out.println("12021 " + esCapicua(12021));
		System.out.println("12023 " + esCapicua(12023));
		System.out.println("131 " + esCapicua(131));
		System.out.println("242 " + esCapicua(242));
		System.out.println("12345" + esCapicua(12345));
	}
	
	public static boolean esCapicua(int numero) {
		String[] digitos = String.valueOf(numero).split("");
		
		for(int i = 0, j = digitos.length - 1;i < digitos.length / 2; i++, --j) {
			if(!digitos[i].equals(digitos[j])) {
				return false;
			}
		}
		
		return true;
	}

}
