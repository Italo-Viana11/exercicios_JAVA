package atividades_javas;
import java.util.Scanner;
public class Questao17 {
	   public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Digite um numero: ");
	        int numero = sc.nextInt();

	        int contador = 0;
	        if (numero == 0) {
	            contador = 1;
	        }

	        while (numero != 0) {
	            contador++;
	            numero = numero / 10;
	        }

	        System.out.println("Quantidade de digitos: " + contador);
	    }
}
