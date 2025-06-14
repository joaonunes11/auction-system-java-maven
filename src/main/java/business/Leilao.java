package business;

import java.util.*;

public class Leilao {

	private int id ;
	private String descricao ;
	private String artigo ;
	
	public Leilao(int id, String descricao, String artigo) {
		this.id = id;
		this.descricao = descricao;
		this.artigo = artigo;
	}
	
	//Getters___________________________________________________________________________________________________________________

	public int id() {
		return this.id;
	}
	
	public String descricao() {
		return this.descricao;
	}

	public String artigo() {
		return this.artigo;
	}
	
}
