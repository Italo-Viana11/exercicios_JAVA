package atividades_javas;
import java.util.Scanner;
public class Questao16 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um numero: ");
        int numero = sc.nextInt();

        int quantidadeDigitos = 0;
        int aux = numero;
        while (aux > 0) {
            quantidadeDigitos++;
            aux = aux / 10;
        }

        int soma = 0;
        aux = numero;
        for (int i = 0; i < quantidadeDigitos; i++) {
            int digito = aux % 10;
            soma = soma + (int) Math.pow(digito, quantidadeDigitos);
            aux = aux / 10;
        }

        if (soma == numero) {
            System.out.println(numero + " e um numero de Armstrong.");
        } else {
            System.out.println(numero + " nao e um numero de Armstrong.");
        }
    }
}
