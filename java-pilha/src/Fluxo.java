public class Fluxo {

	public static void main(String[] args) {
		System.out.println("Início do main");
		metodo1();
		System.out.println("Fim do main");
	}

	public static void metodo1() {
		System.out.println("Início do método 1");
		try {
			metodo2();			
		} catch (Exception e) { 
			System.out.println("Exception " + e.getMessage());
			e.printStackTrace();
		}
		System.out.println("Fim do método 1");
	}

	public static void metodo2() throws MyException {
		System.out.println("Início do método 2");
		
		throw new MyException("Deu erro!");
		
//		System.out.println("Fim do método 2");
	}

}
