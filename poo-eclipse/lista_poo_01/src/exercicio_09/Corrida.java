package exercicio_09;

public class Corrida {
	private Passageiro passageiro;
	private Motorista motorista;
	private double distanciaPercorrida;
	static double precoPorKM = 2.5;
	
	public Corrida(Passageiro passageiro, Motorista motorista, double distanciaPercorrida) {
		this.passageiro = passageiro;
		this.motorista = motorista;
		this.distanciaPercorrida = distanciaPercorrida;
	}
	
	public String totalCorrida() {
		double total = this.distanciaPercorrida*(precoPorKM);
		return String.format("%.2f", total);
	}
	
	public double getDistanciaPercorrida() {
		return distanciaPercorrida;
	}
	
	public void setDistanciaPercorrida(double distanciaPercorrida) {
		this.distanciaPercorrida = distanciaPercorrida;
	}
	
	public Motorista getMotorista() {
		return motorista;
	}
	
	public void setMotorista(Motorista motorista) {
		this.motorista = motorista;
	}
	
	public Passageiro getPassageiro() {
		return passageiro;
	}
	
	public void setPassageiro(Passageiro passageiro) {
		this.passageiro = passageiro;
	}
}
