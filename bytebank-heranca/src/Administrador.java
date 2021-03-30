
public class Administrador extends Funcionario {	
	@Override
	public double getBonificacao() {
		return super.getSalario() * 0.1;
	}
	
}
