package empresa;

import java.util.ArrayList;

public class Cofrinho {
	private ArrayList<Moeda> moedas = new ArrayList<>();

	public void adicionar(Moeda moeda) {
		moedas.add(moeda);
	}

	public void listar() {
		if (moedas.isEmpty()) {
			System.out.println("Cofrinho vazio.");
		} else {
			for (Moeda m : moedas) {
				m.info();
			}
		}
	}

	public double calcularTotalConvertido() {
		double total = 0;
		for (Moeda m : moedas) {
			total += m.converter();
		}
		return total;
	}

	// método de remoção
	public boolean remover(String tipo, double valor) {
		Moeda encontrada = null;
		for (Moeda m : moedas) {
			if (m.getPais().equalsIgnoreCase(tipo) && m.getValor() == valor) {
				encontrada = m;
				break;
			}
		}
		if (encontrada != null) {
			moedas.remove(encontrada);
			return true;
		}
		return false;
	}
}