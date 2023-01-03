package poo.abstratos;

public class Circulo extends Forma{
	
	private Double raio;
	
	public Circulo(Double raio) {
		super();
		this.raio = raio;
	}

	public Circulo(Cor cor, Double raio) {
		super(cor);
		this.raio = raio;
	}

	public Double getRaio() {
		return raio;
	}

	public void setRaio(Double raio) {
		this.raio = raio;
	}

	@Override
	protected Double area() {
		return Math.PI * raio * raio;
	}
	
	
	
	
}
