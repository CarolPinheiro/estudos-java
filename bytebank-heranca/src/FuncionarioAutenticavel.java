
public abstract class FuncionarioAutenticavel extends Funcionario {
	private int senha;
	 public void setSenha(int senha) {
         this.senha = senha;
     }
	@Override
	public abstract double getBonificacao();
	
	public boolean autentica (int senha) {
		if (this.senha == senha) {
			return true;
		} 
		return false;
	}

}
