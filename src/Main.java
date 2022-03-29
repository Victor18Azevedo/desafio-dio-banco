import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		Banco meuBanco = new Banco();
		List<Cliente> listaClientes = new ArrayList<>();
		Cliente cliente = new Cliente();
		
		cliente.nome = "Victor Azevedo";		
		listaClientes.add(cliente);
			
		Conta cc = new ContaCorrente(listaClientes.get(0));
		Conta cp = new ContaPoupanca(listaClientes.get(0));
		
		
		
		cc.imprimirExtrato();
		cp.imprimirExtrato();
		
		cc.depositar(150);
		cc.transferir(10, cp);
		
		cc.imprimirExtrato();
		cp.imprimirExtrato();
			
		
	}

}
