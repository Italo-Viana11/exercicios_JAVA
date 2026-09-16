package atividades_javas;
public class Questao22 {
	public static void main(String[] args) {
        String texto = "Java e muito Legal";
        int maius = 0, minus = 0;
        for (int i = 0; i < texto.length(); i++) {
            char c = texto.charAt(i);
            if (c >= 'A' && c <= 'Z') maius++;
            else if (c >= 'a' && c <= 'z') minus++;
        }
        System.out.println("Maiusculas: " + maius + " Minusculas: " + minus);
    }
}
