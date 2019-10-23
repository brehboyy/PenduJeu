package com.team2;
import static org.junit.Assert.assertEquals;

import java.io.IOException;

import org.junit.*;

/**
 * 
 * Cette classe va permettre de tester toute les methodes qui doivent etre testé par junit
 * 
 * @version 1.0
 *
 * @see Tests
 * @author Ousmane Diarra
 */
public class Tests {
	
	/* TEST DictionaireDeMot */
	
	@Test
	public void testGetMotFacile() {
		DictionnaireDeMot ddm = new DictionnaireDeMot("test.txt");
		assertEquals(ddm.getMotFacile(), "foch");
	}
	
	@Test
	public void testGetMotDur() {
		DictionnaireDeMot ddm = new DictionnaireDeMot("test.txt");
		assertEquals(ddm.getMotDur(), "publication");
	}
}
