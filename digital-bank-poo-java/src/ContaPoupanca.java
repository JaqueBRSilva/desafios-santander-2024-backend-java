public class ContaPoupanca extends Conta {

    public void imprimirExtrato() {
        System.out.println("\n== EXTRATO CONTA POUPANÇA ==");
        super.imprimirDetalhesConta();
    }

}
