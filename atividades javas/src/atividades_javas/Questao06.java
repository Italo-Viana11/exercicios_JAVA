package atividades_javas;
import java.util.Scanner;
public class Questao06 {
	  public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Digite um numero: ");
	        int n = sc.nextInt();

	        if (n < 0) {
	            System.out.println("Erro: nao existe fatorial de numero negativo!");
	        } else {
	            long fatorial = 1;
	            for (int i = 1; i <= n; i++) {
	                fatorial = fatorial * i;
	            }
	            System.out.println("Fatorial de " + n + " = " + fatorial);
	        }
	    }
}
