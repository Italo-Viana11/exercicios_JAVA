package atividades_javas;
import java.util.Scanner;
public class Questao30 {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int op;
	        do {
	            System.out.println("1-Soma 2-Sub 3-Mult 4-Div 5-Sair");
	            op = sc.nextInt();
	            if (op >= 1 && op <= 4) {
	                double a = sc.nextDouble();
	                double b = sc.nextDouble();
	                switch (op) {
	                    case 1: System.out.println(a + b); break;
	                    case 2: System.out.println(a - b); break;
	                    case 3: System.out.println(a * b); break;
	                    case 4:
	                        if (b == 0) System.out.println("Erro");
	                        else System.out.println(a / b);
	                        break;
	                }
	            }
	        } while (op != 5);
	    }
}
