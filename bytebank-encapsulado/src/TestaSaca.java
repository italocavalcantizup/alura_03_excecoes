
public class TestaSaca {

	public static void main(String[] args) {

		Conta conta = new ContaCorrente(123, 321);
		
		conta.deposita(300);
		
		try {
			conta.saca(301);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println(conta.getSaldo());
		
	}

}
