package processo_seletivo;

import java.util.Random;

public class LigarParaCandidato {

    public static void iniciarTentativasDeContato() {
        String[] candidatos = {"MÔNICA", "FABRÍCIO", "MIRELA", "DANIELA", "JORGE"};

        for (String candidato : candidatos) {
            entrarEmContato(candidato);
        }
    }

    public static void entrarEmContato(String candidato) {
        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean foiAtendido = false;

        do {
            foiAtendido = atenderLigacao();
            continuarTentando = !foiAtendido;

            if (continuarTentando) {
                System.out.println("NÃO CONSEGUIMOS CONTATO COM " + candidato);
                tentativasRealizadas++;

            } else {
                System.out.println("CONSEGUIMOS CONTATO COM " + candidato + " NA " + tentativasRealizadas + "ª TENTATIVA");
            }
        } while (continuarTentando && tentativasRealizadas < 3);
    }

    public static boolean atenderLigacao() {
        return new Random().nextInt(3) == 1;
    }
}
