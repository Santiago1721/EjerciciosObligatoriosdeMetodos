import java.util.Scanner;
public class Ejercicio3 {
	
	   public static int evaluacion(int num) {

	        if (num < 5) {

	            System.out.println("Suspenso");

	        }else if (num >= 5 && num < 6){

	            System.out.println("Suficiente");

	        }else if(num >=6 && num < 7) {

	            System.out.println("Bien");

	        }else if (num >=7 && num < 9) {

	            System.out.println("Notable");

	           

	        }else {

	            System.out.println("Sobrasaliente");

	        }

	        return num;

	   }

	   

	       public static void main(String args[]) {

	           

	           Scanner lector = new Scanner(System.in);

	                   int a;

	                   System.out.print("Escriba la nota que ha sacado: ");

	                   a = lector.nextInt();

	                   

	                   lector.close();

	                   

	                   

	       System.out.print(evaluacion(a));                    

	               }

	               }
