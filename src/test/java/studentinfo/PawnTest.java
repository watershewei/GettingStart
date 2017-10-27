package studentinfo;


import junit.framework.*;
import sis.studentinfo.Pawn;


/**
 * Created by shewei on 17/9/13.
 */
public class PawnTest extends TestCase {


    public void testCreate(){

        final String firstPawnColor = "white";
        Pawn pawn = new Pawn(firstPawnColor);
        assertEquals(firstPawnColor, pawn.getColor());

        final String secondPawnColor = "black";
        Pawn secondPawn = new Pawn(secondPawnColor);
        assertEquals(secondPawnColor, secondPawn.getColor());

        assertEquals(firstPawnColor,pawn.getColor());
    }

    public void testWithColor(){
        Pawn pawn = new Pawn();
    }
}
