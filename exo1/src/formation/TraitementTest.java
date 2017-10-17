package formation;

import junit.framework.TestCase;

public class TraitementTest extends TestCase {

	Traitement t = null;
	
	public TraitementTest(String name) {
		super(name);
		t = new Traitement ();		
	}

	protected void setUp() throws Exception {
		super.setUp();
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}

	public void testSomme() {
		//fail("Not yet implemented");
		assertEquals(t.somme (10,20), 30);
	}

	public void testProduit() {
		//fail("Not yet implemented");
		assertEquals(t.produit (10,20), 200);
	}

}
