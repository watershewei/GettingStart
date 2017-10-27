package sis.report;
import junit.framework.*;

import report.RosterReporterTest;

/**
 * Created by shewei on 17/9/21.
 */
public class AllTests extends TestCase{


    public static TestSuite suite(){
        TestSuite suite = new TestSuite();
        suite.addTestSuite(RosterReporterTest.class);
        return  suite;
    }
}

