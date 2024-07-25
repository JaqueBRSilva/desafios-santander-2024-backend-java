import Dispositivo.iPhone;

public class Main {
    public static void main(String[] args) {
        iPhone iphone = new iPhone();

        iphone.ligar("99999 9999");
        iphone.atender();
        iphone.iniciarCorreioVoz();

        iphone.exibirPagina("< Site >");
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();

        iphone.tocar();
        iphone.pausar();
        iphone.selecionarMusica("< Música Escolhida >");
    }
}
