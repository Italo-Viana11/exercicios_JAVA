package atividades_javas;
import java.util.Scanner;
public class Questao23 {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        String p = sc.next();
	        boolean ok = true;
	        for (int i = 0; i < p.length() / 2; i++) {
	            if (p.charAt(i) != p.charAt(p.length() - 1 - i)) ok = false;
	        }
	        System.out.println(ok ? "Palindroma" : "Nao e palindroma");
	    }
}
