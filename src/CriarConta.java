
public class CriarConta {

	public static void main(String[] args) {
		Conta primeiraConta = new Conta();	//cria um objeto (Conta) através da classe Conta. O "primeiraConta" é uma referência, não é um objeto. 
		primeiraConta.saldo = 200; //define um valor ao atributo saldo
		System.out.println(primeiraConta.saldo);
		
		primeiraConta.saldo += 200; 
		System.out.println(primeiraConta.saldo);
		
		
		Conta segundaConta = new Conta(); //outra instância, diferente da primeiraConta
		segundaConta.saldo = 50;
	}

}
