import kotlin.math.UMathKt;

import java.util.Scanner;

public class Exercicio8 {
    //* Crie um algoritmo que receba base e expoente, e calcule a potência.

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);
        int base ;
        int expoente;
        int potencia = 0;
        System.out.println("Digite uma base inteira");
        base = Integer.parseInt(read.next());

        System.out.println("Digite um expoente inteiro");
        expoente = Integer.parseInt(read.next());

        for (int i = 1; i < expoente; i++){
            potencia = base * base;

            base = potencia;

        }
        System.out.println(potencia);
    }
}
