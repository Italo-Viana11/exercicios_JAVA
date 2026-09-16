package atividades_javas;
import java.util.Scanner;
public class Questao18 {
	  public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Digite um numero: ");
	        int numero = sc.nextInt();

	        int soma = 0;
	        while (numero > 0) {
	            int digito = numero % 10;
	            soma = soma + digito;
	            numero = numero / 10;
	        }

	        System.out.println("Soma dos digitos: " + soma);
	    }
	}
