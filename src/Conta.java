
public class Conta {
	//atributos: especificações da Conta que serão usadas para criar um objeto do tipo Conta.
	double saldo; //valor padrão dessas variáveis é zero, diferente de uma variável dentro da main class que não tem valor algum;
	int agencia;
	int numero;
	String titular;
	
	
	public void deposita(double valor) { //o deposita é o método, enquanto o valor é o parâmetro. O void é usado uma vez que não há retorno 
	//à ação de deposita (por exemplo, poderia retornar um comprovante)
		this.saldo = this.saldo+valor; //saldo é um atributo e valor é uma variável
	}
	
	
}
