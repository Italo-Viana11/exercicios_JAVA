package atividades_javas;
import java.util.Scanner;
public class Questao38 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int base = sc.nextInt(), exp = sc.nextInt();
        int resultado = 1;
        if (exp != 0) {
            for (int i = 1; i <= exp; i++) resultado *= base;
        }
        System.out.println(resultado);
    }
}
