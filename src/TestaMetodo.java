
public class TestaMetodo {
	
	public static void main(String[] args) {
		
		//abaixo, duas maneiras poss�veis de fazer o link de uma conta a um cliente
		Conta contaFulana = new Conta();
		contaFulana.saldo = 100;
		contaFulana.titular = new Cliente();
		contaFulana.titular.nome = "Fulana";
		contaFulana.titular.cpf = "111.111.111-11";
		contaFulana.titular.profissao = "Analista";
		
		Cliente beltrana = new Cliente();
		beltrana.nome = "Beltrana";
		beltrana.cpf = "222.222.222-22";
		beltrana.profissao = "Contadora";
		Conta contaBeltrana = new Conta();
		contaBeltrana.saldo = 1000;
		contaBeltrana.titular = beltrana;
		
		
		
		//o m�todo deposita() altera o saldo, que � uma especifica��o de Conta;
		contaFulana.deposita(200);		
		//System.out.println("O saldo da conta da Fulana � "+contaFulana.saldo);
		
		//chamando o m�todo saca
		if(contaFulana.saca(100)) {
			System.out.println("Saque feito com sucesso! Saldo atual da "+contaFulana.titular.nome+" � "+contaFulana.saldo);
		} else {
			System.out.println("Saldo insuficiente");
		}		
				
		//chamando o m�todo transfere
		if(contaBeltrana.transfere(300, contaFulana)) {
			System.out.println("Transfer�ncia feita com sucesso!");
			System.out.println("O saldo da conta da "+contaFulana.titular.nome+" agora � "+contaFulana.saldo);
			System.out.println("O saldo da conta da "+contaBeltrana.titular.nome+" agora � "+contaBeltrana.saldo);
		}else {
			System.out.println("Saldo insuficiente");
		}

	}

}
