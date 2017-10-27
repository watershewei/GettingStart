package sis.report;

import sis.studentinfo.*;

/**
 * Created by shewei on 17/9/20.
 */
public class RosterReporter {

    public static final String NEWLINE = System.getProperty("line.separator");
    public static final String ROSTER_REPORT_HEADER = "Student Name:" + NEWLINE;
    public static final String ROSTER_REPORT_FOOTER = "Student Number:" + NEWLINE;

    public CourseSession session;

    public RosterReporter(CourseSession session){
        this.session = session;
    }

    public String getReport(){
        StringBuilder buffer = new StringBuilder();
        writeHeader(buffer);
        writeBody(buffer);
        writeFooter(buffer);
        return  buffer.toString();
    }


    void writeHeader(StringBuilder buffer){
        buffer.append(ROSTER_REPORT_HEADER);
    }

    void writeBody(StringBuilder buffer){
        for (Student student: session.getAllStudents()){
            buffer.append(student.getName());
            buffer.append(NEWLINE);
        }
    }

    void writeFooter(StringBuilder buffer){
        buffer.append(ROSTER_REPORT_FOOTER + session.getNumberOfStudent() + NEWLINE);
    }




}
