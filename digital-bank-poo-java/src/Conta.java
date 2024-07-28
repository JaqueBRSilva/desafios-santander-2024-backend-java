public abstract class Conta implements IConta {

    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;

    protected int agencia;
    protected int numero;
    protected double saldo;

    public Conta() {
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    protected void imprimirDetalhesConta() {
        System.out.printf("AGÊNCIA: %d%n", this.agencia);
        System.out.printf("CONTA: %d%n", this.numero);
        System.out.printf("SALDO: %.2f%n", this.saldo);
    }

    @Override
    public void sacar(double valorSaque) {
        saldo -= valorSaque;
    }

    @Override
    public void depositar(double valorDeposito) {
        saldo += valorDeposito;
    }

    @Override
    public void transferir(double valorTransferencia, Conta contaDestino) {
        this.sacar(valorTransferencia);
        contaDestino.depositar(valorTransferencia);
    }

}
