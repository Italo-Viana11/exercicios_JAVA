package atividades_javas;
import java.util.Scanner;
public class Questao20 {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Digite N: ");
	        long n = sc.nextLong();

	        int passos = 0;
	        System.out.println(n);

	        while (n != 1) {
	            if (n % 2 == 0) {
	                n = n / 2;
	            } else {
	                n = n * 3 + 1;
	            }
	            System.out.println(n);
	            passos++;
	        }

	        System.out.println("Numero de passos: " + passos);
	    }
}
