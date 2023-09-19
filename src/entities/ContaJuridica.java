package entities;

public class ContaJuridica extends Contribuinte {
	private Integer numeroDefuncionarios;

	public ContaJuridica(String nome, Double rendaAnual, Integer numeroDefuncionarios) {
		super(nome, rendaAnual);
		this.numeroDefuncionarios = numeroDefuncionarios;
	}

	public Integer getNumeroDefuncionarios() {
		return numeroDefuncionarios;
	}

	public void setNumeroDefuncionarios(Integer numeroDefuncionarios) {
		this.numeroDefuncionarios = numeroDefuncionarios;
	}

	@Override
	public Double taxa() {
		if(getNumeroDefuncionarios() > 10) {
			return getRendaAnual() * 0.14;
		}
		else {
			return getRendaAnual() * 0.16;
		}

	}
	
	
}
