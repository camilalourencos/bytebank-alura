
public class TestaMetodo {
	
	public static void main(String[] args) {
		
		//abaixo, duas maneiras possíveis de fazer o link de uma conta a um cliente
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
		
		
		
		//o método deposita() altera o saldo, que é uma especificação de Conta;
		contaFulana.deposita(200);		
		//System.out.println("O saldo da conta da Fulana é "+contaFulana.saldo);
		
		//chamando o método saca
		if(contaFulana.saca(100)) {
			System.out.println("Saque feito com sucesso! Saldo atual da "+contaFulana.titular.nome+" é "+contaFulana.saldo);
		} else {
			System.out.println("Saldo insuficiente");
		}		
				
		//chamando o método transfere
		if(contaBeltrana.transfere(300, contaFulana)) {
			System.out.println("Transferência feita com sucesso!");
			System.out.println("O saldo da conta da "+contaFulana.titular.nome+" agora é "+contaFulana.saldo);
			System.out.println("O saldo da conta da "+contaBeltrana.titular.nome+" agora é "+contaBeltrana.saldo);
		}else {
			System.out.println("Saldo insuficiente");
		}

	}

}
