package use_cases;

import java.util.ArrayList;
import business.Leilao;


// imports do pacote business

public class HandlerCriarLeilao {
	
	private ArrayList<Leilao> leiloes = new ArrayList<>();
	
	public void adicionaleilao(Leilao l) {
		this.leiloes.add(l);
	}
	
}
