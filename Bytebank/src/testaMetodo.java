
public class testaMetodo {
 public static void main(String[] args) {
	Conta conta = new ContaPoupanca(2244,5566);
	
	conta.deposita(300);
	ContaPoupanca conta2 = new ContaPoupanca(6925,7854);
	
	conta.transfere(30, conta2);
	Cliente carol = new Cliente();
	
	carol.setNome("Carol");;
	
	conta.setTitular(carol);
	
	
	System.out.println(conta.getTitular());
	
	System.out.println(Conta.getTotal());
	
}
}
