package business;

import static org.junit.Assert.*;

// cf. API at http://junit.org/junit4/javadoc/latest/
import org.junit.BeforeClass;
import org.junit.Before; 
import org.junit.Test;

import client.SimpleClient;
import use_cases.HandlerCriarLeilao;
import use_cases.HandlerGerirLeilao;

import org.junit.AfterClass;

public class LeilaoTest {
	
	private HandlerGerirLeilao HGL  = new HandlerGerirLeilao(1);
	private SimpleClient vendedor = new SimpleClient(1, "Afonso", "1989-05-11");
	private SimpleClient comprador = new SimpleClient(1, "Gustavo", "1999-04-15");
	
	@Before   // run before each test
	public void setup() {
		
		//vendedor adiciona itens que quer leiloar.
		vendedor.criarleilao(123, "descricao", "artigo");
		vendedor.criarleilao(213, "outra descricao", " outro artigo");
		vendedor.criarleilao(321, " diferente descricao", "diferente artigo");
		
		//itens adicionados serão postos para leilão.
		HGL.setleilao("2021-07-14", 123, vendedor.hcl());
		
	}
	
	@Test
	public void test_umCertoMetodo() {
		int preco = 150;
		//comprador verifica o preço e determina se quer licitar
		if (comprador.licitarounao(HGL, preco)) {
			
			Licitacao pedido = new Licitacao(HGL.id(), "2021-07-01;06:00", preco);
			
			HGL.setleilao("2021-07-14", preco, vendedor.hcl());
			
			System.out.println("Licitação Efetuada");
			System.out.print("Novo Preço de Licitação: ");
			System.out.print(HGL.liciInic());
			
		} else {
			System.out.print("Licitação não Efetuada");
		}
		
	}
	
}
