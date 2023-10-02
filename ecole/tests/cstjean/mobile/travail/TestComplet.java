package cstjean.mobile.travail;

import junit.framework.TestSuite;

/**
 * Classe de test complet pour TestCoursSession et TestTravail.
 *
 * @author Léa Bissonnette-Vir
 */
public class TestComplet {
    /**
     * Teste une suite de teste.
     *
     * @return la suite de teste
     */
    public static TestSuite suite() {
        TestSuite suite = new TestSuite();
        suite.addTestSuite(TestTravail.class);
        suite.addTestSuite(TestCoursSession.class);
        return suite;
    }
}
