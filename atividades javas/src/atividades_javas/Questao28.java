package atividades_javas;
import java.util.Scanner;
public class Questao28 {
	  public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Digite um limite do seu investimento: ");
	        final double LIMITE = sc.nextDouble();
	        System.out.println("Digite o valor a ser investido: ");
	        double valorInvestido = sc.nextDouble();
	        System.out.println("Valor taxa fixa em porcentagem: ");
	        double taxaFixa = sc.nextDouble();

	        double montante = valorInvestido;
	        for (int i = 1; i <= 12; i++) {
	            montante = montante * (1 + taxaFixa / 100);
	            if (montante >= LIMITE) {
	                System.out.println("Mês " + i + " ultrapassou");
	            }
	            System.out.println(montante);
	        }
	    }
}