package test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MixFixture {
	
	@BeforeClass
	public static void beforeClass() {
		System.out.println("Este método executa apenas uma única vez antes do primeiro teste da classe");
	}
	
	@AfterClass
	public static void afterClass() {
		System.out.println("Este método é executado apenas uma única vez ao final do último teste");
	}
	
	@Before
	public void before() {
		System.out.println("Este método é executado antes de todos os testes");
	}
	
	@After
	public void after() {
		System.out.println("Este método é executado depois de todos os testes");
	}
	
	@Test
	public void teste1() {
		System.out.println("Teste número 1");
	}
	
	@Test
	public void teste2() {
		System.out.println("Teste número 2");
	}

}
