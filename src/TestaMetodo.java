
public class TestaMetodo {
	
	public static void main(String[] args) {
		
		Conta contaFulana = new Conta();
		contaFulana.saldo = 100;
		contaFulana.deposita(200);
		//o m�todo depoista() altera o saldo, que � uma especifica��o de Conta;
		System.out.println("O saldo da conta da Fulana � "+contaFulana.saldo);
	}

}
