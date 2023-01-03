package poo.abstratos.metodos;

public class PessoaFisica extends Pessoa{
	
	private Double gastosSaude;
	

	public PessoaFisica() {
		super();
	}

	public PessoaFisica(String nome, Double rendaAnual, Double gastosSaude) {
		super(nome, rendaAnual);
		this.gastosSaude = gastosSaude;
	}



	public Double getGastosSaude() {
		return gastosSaude;
	}



	public void setGastosSaude(Double gastosSaude) {
		this.gastosSaude = gastosSaude;
	}

	@Override
	public Double calculaImposto() {
		Double valorImposto = Double.valueOf(0);
		if(rendaAnual < Double.valueOf(20000) && gastosSaude > 0) {
			valorImposto = (rendaAnual * 15) / 100 / 2;
		}else if(rendaAnual >= Double.valueOf(20000) && gastosSaude > 0) {
			valorImposto = (rendaAnual * 25) / 100 / 2;
		}else if(rendaAnual < Double.valueOf(20000) && gastosSaude == 0) {
			valorImposto = (rendaAnual * 15) / 100;
		}else if(rendaAnual >= Double.valueOf(20000) && gastosSaude == 0) {
			valorImposto = (rendaAnual * 25) / 100;
		}
		return valorImposto;
	}

}
