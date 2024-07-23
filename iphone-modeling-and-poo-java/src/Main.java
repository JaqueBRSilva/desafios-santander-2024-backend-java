import Dispositivo.iPhone;

public class Main {
    public static void main(String[] args) {
        iPhone iphone = new iPhone();

        iphone.atender();
        iphone.ligar("99999 9999");
        iphone.iniciarCorreioVoz();

        iphone.exibirPagina("");
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();

        iphone.tocar();
        iphone.pausar();
        iphone.selecionarMusica("< Música Escolhida >");
    }
}
