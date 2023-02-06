package EjerciciosObligatoriosMetodos;

import java.util.Scanner;
public class Ejercicio4 {


		public static void main(String [] args) {
				Scanner lector = new Scanner(System.in);
				
				System.out.println("indique el primer numero; ");
				int a = lector.nextInt();
				System.out.println("indique el segundo numero; ");
				int b = lector.nextInt();
				System.out.println("indique un numero decimal para hallar su raiz");
				double c = lector.nextDouble();
				//Invocamos los diferentes metodos.
				
				System.out.println("Suma " + suma (a ,b));
				System.out.println("Resta " + resta (a ,b));
				System.out.println("Multiplicacion " + Multiplicacion (a ,b));
				System.out.println("Division " + Division (a ,b));
				System.out.println("Cuadrado " + Cuadrado (c));
				
			}
			public static int suma(int a , int b) {
				return a + b;
			}
			public static int resta(int a , int b) {
				return a - b;
			}
			public static int Multiplicacion(int a , int b) {
				return a * b;
			}
			public static int Division(int a , int b) {
				return a / b;
			}
			public static double Cuadrado(double c) {
				return Math.sqrt(c);
			}
}

		
