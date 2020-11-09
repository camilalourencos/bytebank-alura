
public class TestaMetodo {

	public static void main(String[] args) {
		
		//abaixo, duas maneiras poss�veis de fazer o link de uma conta a um cliente
		Conta contaFulana = new Conta(001, 1234);
		contaFulana.setNumero(1230);
		contaFulana.deposita(100.00);
		contaFulana.setTitular(new Cliente());
		contaFulana.getTitular().setNome("Fulana");
		contaFulana.getTitular().setCpf ("111.111.111-11");
		contaFulana.getTitular().setProfissao("Analista");
		
		Cliente beltrana = new Cliente();
		beltrana.setNome("Beltrana");
		beltrana.setCpf("222.222.222-22");
		beltrana.setProfissao("Contadora");
		Conta contaBeltrana = new Conta(001, 3214);
		contaBeltrana.deposita(1000);
		contaBeltrana.setTitular(beltrana);
		
		
		
		//o m�todo deposita() altera o saldo, que � uma especifica��o de Conta;
		contaFulana.deposita(200);		
		//System.out.println("O saldo da conta da Fulana � "+contaFulana.saldo);
		
		//chamando o m�todo saca
		if(contaFulana.saca(100)) {
			System.out.println("Saque feito com sucesso! Saldo atual da "+contaFulana.getTitular().getNome()+" � "+contaFulana.getSaldo());
		} else {
			System.out.println("Saldo insuficiente");
		}		
				
		//chamando o m�todo transfere
		if(contaBeltrana.transfere(300, contaFulana)) {
			System.out.println("Transfer�ncia feita com sucesso!");
			System.out.println("O saldo da conta da "+contaFulana.getTitular().getNome()+" agora � "+contaFulana.getSaldo());
			System.out.println("O saldo da conta da "+beltrana.getNome()+" agora � "+contaBeltrana.getSaldo());
		}else {
			System.out.println("Saldo insuficiente");
		}

	}

}
