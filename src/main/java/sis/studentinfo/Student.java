package sis.studentinfo;

import com.sun.corba.se.spi.presentation.rmi.IDLNameTranslator;

/**
 * Created by shewei on 17/9/12.
 */
public class Student {


    public static final int CREDITS_REQUIRED_FOR_FULL_TIME = 12;
    public static final String IN_STATE = "CO";
    private String name;
    private int credits;
    private String state = "";

    public Student(final String name){
        this.name = name;
        credits = 0;
    }

    public String getName(){
        return name;
    }

    public boolean isFullTime(){
        return credits >= CREDITS_REQUIRED_FOR_FULL_TIME;
    }


    public int getCredits() {
        return credits;
    }

    public void addCredits(int credits){
        this.credits += credits;
    }

    public boolean isInState(){
        return state.equals(IN_STATE);
    }

    public void setState(String state){
        this.state = state;
    }
}
