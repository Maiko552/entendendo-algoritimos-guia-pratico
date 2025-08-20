package br.com.maikonspo.pesquisabinaria;

public class Main {

    private static final int[] DENOMINACOES_CENTAVOS = {
            10000, 5000, 2000, 1000, 500, 200,
            100, 50, 25, 10, 5, 1
    };

    public static void valorDivididoEmNotasEMoedas(double valor) {
        int centavos = (int) Math.round(valor * 100.0);

        System.out.println("NOTAS:");
        for (int i = 0; i < 6; i++) {
            int qtd = centavos / DENOMINACOES_CENTAVOS[i];
            centavos %= DENOMINACOES_CENTAVOS[i];
            System.out.printf("%d nota(s) de R$ %.2f%n",
                    qtd, DENOMINACOES_CENTAVOS[i] / 100.0);
        }

        System.out.println("MOEDAS:");
        for (int i = 6; i < DENOMINACOES_CENTAVOS.length; i++) { // últimas 6 são moedas
            int qtd = centavos / DENOMINACOES_CENTAVOS[i];
            centavos %= DENOMINACOES_CENTAVOS[i];
            System.out.printf("%d moeda(s) de R$ %.2f%n",
                    qtd, DENOMINACOES_CENTAVOS[i] / 100.0);
        }
    }

    public static void main(String[] args) {
        valorDivididoEmNotasEMoedas(576.73);
    }
}
