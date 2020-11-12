
public class CriarConta {

	public static void main(String[] args) {
		Conta primeiraConta = new Conta(222, 2222);	//cria um objeto (Conta) através da classe Conta. O "primeiraConta" é uma referência, não é um objeto. 
		primeiraConta.deposita(200); //define um valor ao atributo saldo
		
		
		primeiraConta.deposita(200); 
		System.out.println(primeiraConta.getSaldo());
		
		
		Conta segundaConta = new Conta(111, 2222); //outra instância, diferente da primeiraConta
		segundaConta.deposita(50);
		System.out.println(segundaConta.getSaldo());
	}

}
