package atividades_javas;
import java.util.Scanner;
public class Questao40 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String senha = "1234";
        int tent = 0;
        boolean ok = false;
        while (tent < 3 && !ok) {
            String s = sc.next();
            tent++;
            if (s.equals(senha)) {
                ok = true;
                System.out.println("Acesso liberado");
            } else {
                System.out.println("Restam " + (3 - tent));
            }
        }
    }
}
