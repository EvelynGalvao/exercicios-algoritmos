import java.util.ArrayList;

public class Exercicio4 {

    public static void main(String[] args) {
        // crie as seguintes funções:
        // TOTALPARES: a função recebe como parâmetro um array de inteiros e retorna um numero inteiro indicando
        // um total de numeros pares existentes no array.

        ArrayList<Integer> numeros = new ArrayList<Integer>();

        numeros.add(54);
        numeros.add(48);
        numeros.add(2);
        numeros.add(75);
        numeros.add(10);
        numeros.add(15);
        numeros.add(1);

        System.out.println(totalPares(numeros));
    }

    public static int totalPares(ArrayList<Integer> numeros) {

        int pares = 0;

        for (int i = 0; i < numeros.size(); i++) {
            if (numeros.get(i) % 2 == 0) {
                pares++;
            }
        }
        return pares;
    }
}


// MAIORVALOR: a função recebe como parâmetro um array de inteiros e retorna o maior número existente no array.
// TOTALIGUAIS: a função recebe como parâmetro um array de inteiros e retorna o total números iguais existentes em ambos
//os arrays.