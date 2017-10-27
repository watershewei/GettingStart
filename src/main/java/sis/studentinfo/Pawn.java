package sis.studentinfo;

/**
 * Created by shewei on 17/9/13.
 */
public class Pawn {


    final String WhitePawnColor = "white";

    private String color;

    public Pawn(String color){
        this.color = color;
    }

    public Pawn(){
        this.color = WhitePawnColor;
    }

    public String getColor(){
        return color;

    }
}
