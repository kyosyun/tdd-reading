package money;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

//TODO $5 + 10CHF = $10
//TODO Money の丸めをどうする？
//TODO hashCode()
//TODO nullとの等価性比較
//TODO 他のオブジェクトとの等価性比較

//COMP amount を private にする
//COMP Dollar の副作用をどうするのか
//COMP $5 * 2 = $10 
//COMP equals()

class MoneyTest {

	@Test
	public void testMultiplication() {
		Dollar five = new Dollar(5);
		assertEquals(new Dollar(10), five.times(2));
		assertEquals(new Dollar(15), five.times(3));
	}
	
	@Test
	public void testEquality() {
		assertTrue(new Dollar(5).equals(new Dollar(5)));
		assertFalse(new Dollar(5).equals(new Dollar(6)));
	}
	
	@Test
	public void testFrancMultiplication() {
		Franc five = new Franc(5);
		assertEquals(new Franc(10), five.times(2));
		assertEquals(new Franc(15), five.times(3));
	}
	
}
