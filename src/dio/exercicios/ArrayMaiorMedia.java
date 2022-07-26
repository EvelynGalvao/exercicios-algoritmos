package dio.exercicios;

import java.util.Scanner;

public class ArrayMaiorMedia {
// ler 5 números e informe o maior número e a média desses números.

    public static void main(String[] args) {

        Scanner scan =  new Scanner(System.in);

        int numero;
        int maior= 0;
        int count = 0;

        do{
            System.out.println("número: ");
            numero = scan.nextInt();

            if(numero >maior){
                maior = numero;
            }

            count = count + 1;
        } while(count < 5);

        System.out.println("o maior número é: " + maior);

    }
}
