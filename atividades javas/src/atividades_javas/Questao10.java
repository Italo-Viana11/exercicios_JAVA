package atividades_javas;
import java.util.Scanner;
public class Questao10 {
	  public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        double saldo = 1000.0;
	        int opcao;

	        do {
	            System.out.println("Saldo atual: R$ " + saldo);
	            System.out.println("1 - Sacar");
	            System.out.println("2 - Sair");
	            System.out.print("Escolha uma opcao: ");
	            opcao = sc.nextInt();

	            if (opcao == 1) {
	                System.out.print("Digite o valor do saque: ");
	                double valor = sc.nextDouble();
	                if (valor <= saldo) {
	                    saldo = saldo - valor;
	                    System.out.println("Saque realizado com sucesso!");
	                } else {
	                    System.out.println("Saldo insuficiente!");
	                }
	            }
	        } while (opcao != 2);

	        System.out.println("Saldo final: R$ " + saldo);
	    }
}
