
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cliente marcia = new Cliente("maaria","99998765-99");
		Conta cc = new ContaCorrente(marcia);
		Conta cp = new ContaPoupança(marcia);
		
		
		cc.depositar(100);
		cc.transferir(220, cp);
		cc.imprimirExtrato();
		cp.imprimirExtrato();
	}

}
