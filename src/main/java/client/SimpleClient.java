package client;

// descomentar caso opte por usar handlers:

import use_cases.HandlerCriarLeilao;
import use_cases.HandlerGerirLeilao;

import business.*;

/**
 * Cliente simples
 *	
 * @author ...
 * @version ...
 * 
 */
public class SimpleClient {

	/**
	 * A simple interaction with the application services
	 * 
	 * @param id, um valor inteiro indentificador do cliente.
	 * @param name, string do nome do cliente.
	 * @param datenasc, data de nascimento do cliente.
	 */
	
	private int id ;
	private String name ;
	private String dateNasc ;
	private HandlerCriarLeilao HCL = new HandlerCriarLeilao();
	
	public SimpleClient(int id, String name, String dateNasc) {
		this.id = id;
		this.name = name;
		this.dateNasc = dateNasc;
	}
	
	public boolean licitarounao(HandlerGerirLeilao hgl, int licitacao) {
		if (licitacao > hgl.liciInic()) {
			return true;
		}
		return false;
	}
	
	//Getters___________________________________________________________________________________________________________________

	public int id() {
		return this.id;
	}
	
	public String descricao() {
		return this.name;
	}

	public String artigo() {
		return this.dateNasc;
	}
	
	public HandlerCriarLeilao hcl() {
		return this.HCL;
	}
	
	public void criarleilao(int id, String desc, String artg) {
		this.HCL.adicionaleilao(new Leilao(id, desc, artg));
		
	}
	
	public static void main(String[] args) {
		
	}
}
