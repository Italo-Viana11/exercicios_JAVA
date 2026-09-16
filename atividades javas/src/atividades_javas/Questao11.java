package atividades_javas;
import java.util.Scanner;
public class Questao11 {
	  public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Digite um numero de 1 a 10: ");
	        int numero = sc.nextInt();

	        for (int i = 1; i <= 10; i++) {
	            if (i % 3 == 0) {
	                continue;
	            }
	            System.out.println(numero + " x " + i + " = " + (numero * i));
	        }
	    }
}
