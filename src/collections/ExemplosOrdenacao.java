package collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ExemplosOrdenacao {

    public static void main(String[] args) {

        List<Gato> meusGatos = new ArrayList<>(){{
            add(new Gato("biriba", 17, "preto e branco"));
            add(new Gato("bira", 20, "preto"));
            add(new Gato("biriba", 15, "branco"));
        }};

        System.out.println("--\t Ordem de Inserção\t---");
        System.out.println(meusGatos);

        System.out.println("--\t Ordem aleatória\t---");
        Collections.shuffle(meusGatos);
        System.out.println(meusGatos);

        System.out.println("--\t Ordem Natural\t---");
        Collections.sort(meusGatos);
        System.out.println(meusGatos);
    }
}



class Gato implements Comparable<Gato>{

    private String nome;
    private Integer idade;
    private String cor;

    public Gato(String nome, Integer idade, String cor){
        this.nome = nome;
        this.idade = idade;
        this.cor = cor;
    }

    public String getNome() {
        return nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public String getCor() {
        return cor;
    }

    @Override
    public String toString() {
        return "{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", cor='" + cor + '\'' +
                '}';
    }

    @Override
    public int compareTo(Gato gato) {
        return this.getNome().compareToIgnoreCase(gato.getNome());
    }
}