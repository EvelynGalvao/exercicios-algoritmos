import java.lang.reflect.Array;
import java.util.ArrayList;

public class Exercicio6 {
    public static void main(String[] args) {
        // TOTALIGUAIS: a função recebe como parâmetro dois arrays de inteiros e retorna o total números iguais existentes em ambos
        //os arrays.

        ArrayList<Integer> lista1 = new ArrayList<Integer>();

        lista1.add(54);
        lista1.add(48);
        lista1.add(2);
        lista1.add(75);
        lista1.add(10);
        lista1.add(15);
        lista1.add(1);

        ArrayList<Integer> lista2 = new ArrayList<Integer>();

        lista2.add(1);
        lista2.add(14);
        lista2.add(14);
        lista2.add(14);
        lista2.add(14);
        lista2.add(2);
        lista2.add(14);


        System.out.println (totalPares(lista1 ,lista2));
    }

    public static int totalPares(ArrayList<Integer> lista1, ArrayList<Integer> lista2) {

        int totalPares = 0;

        for (int num : lista1) {

            for (int num2 : lista2) {
                if (num == num2){
                    totalPares++;
                }
            }
        }
        return totalPares;
    }
}
