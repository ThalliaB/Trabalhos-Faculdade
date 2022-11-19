
public class Ingresso {
	public String nomeEvento;
	public double valor;
	
	
	public Ingresso() {}
	public Ingresso(String nomeEvento, double valor) {
		super();
		this.nomeEvento = nomeEvento;
		this.valor = valor;
	}

	void Info() {
		System.out.println("Evento: " + nomeEvento);
		System.out.println("Valor: " + valor);
	}
}
