
public class ContaPoupan�a extends Conta {

	

	
	public ContaPoupan�a(Cliente cliente) {
		super(cliente);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void imprimirExtrato() {
		System.out.println("*** CONTA POUPAN�A ***");
		super.imprimirExtrato();
	}
}
