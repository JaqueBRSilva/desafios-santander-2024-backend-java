package processo_seletivo;

public class ImprimirCandidatos {

    public static void imprimirSelecionados() {
        String[] candidatos = {"MÔNICA", "FABRÍCIO", "MIRELA", "DANIELA", "JORGE"};

        System.out.println("\n:: IMPRIMINDO A LISTA DE CANDIDATOS INFORMANDO O ÍNDICE DO ELEMENTO");

        for (int indice = 0; indice < candidatos.length; indice++) {
            System.out.println("O candidato de n° " + (indice + 1) + " é " + candidatos[indice]);
        }
    }
}
