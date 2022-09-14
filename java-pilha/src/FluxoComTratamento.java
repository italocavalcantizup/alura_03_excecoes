public class FluxoComTratamento {

	public static void main(String[] args) {
		System.out.println("Início do main");
		metodo1();
		System.out.println("Fim do main");
	}

	public static void metodo1() {
		System.out.println("Início do método 1");
		try {
			metodo2();			
		} catch (ArithmeticException | NullPointerException e) { 
			System.out.println("Exception " + e.getMessage());
			e.printStackTrace();
		}
		System.out.println("Fim do método 1");
	}

	public static void metodo2() {
		System.out.println("Início do método 2");
		for (int i = 1; i <= 5; i++) {
			System.out.println(i);
			int a = 1 / 0;
			Conta c = null;
			c.deposita();
		}
		System.out.println("Fim do método 2");
	}

}
