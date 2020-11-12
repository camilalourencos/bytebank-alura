
public class TesteContas {

	public static void main(String[] args) {
		ContaCorrente novaConta = new ContaCorrente(123, 4567);
		novaConta.deposita(300);
		System.out.println("O saldo da novaConta é "+novaConta.getSaldo());
		
		ContaPoupanca novaPoup = new ContaPoupanca(321, 7654);
		
		novaConta.transfere(100, novaPoup);
		System.out.println("O saldo da novaConta agora é "+novaConta.getSaldo());
		
		novaConta.saca(10);
		System.out.println("O novo saldo da novaConta é "+ novaConta.getSaldo());
	}

}
