package sis.studentinfo;

import junit.framework.*;
import java.util.*;


/**
 * Created by shewei on 17/9/13.
 */
public class CourseSessionTest extends TestCase{

    Date startDate;
    CourseSession session;
    private static final int CREDITS = 3;

    public void setUp(){
        startDate = new DateUtil().createDate(2003,1,6);
        session = new CourseSession("ENGL","101",startDate);
    }


    public void testCreate() {
        assertEquals("ENGL", session.getDepartment());
        assertEquals("101", session.getNumber());
        assertEquals(0,  session.getNumberOfStudent());
    }

    public void testEnrollStudents(){
        final String firstStudentName  = "Water Hong";
        final String secondStudentName = "Jack Ma";
        Student student1 = new Student(firstStudentName);
        session.enroll(student1);
        assertEquals(1,  session.getNumberOfStudent());
        assertEquals(student1, session.get(0));

        Student student2 = new Student(secondStudentName);
        session.enroll(student2);
        assertEquals(2,  session.getNumberOfStudent());

        assertEquals(student1, session.get(0));
        assertEquals(student2, session.get(1));
    }

    public void testCourseDates(){
        Date sixteenWeeksOut = new DateUtil().createDate(2003, 4, 25);
        assertEquals(sixteenWeeksOut, session.getEndDate());
    }

    private CourseSession createCourseSession() {
        CourseSession session = new CourseSession("ENGL", "101", startDate);
        session.setNumberOfCredits(CourseSessionTest.CREDITS);
        return session;
    }

    public void testCount(){
        CourseSession.resetCount();
        createCourseSession();
        assertEquals(1, CourseSession.getCount());
        createCourseSession();
        assertEquals(2, CourseSession.getCount());
    }

    public void testComparable()  {

        final Date date = new Date();
        CourseSession sessionA = new CourseSession("CMSC", "101", date);
        CourseSession sessionB = new CourseSession("ENGL", "101", date);

        assertTrue(sessionA.compareTo(sessionB) < 0);

        assertTrue(sessionB.compareTo(sessionA) > 0);
        CourseSession sessionC = new CourseSession("CMSC", "101", date);
        assertEquals(0, sessionA.compareTo(sessionC));
    }

    public void testComparableAll()  {
        final Date date = new Date();
        CourseSession sessionA = new CourseSession("CMSC",
                "101", date);
        CourseSession sessionB = new CourseSession("ENGL",
                "101", date);
        assertTrue(sessionA.compareTo(sessionB) < 0);
        assertTrue(sessionB.compareTo(sessionA) > 0);
        CourseSession sessionC = new CourseSession("CMSC",
                "101", date);
        assertEquals(0, sessionA.compareTo(sessionC));
        CourseSession sessionD = new CourseSession("CMSC",
                "210", date);
        assertTrue(sessionC.compareTo(sessionD) < 0);
        assertTrue(sessionD.compareTo(sessionC) > 0);
    }




}
