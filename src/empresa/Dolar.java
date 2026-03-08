package empresa;

public class Dolar extends Moeda {
	public Dolar(double valor) {
		super(valor, "Dolar");
	}

	@Override
	public double converter() {
		return valor * 5.5;
	}

}
