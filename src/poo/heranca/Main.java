package poo.heranca;

public class Main {
	
	public static void main(String[] args) {
		Conta conta1 = new Conta(1001, "Lucas", 1000.0);
		conta1.saque(200.0);
		System.out.println(conta1.getSaldo());
		Conta conta2 = new ContaPoupanca(1002, "Debora", 1200.0, 0.01);
		conta2.saque(200.0);
		System.out.println(conta2.getSaldo());
		Conta conta3 = new ContaEmpresarial(1003, "Leticia", 1000.0, 700.0);
		conta3.saque(200.0);
		System.out.println(conta3.getSaldo());
	}
	
	
}
