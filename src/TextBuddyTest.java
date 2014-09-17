import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

/**
 * CS2103T (AY2014/15 Semester 1) CE1: TextBuddy Group: T17-3J
 * 
 * Unit test for TextBuddy.
 * 
 * @author WeiCheng (A0111815R)
 *
 */
public class TextBuddyTest {
	
	private static final String FILE_NAME = "mytextfile.txt";

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		TextBuddy tb = new TextBuddy(FILE_NAME);
		tb.checkFileStatus();
	}

	@Test
	public void testAdd() {
		assertEquals(true, TextBuddy.addText("aaaa"));
	}
	
	@Test
	public void testClear() {
		assertEquals(true, TextBuddy.clearText());
	}
	
	@Test
	public void testDeleteEmpty() {
		TextBuddy.clearText();	
		assertEquals(null, TextBuddy.deleteText(1));
	}
	
	@Test
	public void testDelete() {
		TextBuddy.addText("testing hahaha add");
		assertEquals("testing hahaha add", TextBuddy.deleteText(1));
	}

}
