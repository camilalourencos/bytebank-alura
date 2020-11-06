
public class CriarConta {

	public static void main(String[] args) {
		Conta primeiraConta = new Conta();	//cria um objeto (Conta) atrav�s da classe Conta. O "primeiraConta" � uma refer�ncia, n�o � um objeto. 
		primeiraConta.saldo = 200; //define um valor ao atributo saldo
		System.out.println(primeiraConta.saldo);
		
		primeiraConta.saldo += 200; 
		System.out.println(primeiraConta.saldo);
		
		
		Conta segundaConta = new Conta(); //outra inst�ncia, diferente da primeiraConta
		segundaConta.saldo = 50;
	}

}
