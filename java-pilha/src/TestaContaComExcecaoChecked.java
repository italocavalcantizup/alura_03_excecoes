
public class TestaContaComExcecaoChecked {

	public static void main(String[] args) {

		Conta c = new Conta();
		
		try {
			c.deposita();
		} catch (MyException e) {
			System.out.println("Tratamento " + e.getMessage());
		}
		
	}

}
