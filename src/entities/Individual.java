package entities;

public class Individual extends Contribuinte{

	private Double gastosSaude;

	public Individual(String nome, Double rendaAnual, Double gastosSaude) {
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
	public Double taxa() {
		if(getRendaAnual() < 20000.0) {
			return getRendaAnual() * 0.15 - gastosSaude * 0.5;
		}
		else {
			return getRendaAnual() * 0.25 - gastosSaude * 0.5;
		}
		
	}

	
	
	
	
}
