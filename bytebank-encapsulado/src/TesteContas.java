public class TesteContas {

	public static void main(String[] args) {

		ContaCorrente cc = new ContaCorrente(111, 222);
		cc.deposita(500);
		
		ContaPoupanca cp = new ContaPoupanca(333, 444);
		cp.deposita(200);
		
		cc.transfere(100, cp);
		
		System.out.println(cc.getSaldo());
		System.out.println(cp.getSaldo());
		
	}

}
