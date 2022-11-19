package trabalho;

public class Euro extends Moeda {

	@Override
	double converter() {
		double total = valor*6;//valor do euro sendo considerado como 6
		return total;
	}

	public Euro() {}//construtor vazio
	public Euro(double valor) {
		super(valor);
	}

	@Override
	public String toString() {
		return "Euro: " + valor;
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