package exceçoes;

public class Calculadora {
	
	public double calcular(double numero1, double numero2) throws ContaInvalidaException {
		if(numero2 == 0) {
			throw new ContaInvalidaException("Nao eh possivel fazer divisao por 0!");
		}

		return (numero1 / numero2);
	}

}
