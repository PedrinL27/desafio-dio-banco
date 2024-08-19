package banco;

public class Contas {

    private static final int AGENCIA_PADRAO = 1;
	private static int SEQUENCIAL = 1;

    protected int agencia;
    protected int numeroConta;
    protected double saldo; 
    protected Cliente cliente;

    public Contas(Cliente cliente) {
        this.agencia = AGENCIA_PADRAO;
        this.numeroConta = SEQUENCIAL++;
        this.cliente = cliente;
    }

    public void sacar(double valor) {
        this.saldo -= valor;
    }

    public void depositar(double valor) {
        this.saldo += valor;
    }

    public void transferir(double valor, Contas contaDestino) {
		this.sacar(valor);
		contaDestino.depositar(valor);
    }

    protected void imprimirInfosComuns() {
		System.out.println(String.format("Titular: %s", cliente.getNome()));
		System.out.println(String.format("Agencia: %d", this.agencia));
		System.out.println(String.format("Numero: %d", this.numeroConta));
		System.out.println(String.format("Saldo: %.2f", this.saldo));
	}

    
}
