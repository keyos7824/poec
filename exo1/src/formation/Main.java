package formation;

import junit.framework.*;

public class Main {

  public static Test suite() {
    TestSuite suite = new TestSuite("Tous les tests");
    suite.addTestSuite(AllTests.class);
    suite.addTestSuite(TraitementTest.class);

    return suite;
  }

  public static void main(String args[]) {
    junit.textui.TestRunner.run(suite());
  }
}