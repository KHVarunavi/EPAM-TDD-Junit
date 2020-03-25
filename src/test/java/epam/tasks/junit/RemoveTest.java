package epam.tasks.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RemoveTest {
	RemoveA removeA;
	
	/*TODO
	 * 1. "ABCD"=>"BCD"
	 * 2. "AACD"=>"CD"
	 * 3. “BACD” => “BCD”
	 * 4. “BBAA” => “BBAA”
	 * 5. “AABAA” => “BAA”
	 * 6. "AAA" => "A"
	 * 7. "AA" =>	""
	 * 8. "A" => ""
	 * 9. "" => ""
	 */
	@BeforeEach
	void setUp() throws Exception {
		removeA = new RemoveA();
	}

	@Test
	void test1() {
		assertEquals("BCD",removeA.remove("ABCD"));	
	}
	
	@Test
	void test2() {
		assertEquals("CD",removeA.remove("AACD"));	
	}
	
	@Test
	void test3() {
		assertEquals("BCD",removeA.remove("BACD"));	
	}
	
	@Test
	void test4() {
		assertEquals("BBAA",removeA.remove("BBAA"));	
	}
	
	@Test
	void test5() {
		assertEquals("BAA",removeA.remove("AABAA"));	
	}
	
	@Test
	void test6() {
		assertEquals("A",removeA.remove("AAA"));
	}
	
	@Test
	void test7() {
		assertEquals("",removeA.remove("AA"));
	}

	@Test
	void test8() {
		assertEquals("",removeA.remove("A"));
	}
	
	@Test
	void test9() {
		assertEquals("",removeA.remove(""));
	}
}
