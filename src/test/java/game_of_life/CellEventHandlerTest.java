package game_of_life;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CellEventHandlerTest {
  @Test
  void should_listen_to_add_cell() {
    final var cellEventHandler = new Board();
    final var gameOfLife = new GameOfLife();

    gameOfLife.addEventListener(cellEventHandler);

    gameOfLife.addCell(new Position(0,0));

    assertEquals(1, cellEventHandler.countAliveNeigbours(0,1));
  }

  @Test
  void foo() {
    final var cellEventHandler = new Board();
    final var gameOfLife = new GameOfLife();

    gameOfLife.addEventListener(cellEventHandler);

    gameOfLife.addCell(new Position(0,0));
    gameOfLife.addCell(new Position(0,1));

    assertEquals(2, cellEventHandler.countAliveNeigbours(1,1));
  }
}