package exemplo1;

public class TestaCliente {

	public static void main(String[] args) {
		
		Cliente duone = new Cliente("Duone");
		duone.setSalario(8000f);
		duone.setCpf("123123123-12");
		
		Cliente jose = new Cliente("Duone");
		jose.setSalario(5000f);
		jose.setCpf("123123123-12");
		
		if (duone.equals(jose)) {
			System.out.println("Iguais");
		} else {
			System.out.println("Diferentes");
		}
	}
	
}
