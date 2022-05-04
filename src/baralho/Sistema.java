package baralho;

public class Sistema {
	
	
	public static void main(String[] args) {
				
		Carta carta1 = new Carta();
		Carta carta2 = new Carta(1,Naipe.COPAS.toString());
	    
		carta1.setNaipe(Naipe.COPAS.toString());
		carta1.setValor(1);
		
		Boolean comparar= carta1.comparaNipe(carta2);
		System.out.println(comparar);
		
		Integer maior= carta1.maior(carta2);
		System.out.println(maior);
		
	}
}
