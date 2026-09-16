package atividades_javas;
import java.util.Scanner;
public class Questao21 {
	 public static void main(String[] args) {
	        String frase = "A educacao e a base de tudo";
	        int cont = 0;
	        for (int i = 0; i < frase.length(); i++) {
	            char c = frase.charAt(i);
	            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') cont++;
	        }
	        System.out.println(cont);
	 }
}