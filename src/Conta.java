
public class Conta {
	//atributos: especifica��es da Conta que ser�o usadas para criar um objeto do tipo Conta.
	private double saldo; //valor padr�o dessas vari�veis � zero, diferente de uma vari�vel dentro da main class que n�o tem valor algum;
	private int agencia;
	private int numero;
	private Cliente titular;
	
	
	public void deposita(double valor) { //o deposita � o m�todo, enquanto o valor � o par�metro. O void � usado uma vez que n�o h� retorno 
	//� a��o de deposita (por exemplo, poderia retornar um comprovante)
		this.saldo = this.saldo+valor; //saldo � um atributo e valor � uma vari�vel
	}
	
	public boolean saca(double valor){
		if(this.saldo >= valor) {
			this.saldo = this.saldo-valor;
			return true;
		}
		return false;			
	}
	
	public boolean transfere(double valor, Conta destino) {
		if(this.saldo >= valor) {
			this.saca(valor);
			destino.deposita(valor);
			return true;
		}
		return false;
	}
	
	public double getSaldo() {
		return this.saldo;
	}
	
	public int getNumero() {
		return this.numero;

	}
	
	public void setNumero (int numero) {
		this.numero = numero;
	}
	
	public int getAgencia() {
		return this.agencia;
	}
	
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
	
	public Cliente getTitular() {
		return this.titular;
	}
	
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
}
