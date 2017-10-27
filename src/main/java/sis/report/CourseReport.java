package sis.report;
import sis.studentinfo.*;
import java.util.*;
import java.lang.*;

/**
 * Created by shewei on 17/10/13.
 */
public class CourseReport {

    static final String NEWLINE = System.getProperty("line.separator");

    private ArrayList<CourseSession> sessions =
            new ArrayList<CourseSession>();

    public void add(CourseSession session){
        sessions.add(session);
    }

    public String text() {
        //Collections.sort(sessions);

        StringBuilder builder = new StringBuilder();
        for (CourseSession session: sessions) {
            builder.append(session.getDepartment() + " " +
                           session.getNumber() + NEWLINE);
        }
        return builder.toString();
    }

}
