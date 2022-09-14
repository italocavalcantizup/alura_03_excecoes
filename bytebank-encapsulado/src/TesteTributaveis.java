
public class TesteTributaveis {

	public static void main(String[] args) {

		ContaCorrente cc = new ContaCorrente(1111, 2222);
		cc.deposita(100);
		
		SeguroDeVida sv = new SeguroDeVida();
	
		CalculadorDeImposto ci = new CalculadorDeImposto();
		ci.registra(cc);
		ci.registra(sv);
		
		System.out.println(ci.getTotalImposto());
		
	}

}
