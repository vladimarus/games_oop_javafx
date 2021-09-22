package ru.job4j.chess;

import org.junit.Ignore;
import org.junit.Test;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.black.BishopBlack;

public class LogicTest {

    //    @Ignore
    @Test
    public void testWhenMoveCorrect()
            throws FigureNotFoundException, OccupiedCellException, ImpossibleMoveException {
        Logic logic = new Logic();
        logic.add(new BishopBlack(Cell.C1));
        logic.move(Cell.C1, Cell.H6);
    }

    @Test(expected = OccupiedCellException.class)
    public void testWhenMoveThrowOccupiedEx()
            throws OccupiedCellException, FigureNotFoundException {
        Logic logic = new Logic();
        logic.add(new BishopBlack(Cell.C1));
        logic.add(new BishopBlack(Cell.D2));
        logic.move(Cell.C1, Cell.E3);
    }

    @Test(expected = FigureNotFoundException.class)
    public void testWhenMoveThrowFigureNotFoundEx()
            throws OccupiedCellException, FigureNotFoundException {
        Logic logic = new Logic();
        logic.move(Cell.D2, Cell.E3);
    }

    @Test(expected = ImpossibleMoveException.class)
    public void testWhenMoveThrowImpossibleMoveEx()
            throws OccupiedCellException, FigureNotFoundException {
        Logic logic = new Logic();
        logic.add(new BishopBlack(Cell.C1));
        logic.move(Cell.C1, Cell.C4);
    }
}