package atividades_javas;
import java.util.Scanner;
public class Questao35 {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int a = sc.nextInt(), b = sc.nextInt();
	        int mmc = a > b ? a : b;
	        while (mmc % a != 0 || mmc % b != 0) {
	            mmc++;
	        }
	        System.out.println(mmc);
	    }
}
