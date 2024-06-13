import static processo_seletivo.AnalisarCandidato.analisarCandidato;
import static processo_seletivo.LigarParaCandidato.iniciarTentativasDeContato;
import static processo_seletivo.SelecaoCandidatos.selecaoCandidatos;
import static processo_seletivo.ImprimirCandidatos.imprimirSelecionados;

public class Main {
    public static void main(String[] args) {
        analisarCandidato(1800);

        selecaoCandidatos();
        imprimirSelecionados();

        iniciarTentativasDeContato();
    }
}