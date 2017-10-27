package sis.studentinfo;

import junit.framework.*;
import report.RosterReporterTest;
import sis.studentinfo.BoardTest;
import sis.studentinfo.CourseSessionTest;
import studentinfo.*;

/**
 * Created by shewei on 17/9/13.
 */
public class AllTests extends TestCase{
    public static TestSuite suite(){
        TestSuite suite = new TestSuite();
        suite.addTestSuite(StudentTest.class);
        suite.addTestSuite(CourseSessionTest.class);
        suite.addTestSuite(PawnTest.class);
        suite.addTestSuite(BoardTest.class);
        suite.addTestSuite(DateUtilTest.class);
        return  suite;
    }
}
