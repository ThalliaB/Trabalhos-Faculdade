
public class Notbook extends Computador{
	int polegadasTela;

	@Override
	double calculaValor() {
		double total = 250*gbMemoria + 500*numProcessadores + 100*polegadasTela;
		return total;
	}

	public Notbook(int gbMemoria, int numProcessadores, int polegadasTela) {
		super(gbMemoria, numProcessadores);
		this.polegadasTela = polegadasTela;
	}
}
