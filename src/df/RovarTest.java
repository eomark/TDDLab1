package df;
import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;
public class RovarTest {

	@BeforeClass
	public static void  testFinalClass() {
		Rovar rovar = new Rovar();
		
	}
	
	@Test
	public void testEnrov1() {
		String result = Rovar.enrov("abcdefghijklmnopqrstuvwxyz");
		System.out.println(result);
		//assertNotNull(result);
		assertEquals("abobcocdodefofgoghohijojkoklolmomnonopopqoqrorsostotuvovwowxoxyzoz", result);
	}
	@Test
	public void testEnrov2() {
		String result = Rovar.enrov("ABCDEFGHIJKLMNOPQRSTUVWXYZ");
		System.out.println(result);
		//assertNotNull(result);
		assertEquals("ABOBCOCDODEFOFGOGHOHIJOJKOKLOLMOMNONOPOPQOQRORSOSTOTUVOVWOWXOXYZOZ", result);
	}
	@Test
	public void testEnrov3() {
		String result = Rovar.enrov("1234567890");
		System.out.println(result);
		//assertNotNull(1234567890);
		//assertTrue(Integer.parseInt(result)> 0);
	}
	@Test
	public void testEnrov4() {
		String result = Rovar.enrov(" ");
		System.out.println(result);
		assertEquals(result, " ");
	}
	@Test
	public void testEnrov5() {
		String result = Rovar.enrov("½!`#¤%&/()=?");
		System.out.println(result);
		//assertEquals(result, null);
		assertNotNull(result);	
	}
	@Test
	public void testEnrov6() {
		String result = Rovar.enrov("high Loop");
		System.out.println(result);
		assertEquals(result, "hohigoghoh LOLoopop");
		//assertNotNull(result);
	}
	@Test
	public void testEnrov7() {
		String result = Rovar.enrov("hell# 23Omar");
		System.out.println(result);
		//assertEquals(result, "null");
		assertNotNull(result);

	}
	@Test
	public void testEnrov8() {
		String result = Rovar.enrov("");
		System.out.println(result);
		assertNotNull(result);
	}
	@Test
	public void testNull() {
		String result = Rovar.enrov(null);
		assertNull(result);
	}

	@Test
	public void testDerov1() {
		String result = Rovar.derov("abobcocdodefofghohijojkoklolmomnonopopqoqrorsostotuvovwowxoxyzoz");
		System.out.println(result);
		//assertNotNull(result);
		assertEquals("abcdefghijklmnopqrstuvwxyz", result);
	}
	@Test
	public void testDerov2() {
		String result = Rovar.derov("ABOBCOCDEFOFGOGHOHIJOJKOKLOLMOMNONOPOPQOQRORSOSTOTUVOVWOWXOXYZOZ");
		System.out.println(result);
		//assertNotNull(result);
		assertEquals("ABCDEFGHIJKLMNOPQRSTUVWXYZ", result);
	}
	
	@Test
	public void testDerov3() {
		String result = Rovar.derov("1234567890");
		System.out.println(result);
		assertNotNull(1234567890);
		//assertTrue(Integer.parseInt(result)> 0);
	}	
	
	@Test
	public void testDerov4() {
		String result = Rovar.derov(" ");
		System.out.println(result);
		assertEquals(result, " ");
	}
	@Test
	public void testDerov5() {
		String result = Rovar.derov("½!`#¤%&/()=?");
		System.out.println(result);
		//assertEquals(result, null);
		assertNotNull(result);	
	}
	@Test
	public void testDerov6() {
		String result = Rovar.derov("hohigoghoh loloopop");
		System.out.println(result);
		assertEquals(result, "high loop");
		//assertNotNull(result);
	}
	@Test
	public void testDerov7() {
		String result = Rovar.derov("hohelollol# 23Omomaror");
		System.out.println(result);
		//assertEquals(result, "null");
		assertNotNull(result);

	}
	@Test
	public void testDerov8() {
		String result = Rovar.derov("");
		System.out.println(result);
		assertNotNull(result);
	}
	
	@Test
	public void testDerovNull() {
		String result = Rovar.derov(null);
		assertNull(result);
	}

	
}
