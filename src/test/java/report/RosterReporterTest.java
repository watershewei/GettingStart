package report;

import junit.framework.*;
import sis.report.*;
import sis.studentinfo.*;


/**
 * Created by shewei on 17/9/20.
 */


public class RosterReporterTest extends TestCase {

    public void testRosterReport(){
        CourseSession session = new CourseSession("ENGL", "101",
                                                   new DateUtil().createDate(2003, 1, 6));
        session.enroll(new Student("A"));
        session.enroll(new Student("B"));
        RosterReporter rosterReport = new RosterReporter(session);
System.out.println(rosterReport);
        assertEquals(
                RosterReporter.ROSTER_REPORT_HEADER +
                "A\nB\n" +
                RosterReporter.ROSTER_REPORT_FOOTER + "2\n",
                rosterReport.getReport());
    }
}

