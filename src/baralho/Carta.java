package baralho;

public class Carta {
	
	private Integer valor;
	private String naipe;
	
	public Carta() {
		this.valor = 0;
		this.naipe = "";
	}
	
	public Carta(Integer valor, String naipe) {
		this.valor = valor;
		this.naipe = naipe;
	}
	
	
	public Integer maior(Carta segundaCarta) {
		
		Integer valorPrimeiraCarta = this.getValor();
		Integer valorSegundaCarta = segundaCarta.getValor();
		
		if(valorPrimeiraCarta > valorSegundaCarta) {
			return 1;
		}else if(valorPrimeiraCarta == valorSegundaCarta) {
			return 0;
		}
		return -1;
	}
	
	public Boolean comparaNipe(Carta segundaCarta) {
		
		String nipePrimeiraCarta = this.getNaipe();
		String nipeSegundaCarta = segundaCarta.getNaipe();
		if(nipePrimeiraCarta == nipeSegundaCarta) {
			return true;
		}else {
			return false;
		}
	}
	
	public Integer getValor() {
		return valor;
	}
	
	public void setValor(Integer valor) {
		this.valor = valor;
	}
	
	public String getNaipe() {
		return naipe;
	}
	
	public void setNaipe(String naipe) {
		this.naipe = naipe;
	}
	
	
}
