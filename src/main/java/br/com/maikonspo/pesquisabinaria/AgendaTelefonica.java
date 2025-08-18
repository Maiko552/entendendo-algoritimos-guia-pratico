package br.com.maikonspo.pesquisabinaria;

import java.util.Map;
import java.util.TreeMap;

public class AgendaTelefonica {

    static Map<String, String> agendaTelefonica = new TreeMap<>();

    static void addAgenda(String nome, String tel) {
        agendaTelefonica.put(nome, tel);
    }

    static void buscaDentroMap(String nome) {
        String telefone = agendaTelefonica.get(nome);
        if (telefone != null) {
            System.out.println("Nome: " + nome + " | Telefone: " + telefone);
        } else {
            System.out.println("Contato \"" + nome + "\" não encontrado.");
        }
    }

    public static void main(String[] args) {
        addAgenda("Maikon", "1123456790");
        addAgenda("Jonathan", "098654432");
        addAgenda("Meire", "43958495");
        addAgenda("José", "574838593");
        addAgenda("João", "11839043040");
        addAgenda("Sarah", "57756545434");

        buscaDentroMap("Maikon");
        buscaDentroMap("Sarah");
        buscaDentroMap("Lucas");
    }
}
