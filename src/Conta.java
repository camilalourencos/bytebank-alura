
public class Conta {
	//atributos: especifica��es da Conta que ser�o usadas para criar um objeto do tipo Conta.
	double saldo; //valor padr�o dessas vari�veis � zero, diferente de uma vari�vel dentro da main class que n�o tem valor algum;
	int agencia;
	int numero;
	String titular;
	
	
	public void deposita(double valor) { //o deposita � o m�todo, enquanto o valor � o par�metro. O void � usado uma vez que n�o h� retorno 
	//� a��o de deposita (por exemplo, poderia retornar um comprovante)
		this.saldo = this.saldo+valor; //saldo � um atributo e valor � uma vari�vel
	}
	
	
}
