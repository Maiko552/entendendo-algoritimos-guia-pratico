package br.com.maikonspo.pesquisabinaria;

import java.util.Map;
import java.util.TreeMap;

public class  AgendaTelefonica {

    static Map<String, String> agendaTelefonica = new TreeMap<>();

    static void addAgenda(String nome, String tel) {
        agendaTelefonica.put(nome, tel);
    }

    static void agendaCompleta() {
        System.out.printf("%-15s | %-15s%n", "NOME", "TELEFONE");
        System.out.println("-----------------+-----------------");
        for (Map.Entry<String, String> entry : agendaTelefonica.entrySet()) {
            System.out.printf("%-15s | %-15s%n", entry.getKey(), entry.getValue());
        }
    }


    static void buscaDentroMapPorValorAgendaCompleta(String tel){
        for (Map.Entry<String, String> entry : agendaTelefonica.entrySet()) {
            if (entry.getValue().equals(tel)) {
                System.out.println("Telefone " + tel + " pertence a: " + entry.getKey());
                return;
            }
        }
        System.out.println("Telefone \"" + tel + "\" não encontrado.");
    }

    static void buscaDentroMapLetraA() {
        System.out.printf("%-15s | %-15s%n", "NOME", "TELEFONE");
        System.out.println("-----------------+-----------------");

        boolean encontrou = false;
        for (Map.Entry<String, String> entry : agendaTelefonica.entrySet()) {
            if (entry.getKey().toUpperCase().startsWith("A")) {
                System.out.printf("%-15s | %-15s%n", entry.getKey(), entry.getValue());
                encontrou = true;
            }
        }

        if (!encontrou) {
            System.out.println("Nenhum contato iniciado com a letra A.");
        }
    }


    static void buscaDentroMapPorChave(String nome) {
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
        addAgenda("Almerinda", "95832094244");

        buscaDentroMapPorChave("Maikon");
        buscaDentroMapPorChave("Sarah");
        buscaDentroMapPorChave("Lucas");
        buscaDentroMapPorValorAgendaCompleta("57756545434");

        agendaCompleta();

        buscaDentroMapLetraA();

    }
}
