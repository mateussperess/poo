package prova_poo;

public enum CupomDesconto {
	NENHUM(0.0),
	CUSTOFRETE(15.0),
	FRETEGRATIS(-15.0),
	DESCONTO15(15.0),
	DESCONTO20(20.0),
	DESCONTO50(50.0),
	DESCONTO70(70.0);
	
	private double valorCupom;
	
	
	private CupomDesconto(double valorCupom) {
		this.valorCupom = valorCupom;
	}
	
	public double getValorCupom() {
		return valorCupom;
	}
}
