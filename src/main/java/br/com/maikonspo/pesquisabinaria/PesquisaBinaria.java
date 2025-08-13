package br.com.maikonspo.pesquisabinaria;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class PesquisaBinaria {
    // TreeSet mantém a lista ordenada automaticamente
    static TreeSet<String> nomesList = new TreeSet<>();

    public static void addNomesLista(String nome) {
        nomesList.add(nome);
    }

    public static void verNomesLista() {
        System.out.println(nomesList);
    }

    public static void removerNomesLista(String nome) {
        nomesList.remove(nome);
    }

    public static void tamanhoLista() {
        System.out.println(nomesList.size());
    }

    public static void realizarBuscaBinaria(String nome) {
        List<String> listaOrdenada = new ArrayList<>(nomesList);

        int baixo = 0;
        int alto = listaOrdenada.size() - 1;
        boolean encontrado = false;

        while (baixo <= alto) {
            int meio = (baixo + alto) / 2;
            String chute = listaOrdenada.get(meio);
            int comparacao = chute.compareToIgnoreCase(nome);

            if (comparacao == 0) {
                System.out.println("Nome encontrado!");
                System.out.println("Nome: " + chute);
                System.out.println("Posição na lista ordenada: " + meio);
                encontrado = true;
                break;
            } else if (comparacao < 0) {
                baixo = meio + 1;
            } else {
                alto = meio - 1;
            }
        }

        if (!encontrado) {
            System.out.println("Nome \"" + nome + "\" não encontrado na lista.");
        }
    }

    public static void main(String[] args) {
        PesquisaBinaria.addNomesLista("Maikon");
        PesquisaBinaria.addNomesLista("Jonathan");
        PesquisaBinaria.addNomesLista("Meire");
        PesquisaBinaria.addNomesLista("José");
        PesquisaBinaria.addNomesLista("Eduardo");
        PesquisaBinaria.addNomesLista("Almerinda");
        PesquisaBinaria.addNomesLista("Zuão");

        PesquisaBinaria.realizarBuscaBinaria("Maikon");
        PesquisaBinaria.realizarBuscaBinaria("Carlos");
    }
}
