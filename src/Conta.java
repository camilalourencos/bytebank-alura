
public class Conta {
	//atributos: especificações da Conta que serão usadas para criar um objeto do tipo Conta.
	private double saldo; //valor padrão dessas variáveis é zero, diferente de uma variável dentro da main class que não tem valor algum;
	private int agencia;
	private int numero;
	private Cliente titular;
	private static int total; //static significa que o atributo é da classe e não da instância
	
	
	public void deposita(double valor) { /*deposita é o método, enquanto o valor é o parâmetro. O void é usado uma vez que não há retorno 
	à ação de deposita (por exemplo, poderia retornar um comprovante)*/
		this.saldo = this.saldo+valor; //saldo é um atributo e valor é uma variável
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
			System.out.println("O número da conta não pode ser menor ou igual a zero");
			return;
		}
		this.numero = numero;
	}
	
	public int getAgencia() {
		return this.agencia;
	}
	
	public void setAgencia(int agencia) {
		if(agencia <= 0) {
			System.out.println("O número da agência não pode ser menor ou igual a zero");
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
	
	/*É possível informar uma rotina de inicialização através de um construtor, como no ex abaixo, em que
	é preciso informar agência e número de conta para criar uma nova conta*/
	
	public Conta (int agencia, int numero) {
		Conta.total++;
		this.agencia = agencia;
		this.numero = numero;		
	}
	
	public static int getTotal() {
		return Conta.total;
	}
}
