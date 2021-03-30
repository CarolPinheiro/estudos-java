public abstract class Conta {
	protected double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	private static int total;
	
	public Conta(int agencia, int numero) {
		total++;
		this.agencia = agencia;
		this.numero = numero;
	}
	
	public abstract void deposita(double valor);
	
	public boolean saca (double valor) {
		if(this.saldo>= valor) {
			this.saldo-= valor;
			return true;
		} else {
			return false;
		}
	}
	public boolean transfere (double valor, Conta destino) {
		if(this.saldo>= valor) {
			this.saca(valor);
			destino.deposita(valor);
			return true;
		}
		return false;
	}
	public double getSaldo() {
		return this.saldo;
	}
	public int getAgencia() {
		return this.agencia;
	}
	public int getNumero() {
		return numero;
	}	
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	public Cliente getTitular() {
		return titular;
	}
	public static int getTotal () {
		return Conta.total;
	}
}