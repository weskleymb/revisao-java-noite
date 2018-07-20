package exemplos;

public class Fabricante {

	private String nome;
	private String sigla;
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getSigla() {
		return sigla;
	}
	
	public void setSigla(String sigla) {
		this.sigla = sigla;
	}
	
	@Override
	public String toString() {
		String fabricante = "Fabricante{";
		fabricante += "nome=" + this.nome + ", ";
		fabricante += "sigla=" + this.sigla;
		fabricante += "}";
		return fabricante;
	}
	
}
