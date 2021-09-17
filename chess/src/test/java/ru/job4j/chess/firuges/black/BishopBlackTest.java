package ru.job4j.chess.firuges.black;

import junit.framework.TestCase;
import org.junit.Test;
import ru.job4j.chess.ImpossibleMoveException;
import ru.job4j.chess.firuges.Cell;

import java.util.Arrays;

public class BishopBlackTest extends TestCase {

    public void testWhenPosition() {
        Cell expectedPos = Cell.D1;
        BishopBlack bb = new BishopBlack(expectedPos);
        Cell actualPos = bb.position();
        assertEquals(expectedPos, actualPos);
    }

    public void testWhenCopy() {
        BishopBlack bb = new BishopBlack(Cell.A6);
        Cell expectedPos = Cell.B7;
        Cell actualPos = bb.copy(expectedPos).position();
        assertEquals(expectedPos, actualPos);
    }

    @Test(expected = ImpossibleMoveException.class)
    public void testWhenWayException() {
        BishopBlack bb = new BishopBlack(Cell.C1);
        Cell[] actual = bb.way(Cell.G5);
    }

    public void testWhenWayValid() {
        BishopBlack bb = new BishopBlack(Cell.C1);
        Cell[] actual = bb.way(Cell.G5);
        Cell[] expected = new Cell[]{Cell.D2, Cell.E3, Cell.F4, Cell.G5};
        boolean eq = Arrays.equals(expected, actual);
        assertTrue(eq);
    }
}
