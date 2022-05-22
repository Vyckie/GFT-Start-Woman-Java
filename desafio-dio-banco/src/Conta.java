
public abstract class Conta {
	protected int agencia;
	protected int numConta;
	protected double saldo;
	protected Cliente cliente;
	
	private static final int AGENCIA_PADRAO =1 ;
	private static int SEQUENCIAL = 1;
	
	public void sacar(double valor) {
		this.saldo -= valor;
		
	}
	
	public void depositar(double valor) {
		this.saldo += valor;
	}
	
	public void transferir(double valor, Conta contaDestino) {
		if(valor<= this.saldo) {
			this.sacar(valor);
		contaDestino.depositar(valor);
		}else {
			System.out.println("!!!!!!!SALDO INSUFICIENTE");
		}
		
	}

	public Conta(Cliente cliente) {
		this.agencia = Conta.AGENCIA_PADRAO;
		this.numConta = SEQUENCIAL;
		// TODO Auto-generated constructor stub
	}

	
	public void imprimirExtrato() {
		System.out.println("*** EXTTRATO ***");
		System.out.println(" [agencia=" + this.agencia + ", numConta=" + this.numConta + ", saldo=" + this.saldo + "]");
		
	}
	
	
	
	
}
