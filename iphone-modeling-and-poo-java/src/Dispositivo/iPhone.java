package Dispositivo;

import Funcionalidades.ChamadaAudio;
import Funcionalidades.NavegadorInternet;
import Funcionalidades.ReprodutorMultimidia;

public class iPhone implements ChamadaAudio, NavegadorInternet, ReprodutorMultimidia {

    // === ChamadaAudio ===

    public void ligar(String numero) {
        System.out.println("\nLIGANDO PARA : " + numero);
    }

    public void atender() {
        System.out.println("LIGAÇÃO ATENDIDA");
    }

    public void iniciarCorreioVoz() {
        System.out.println("CORREIO DE VOZ INICIADO");
    }

    // === NavegadorInternet ===

    public void exibirPagina(String url) {
        System.out.println("\nEXIBINDO PÁGINA : " + url);
    }

    public void adicionarNovaAba() {
        System.out.println("NOVA ABA ADICIONADA");
    }

    public void atualizarPagina() {
        System.out.println("ATUALIZANDO PÁGINA...");
    }

    // === ReprodutorMultimidia ===

    public void tocar() {
        System.out.println("\nTOCANDO MULTIMÍDIA");
    }

    public void pausar() {
        System.out.println("PAUSANDO MULTIMÍDIA");
    }

    public void selecionarMusica(String musica) {
        System.out.println("REPRODUZINDO MÚSICA : " + musica);
    }
}
