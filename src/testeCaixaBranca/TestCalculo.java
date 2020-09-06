package testeCaixaBranca;



import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class TestCalculo {
	Calculadora c;
	@Before
	public void setUp() throws Exception {
		 c = new Calculadora();
	}

	@Test
	public void soma() {
 Assert.assertEquals(2, c.soma(1, 1));
	}
	

	@Test
	public void subtrai() {
 Assert.assertEquals(2, c.subtrai(3, 1));
	}

	
	@Test
	public void multiplica() {
 Assert.assertEquals(1, c.multiplica(1, 1));
	}

	
	@Test
	public void divide() {
 Assert.assertEquals(2, c.divide(12, 6));
	}
	
}