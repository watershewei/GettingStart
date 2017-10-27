package report;

import junit.framework.*;

import java.util.ArrayList;
import java.util.Date;
import sis.report.*;
import sis.studentinfo.*;

/**
 * Created by shewei on 17/10/13.
 */

public class CourseReportTest extends TestCase {

    static final String NEWLINE = System.getProperty("line.separator");

    public void testReport() {
        final Date date = new Date();

        CourseReport report = new CourseReport();

        report.add(new CourseSession("ENGL", "101", date));
        report.add(new CourseSession("CZEC", "200", date));
        report.add(new CourseSession("ITAL", "410", date));
/*
        assertEquals("ENGL 101" + NEWLINE +
                     "CZEC 200" + NEWLINE +
                     "ITAL 410" + NEWLINE,
                     report.text());
*/

        assertEquals("CZEC 200" + NEWLINE +
                     "ENGL 101" + NEWLINE +
                     "ITAL 410" + NEWLINE,
                     report.text());
    }


    public void testSortStringsInPlace() {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Heller");
        list.add("Kafka");
        list.add("Camus");
        list.add("Boyle");
        java.util.Collections.sort(list);
        assertEquals("Boyle", list.get(0));
        assertEquals("Camus", list.get(1));
        assertEquals("Heller", list.get(2));
        assertEquals("Kafka", list.get(3));
    }

    public void testSortStringsInNewList() {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Heller");
        list.add("Kafka");
        list.add("Camus");
        list.add("Boyle");

        ArrayList<String> sortedList = new ArrayList<String>(list);
        java.util.Collections.sort(sortedList);

        assertEquals("Boyle", sortedList.get(0));
        assertEquals("Camus", sortedList.get(1));
        assertEquals("Heller", sortedList.get(2));
        assertEquals("Kafka", sortedList.get(3));
        assertEquals("Heller", list.get(0));
        assertEquals("Kafka", list.get(1));
        assertEquals("Camus", list.get(2));
        assertEquals("Boyle", list.get(3));
    }

}