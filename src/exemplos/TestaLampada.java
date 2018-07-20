package exemplos;

public class TestaLampada {

	public static void main(String[] args) {
		
		Fabricante fab = new Fabricante();
		fab.setNome("Velux");
		fab.setSigla("vlx");
		
		Lampada lamp1 = new Lampada();
		lamp1.setPotencia(20);
		lamp1.setFabricante(fab);
		lamp1.acender();
		
		//lamp1.acender();
		
		//lamp1.setPotencia(50f);
		
		System.out.println(lamp1);
		
	}
	
}
