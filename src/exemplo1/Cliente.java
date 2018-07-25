package exemplo1;

public class Cliente extends Pessoa {

	private float salario;
	private String cpf;
	
	public Cliente(String nome) {
		super(nome);
	}
	
	public float getSalario() {
		return salario;
	}
	public void setSalario(float salario) {
		this.salario = salario;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	@Override
	public void setIdade(int idade) {
		if (idade > 0) {
			super.idade = idade;
		}
	}
	
	@Override
	public boolean equals(Object obj) {
		Cliente cliente = (Cliente) obj;
		if (cliente.getNome().equals(super.getNome())) {
			return true;
		}
		return false;
	}
	
}
