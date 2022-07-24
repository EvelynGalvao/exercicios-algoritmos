package array;

import java.util.ArrayList;

public class Exercicio5 {
    // MAIORVALOR: a função recebe como parâmetro um array de inteiros e retorna o maior número existente no array.

    public static void main(String[] args) {


        ArrayList<Integer> lista = new ArrayList<Integer>();

        lista.add(54);
        lista.add(48);
        lista.add(2);
        lista.add(75);
        lista.add(10);
        lista.add(15);
        lista.add(1);

        System.out.println(acharMaior(lista));
    }

    public static int acharMaior(ArrayList<Integer> lista) {

        int maior = 0;

        for (int i = 0; i < lista.size(); i++) {

            if (lista.get(i) > maior) {
                maior = lista.get(i);
            }
        }
        return maior;

    }
}