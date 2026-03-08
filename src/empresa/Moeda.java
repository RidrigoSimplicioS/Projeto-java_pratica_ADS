package empresa;

public abstract class Moeda {
	protected double valor;
	protected String pais;

	public Moeda(double valor, String pais) {
		this.valor = valor;
		this.pais = pais;
	}

	public abstract double converter(); // converte para Real

	public void info() {
		System.out.println(pais + " - " + valor);
	}

	public double getValor() {
		return valor;
	}

	public String getPais() {
		return pais;
	}
}