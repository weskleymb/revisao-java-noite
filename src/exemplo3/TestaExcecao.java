package exemplo3;

public class TestaExcecao {

	public static void main(String[] args) {
		int x = 2;
		int y = 0;
		try {
			System.out.println(dividir(x, y));			
		} catch (ErroException e) {
			System.out.println(e.getMessage());
		}
	}
	
	private static int dividir(int a, int b) throws ErroException {
		if (b == 0) {
			throw new ErroException("N�o pode dividir por ZERO");
		}
		return a / b;
	}

}
