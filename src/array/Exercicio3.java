package array;

import java.util.Scanner;

public class Exercicio3 {
    // ler o  nome do usuário e printar o nome 10 vezes.

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        String nome;
        System.out.println("Digite seu nome:");
        nome = read.next();

        for( int i = 0; i<=10; i++){
            System.out.println(nome);
        }
    }
}
