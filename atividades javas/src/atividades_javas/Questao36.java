package atividades_javas;
import java.util.Scanner;
public class Questao36 {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int ant = Integer.MIN_VALUE;
	        boolean crescente = true;
	        int n = sc.nextInt();
	        while (n != -1) {
	            if (n <= ant) crescente = false;
	            ant = n;
	            n = sc.nextInt();
	        }
	        System.out.println(crescente);
	    }
}
