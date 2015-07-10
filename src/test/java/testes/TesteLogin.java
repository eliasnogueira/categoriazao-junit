package testes;

import org.junit.Test;
import org.junit.experimental.categories.Category;

import categorias.SmokeTests;
import categorias.TestesNegativos;
import categorias.TestesPositivos;

public class TesteLogin {

	@Test
	@Category( { SmokeTests.class, TestesPositivos.class} )
	public void loginComSucesso() {
		System.out.println("Executou o teste: 'loginComSucesso'");
	}
	
	@Test
	@Category(TestesNegativos.class)
	public void loginComSenhaErrada() {
		System.out.println("Executou o teste: 'loginComSenhaErrada'");
	}
	
	@Test
	@Category(TestesNegativos.class)
	public void loginComUsuarioInexistente() {
		System.out.println("Executou o teste: 'loginComUsuarioInexistente'");
	}
	


}
