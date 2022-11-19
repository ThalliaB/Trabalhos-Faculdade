package trabalho;

public class Dolar extends Moeda {

	@Override
	double converter() {
		double total = valor*5;//supondo que é este valor o valor do dólar atual
		return total;
	}
	
	public Dolar() {}//construtor vazio
	public Dolar(double valor) {
		super(valor);
	}
	
	@Override
	public String toString() {
		return "Dolar: " + valor;
	}

	@Override
	public int hashCode() {
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		return true;
	}
}
