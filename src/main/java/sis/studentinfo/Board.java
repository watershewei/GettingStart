package sis.studentinfo;

import java.util.ArrayList;

/**
 * Created by shewei on 17/9/15.
 */
public class Board {

    private ArrayList<Pawn> pawns = new ArrayList<Pawn>();

    void add(Pawn pawn){
        pawns.add(pawn);
    }

    int getNumberOfPawn(){
        return pawns.size();
    }

    Pawn get(int index){
        return pawns.get(index);
    }

}
