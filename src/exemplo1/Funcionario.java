package exemplo1;

public class Funcionario extends Pessoa {

	private String matricula;
	private String cargo;
	
	public String getMatricula() {
		return matricula;
	}
	
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	
	public String getCargo() {
		return cargo;
	}
	
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	@Override
	public void setIdade(int idade) {
		if (idade >= 18) {
			super.idade = idade;
		}
	}
	
}
