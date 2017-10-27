
package studentinfo;

import junit.framework.*;
import sis.studentinfo.*;


/**
 * Created by shewei on 17/9/12.
 */
public class StudentTest extends TestCase
{
    public void testCreate() {
        final String firstStudentName = "Jane Doe";
        Student firstStudent =  new Student(firstStudentName);
        assertEquals(firstStudentName, firstStudent.getName());

        final String secondStudentName = "Water hong";
        Student secondStudent =  new Student(secondStudentName);
        assertEquals(secondStudentName, secondStudent.getName());

        assertEquals(firstStudentName, firstStudent.getName());
    }

    public void testStudentStatus() {
        Student student = new Student("A");
        assertEquals(0, student.getCredits());
        assertFalse(student.isFullTime());

        student.addCredits(3);
        assertEquals(3, student.getCredits());
        assertFalse(student.isFullTime());

        student.addCredits(4);
        assertEquals(7, student.getCredits());
        assertFalse(student.isFullTime());

        student.addCredits(5);
        assertEquals(Student.CREDITS_REQUIRED_FOR_FULL_TIME, student.getCredits());
        assertTrue(student.isFullTime());
    }


    public void testStudentInState(){
        Student student = new Student("A");
        assertFalse(student.isInState());
        student.setState(Student.IN_STATE);
        assertTrue(student.isInState());
        student.setState("MD");
        assertFalse(student.isInState());

    }

}



