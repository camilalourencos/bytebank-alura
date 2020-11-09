
public class TestaMetodo {

	public static void main(String[] args) {
		
		//abaixo, duas maneiras possíveis de fazer o link de uma conta a um cliente
		Conta contaFulana = new Conta(001, 1234); //referenciando o número de agência e conta;
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
		
		//o método deposita() altera o saldo, que é uma especificação de Conta;
		contaFulana.deposita(200);		
	
		//chamando o método saca
		if(contaFulana.saca(100)) {
			System.out.println("Saque feito com sucesso! Saldo atual da "+contaFulana.getTitular().getNome()+" é "+contaFulana.getSaldo());
		} else {
			System.out.println("Saldo insuficiente");
		}		
				
		//chamando o método transfere
		if(contaBeltrana.transfere(300, contaFulana)) {
			System.out.println("Transferência feita com sucesso!");
			System.out.println("O saldo da conta da "+contaFulana.getTitular().getNome()+" agora é "+contaFulana.getSaldo());
			System.out.println("O saldo da conta da "+beltrana.getNome()+" agora é "+contaBeltrana.getSaldo());
		}else {
			System.out.println("Saldo insuficiente");
		}
		
		
		System.out.println("Hoje abrimos "+Conta.getTotal()+" contas");

	}
	

}
