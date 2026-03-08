package empresa;

public class Real extends Moeda {
	public Real(double valor) {
		super(valor, "Real"); // chama o construtor da classe abstrata Moeda
	}

	@Override
	public double converter() {
		return valor; // já está em Real, não precisa converter
	}
}
