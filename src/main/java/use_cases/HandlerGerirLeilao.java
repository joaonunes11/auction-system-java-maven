package use_cases;

// imports do pacote business

public class HandlerGerirLeilao {
	
	private int id ;
	private String deadline ;
	private int liciInic ;
	private HandlerCriarLeilao cl ;
	
	public HandlerGerirLeilao (int id) {
		this.id = id;
	}
	
	public void setleilao (String deadline, int liciInic, HandlerCriarLeilao cl) {
		this.deadline = deadline;
		this.liciInic = liciInic;
		this.cl = cl;
	}
	
	public int id() {
		return this.id;
	}
	
	public int preçoleilao() {
		return this.liciInic;
	}
	
	public int liciInic() {
		return this.liciInic;
	}
	
}
