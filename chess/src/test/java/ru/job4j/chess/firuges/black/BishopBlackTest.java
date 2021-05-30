package ru.job4j.chess.firuges.black;

import org.junit.Test;
import ru.job4j.chess.ImpossibleMoveException;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.Figure;

import static org.junit.Assert.*;

public class BishopBlackTest {

    @Test
    public void position() {
        BishopBlack bb = new BishopBlack(Cell.A3);
        assertEquals(bb.position(), Cell.A3);
    }

    @Test
    public void way() {
        BishopBlack bishopBlack = new BishopBlack(Cell.C1);
        bishopBlack.way(Cell.G5);
        Cell[] i = new Cell[] {Cell.D2, Cell.E3, Cell.F4, Cell.G5};
        assertEquals(bishopBlack.way(Cell.G5), i);
    }

    @Test
    public void isDiagonal() {
        BishopBlack bishopBlack = new BishopBlack(Cell.D1);
        assertTrue(bishopBlack.isDiagonal(Cell.D1, Cell.A4));
    }

    @Test
    public void copy() {
        BishopBlack bb1 = new BishopBlack(Cell.A4);
        assertEquals(bb1.copy(Cell.D1).position(), Cell.D1);
    }

    @Test(expected = ImpossibleMoveException.class)
    public void whenImpossibleMove() {
        BishopBlack bishopBlack = new BishopBlack(Cell.C1);
        bishopBlack.way(Cell.D1);

    }
}