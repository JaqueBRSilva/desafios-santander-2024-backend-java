public class Main {
    public static void main(String[] args) {

        Conta cc = new ContaCorrente();
        Conta poupanca = new ContaPoupanca();

        cc.imprimirExtrato();
        cc.depositar(250);
        cc.sacar(50);
        cc.transferir(100, poupanca);
        cc.imprimirExtrato();

        poupanca.imprimirExtrato();
        poupanca.depositar(500);
        poupanca.sacar(150);
        poupanca.transferir(200, cc);
        poupanca.imprimirExtrato();
        
    }
}