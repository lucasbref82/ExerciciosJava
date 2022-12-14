package poo.heranca;

public class ContaEmpresarial  extends Conta{
	private Double limiteEmprestimo;
	
	public ContaEmpresarial() {
		super();
	}

	public ContaEmpresarial(Integer numero, String dono, Double saldo, Double limiteEmprestimo) {
		super(numero, dono, saldo);
		this.limiteEmprestimo = limiteEmprestimo;
	}

	public Double getLimiteEmprestimo() {
		return limiteEmprestimo;
	}

	public void setLimiteEmprestimo(Double limiteEmprestimo) {
		this.limiteEmprestimo = limiteEmprestimo;
	}
	
	public void emprestimo(Double valor) {
		if(valor <= limiteEmprestimo) {
			saldo += valor;
		}
	}
	
	@Override
	public void saque(Double valor) {
		super.saque(valor);
		saldo -= 2.0;
	}
	
	
}
