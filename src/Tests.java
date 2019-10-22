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
	
	/* TEST Menu */
	
	@Test //return true
	public void testchoixLettreA() {
		Menu mnu = new Menu();
		assertEquals(mnu.choixLettre(), "a");
	}
	
	@Test //return error
	public void testchoixLettreB() {
		Menu mnu = new Menu();
		assertEquals(mnu.choixLettre(), "c");
	}
	
	
	@Test //return error
	public void testaccueil() {
		Menu mnu = new Menu();
		assertEquals(mnu.accueil(), "c");
	}
	

}
