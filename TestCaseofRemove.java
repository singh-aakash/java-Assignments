import static org.junit.Assert.*;

import org.junit.Test;


public class TestCaseofRemove {

	@Test
	public void test() {
		RemoveSpaces removeSpaces = new RemoveSpaces();
		String result = removeSpaces.SpaceRemovalFunction("Welcome     to      the    to      java      world", "to", 3);
		assertEquals("Welcome to the java world", result);
	}

}
