package sis.studentinfo;


import junit.framework.*;
import sis.studentinfo.Board;
import sis.studentinfo.Pawn;

/**
 * Created by shewei on 17/9/15.
 */
public class BoardTest extends TestCase {
    final String firstPawnColor = "white";
    final String secondPawnColor = "black";

    public void testCreate(){
        Board board = new Board();
        Pawn firstPawn = new Pawn(firstPawnColor);
        board.add(firstPawn);
        assertEquals(1, board.getNumberOfPawn());
        assertEquals(firstPawn, board.get(0));

        Pawn secondPawn = new Pawn(secondPawnColor);
        board.add(secondPawn);
        assertEquals(2, board.getNumberOfPawn());
        assertEquals(secondPawn, board.get(1));
    }
}
