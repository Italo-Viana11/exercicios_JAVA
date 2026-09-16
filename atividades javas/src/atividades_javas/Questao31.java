package atividades_javas;

public class Questao31 {
	  public static void main(String[] args) {
	        int[] num = {5, -3, 0, 8, -1, 0, 7};
	        int pos = 0, neg = 0, zero = 0;
	        for (int i = 0; i < num.length; i++) {
	            if (num[i] > 0) pos++;
	            else if (num[i] < 0) neg++;
	            else zero++;
	        }
	        System.out.println(pos + " " + neg + " " + zero);
	    }
}
