package atividades_javas;
import java.util.Scanner;
public class Questao24 {
	   public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt();
	        int i = 1;
	        while (i <= 10) {
	            int r = n * i;
	            if (r % 7 == 0) {
	                System.out.println(r);
	                break;
	            }
	            i++;
	        }
	    }
}
