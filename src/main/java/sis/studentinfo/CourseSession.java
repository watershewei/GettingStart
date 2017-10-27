package sis.studentinfo;

import java.util.*;

/**
 * Created by shewei on 17/9/13.
 */

public class CourseSession {

    private String department;
    private String number;
    private ArrayList<Student> students = new ArrayList<Student>();
    private Date startDate;
    private static int count;
    private int numberOfCredits;

    public CourseSession(String department, String number, Date startDate){
        this.department = department;
        this.number = number;
        this.startDate = startDate;
        CourseSession.incrementCount();
    }


    public String getDepartment(){
        return department;
    }
    public String getNumber(){
        return number;
    }

    public void enroll(Student student) {
        student.addCredits(numberOfCredits);
        students.add(student);
    }

    public int getNumberOfStudent(){

        return students.size();
    }


    Student get(int index){
        return students.get(index);
    }

    public ArrayList<Student> getAllStudents(){
        return students;
    }

    Date getStartDate(){
        return startDate;
    }

    final int sessionLength = 16;
    final int daysInWeek = 7;
    final int daysFromFridayToMonday= 3;

    Date getEndDate(){
        GregorianCalendar calendar = new GregorianCalendar();
        calendar.setTime(startDate);
        int numbersOfDay = sessionLength * daysInWeek - daysFromFridayToMonday;
        calendar.add(Calendar.DAY_OF_YEAR, numbersOfDay);
        return calendar.getTime();
    }

    static void createCourseSession(){

    }

    static int getCount() {
        return count;
    }

    static void resetCount(){
        count = 0;
    }

    private static void incrementCount(){
        count = count + 1;
    }


    void setNumberOfCredits (int numberOfCredits) {
        this.numberOfCredits = numberOfCredits;
    }

    public interface Comparable<T> {
        public int compareTo(T o);
    }

    public int compareTo(CourseSession that) {

        int compare =  this.getDepartment().compareTo(that.getDepartment());
        if ( 0 == compare) {
            compare = this.getNumber().compareTo(that.getNumber());
        }
        return compare;

    }
}
