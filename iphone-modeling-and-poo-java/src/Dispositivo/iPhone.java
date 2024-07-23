package Dispositivo;

import Funcionalidades.ChamadaAudio;
import Funcionalidades.NavegadorInternet;
import Funcionalidades.ReprodutorMultimidia;

public class iPhone implements ChamadaAudio, NavegadorInternet, ReprodutorMultimidia {

    // === ChamadaAudio ===

    public void ligar(String numero) {
        System.out.println("Ligando para " + numero);
    }

    public void atender() {
        System.out.println("Ligação Atendida");
    }

    public void iniciarCorreioVoz() {
        System.out.println("Correio de Voz iniciado");
    }

    // === NavegadorInternet ===

    public void exibirPagina(String url) {
        System.out.println("Exibindo Página : " + url);
    }

    public void adicionarNovaAba() {
        System.out.println("Nova aba adicionada");
    }

    public void atualizarPagina() {
        System.out.println("Atualizando Página...");
    }

    // === ReprodutorMultimidia ===

    public void tocar() {
        System.out.println("TOCANDO MULTIMÍDIA");
    }

    public void pausar() {
        System.out.println("PAUSANDO MULTIMÍDIA");
    }

    public void selecionarMusica(String musica) {
        System.out.println("REPRODUZINDO MÚSICA : " + musica);
    }
}
