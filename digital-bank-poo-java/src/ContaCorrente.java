public class ContaCorrente extends Conta {

    public void imprimirExtrato() {
        System.out.println("\n== EXTRATO CONTA CORRENTE ==");
        super.imprimirDetalhesConta();
    }

}
