package poo.abstratos.metodos;

public class PessoaJuridica extends Pessoa{
	
	private Integer numeroFuncionarios;
	
	public PessoaJuridica() {
		super();
	}

	public PessoaJuridica(String nome, Double rendaAnual, Integer numeroFuncionarios) {
		super(nome, rendaAnual);
		this.numeroFuncionarios = numeroFuncionarios;
	}

	public Integer getNumeroFuncionarios() {
		return numeroFuncionarios;
	}

	public void setNumeroFuncionarios(Integer numeroFuncionarios) {
		this.numeroFuncionarios = numeroFuncionarios;
	}



	@Override
	public Double calculaImposto() {
		Double valorImposto = Double.valueOf(0);
		if(numeroFuncionarios > 10) {
			valorImposto = rendaAnual * 0.14;
		}else {
			valorImposto = rendaAnual * 0.16;
		}
		return valorImposto;
	}

}
