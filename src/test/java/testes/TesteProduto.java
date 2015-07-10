package testes;

import org.junit.Test;
import org.junit.experimental.categories.Category;

import categorias.SmokeTests;
import categorias.TestesNegativos;
import categorias.TestesPositivos;

public class TesteProduto {

	@Test
	@Category(TestesPositivos.class)
	public void cadastrarProduto() {
		System.out.println("Executou o teste: 'cadastrarProduto'");
	}
	
	@Test
	@Category( { SmokeTests.class, TestesPositivos.class })
	public void pesquisarProdutoPorNome() {
		System.out.println("Executou o teste: 'pesquisarProdutoPorNome'");
	}
	
	@Test
	@Category(TestesNegativos.class)
	public void naoPreencherCamposObrigatorios() {
		System.out.println("Executou o teste: 'naoPreencherCamposObrigatorios'");
	}

}
