
public class ContaCorrente extends Conta {
	
	public ContaCorrente(int agencia, int numero) { //construtores n�o s�o herdados
		super(agencia, numero);
	}
	
	@Override
	public boolean saca(double valor) {
		double valorSaque = valor + 0.2;
		return super.saca(valorSaque);
	}
}

