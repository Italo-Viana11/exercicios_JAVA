package atividades_javas;

public class Questao07 {
  public static void main(String[] args) {
    for (int numero = 1; numero <= 500; numero++) {
        int somaDivisores = 0;
        for (int divisor = 1; divisor < numero; divisor++) {
            if (numero % divisor == 0) {
                somaDivisores = somaDivisores + divisor;
            }
        }
        if (somaDivisores == numero && numero != 0) {
            System.out.println(numero);
        }
    }
}
}
