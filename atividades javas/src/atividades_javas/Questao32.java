package atividades_javas;
import java.util.Scanner;
public class Questao32 {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt();
	        for (int i = 1; i <= n; i++) {
	            for (int j = 1; j <= i; j++) System.out.print("*");
	            System.out.println();
	        }
	    }
}
