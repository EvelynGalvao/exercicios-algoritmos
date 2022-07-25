package dio.exercicios;

import java.util.Scanner;

public class ArrayNomeIdade {

// faça um programa que leia conjuntos de dois valores,
// nome e idade do aluno,parar o programa quando o nome for.

        public static void main(String[] args) {

            Scanner scan = new Scanner(System.in);

            String nome;
            int idade;

            while(true){

                System.out.println("nome");
                nome = scan.next();
                if(nome.equals("0")) break;

                System.out.println("idade");
                idade = scan.nextInt();

           }
            System.out.println("continua aqui...");
        }
    }