package cl.ubb.agil.calculadora.ejemplo;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

import cl.ubb.agil.Calculator;

public class test {
private Calculator calculadora; 
	@Before
	public void setup() throws Exception{
		
		calculadora = new Calculator();
	}
	
	
	@Test
	public void sumarDosMasTresEsCinco(){
		
		/* Act */
		int resultado = calculadora.adder(2,3);
		
		/* Assert */
		assertThat(resultado,is(5));
	}
}
