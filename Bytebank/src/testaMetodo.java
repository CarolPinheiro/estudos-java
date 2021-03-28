
public class testaMetodo {
 public static void main(String[] args) {
	Conta conta = new Conta(2244,5566);
	
	conta.deposita(300);
	Conta conta2 = new Conta(6925,7854);
	
	conta.transfere(30, conta2);
	Cliente carol = new Cliente();
	
	carol.setNome("Carol");;
	
	conta.setTitular(carol);
	
	
	System.out.println(conta.getTitular());
	
	System.out.println(Conta.getTotal());
	
}
}
