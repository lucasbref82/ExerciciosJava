package poo.abstratos;

public abstract class Forma {
	
	protected Cor cor;
	
	public Forma() {
		
	}
	
	public Forma(Cor cor) {
		this.cor = cor;
	}
	
	
	public Cor getCor() {
		return cor;
	}


	public void setCor(Cor cor) {
		this.cor = cor;
	}


	protected abstract Double area();
	
}
