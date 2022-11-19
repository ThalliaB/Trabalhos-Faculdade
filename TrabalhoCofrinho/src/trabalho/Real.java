package trabalho;

public class Real extends Moeda{

	@Override
	double converter() {
		return valor;
	}

	public Real() {} //construtor vazio
	public Real(double valor) {
		super(valor);
	}
	

	@Override
	public String toString() {
		return "Real: " + valor;
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
