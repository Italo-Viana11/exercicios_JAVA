package atividades_javas;
import java.util.Scanner;
public class Questao39 {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int limite = sc.nextInt();
	        int soma = 0;
	        for (int i = 1; soma + i <= limite; i++) {
	            soma += i;
	            System.out.println(soma);
	        }
	    }
}
