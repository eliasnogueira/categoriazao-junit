package suites;

import org.junit.experimental.categories.Categories;
import org.junit.experimental.categories.Categories.ExcludeCategory;
import org.junit.experimental.categories.Categories.IncludeCategory;
import org.junit.runner.RunWith;
import org.junit.runners.Suite.SuiteClasses;

import categorias.TestesNegativos;
import categorias.TestesPositivos;
import testes.TesteLogin;
import testes.TesteProduto;

// informando para o JUnit que ele usará as categorias para a execução
@RunWith(Categories.class)

// informando as classes que estão contidas na suite (que irão executar)
@SuiteClasses({ TesteLogin.class, TesteProduto.class })

// efetuando o filtro somete para os teste onde a categoria seja 'TestesPositivos'
@IncludeCategory( {TestesPositivos.class} )
@ExcludeCategory( {TestesNegativos.class})
public class Suite_TestesPositivos {

	/*
	 * Aqui dentro da classe não vai código
	 */
}
