
public class ContaPoupança extends Conta {

	

	
	public ContaPoupança(Cliente cliente) {
		super(cliente);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void imprimirExtrato() {
		System.out.println("*** CONTA POUPANÇA ***");
		super.imprimirExtrato();
	}
}
