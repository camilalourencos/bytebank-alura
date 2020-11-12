
public class Conta {
	//atributos: especifica��es da Conta que ser�o usadas para criar um objeto do tipo Conta.
	private double saldo; //valor padr�o dessas vari�veis � zero, diferente de uma vari�vel dentro da main class que n�o tem valor algum;
	private int agencia;
	private int numero;
	private Cliente titular;
	private static int total; //static significa que o atributo � da classe e n�o da inst�ncia
	
	/*� poss�vel informar uma rotina de inicializa��o atrav�s de um construtor, como no ex abaixo, em que
	� preciso informar ag�ncia e n�mero de conta para criar uma nova conta*/
	
	public Conta (int agencia, int numero) {
		Conta.total++;
		this.agencia = agencia;
		this.numero = numero;		
	}
	
	public void deposita(double valor) { /*deposita � o m�todo, enquanto o valor � o par�metro. O void � usado uma vez que n�o h� retorno 
	� a��o de deposita (por exemplo, poderia retornar um comprovante)*/
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
		if(numero <= 0) {
			System.out.println("O n�mero da conta n�o pode ser menor ou igual a zero");
			return;
		}
		this.numero = numero;
	}
	
	public int getAgencia() {
		return this.agencia;
	}
	
	public void setAgencia(int agencia) {
		if(agencia <= 0) {
			System.out.println("O n�mero da ag�ncia n�o pode ser menor ou igual a zero");
			return;
		}	
		this.agencia = agencia;
	}
	
	public Cliente getTitular() {
		return this.titular;
	}
	
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
	
	public static int getTotal() {
		return Conta.total;
	}
}
