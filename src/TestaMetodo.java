
public class TestaMetodo {
	
	public static void main(String[] args) {
		
		Conta contaFulana = new Conta();
		contaFulana.saldo = 100;
		contaFulana.deposita(200);
		//o método depoista() altera o saldo, que é uma especificação de Conta;
		System.out.println("O saldo da conta da Fulana é "+contaFulana.saldo);
	}

}
