package game_of_life;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CellEventStoreTest {
  @Test
  void should_listen_to_add_cell() {
    final var cellEventStore = new CellEventStore();
    final var gameOfLife = new GameOfLife();

    gameOfLife.addEventListener(cellEventStore);

    gameOfLife.addCell(new Cell(0,0));

    assertEquals(1, cellEventStore.getAliveNeigbours(0,1));
  }

  @Test
  void foo() {
    final var cellEventStore = new CellEventStore();
    final var gameOfLife = new GameOfLife();

    gameOfLife.addEventListener(cellEventStore);

    gameOfLife.addCell(new Cell(0,0));
    gameOfLife.addCell(new Cell(0,1));

    assertEquals(2, cellEventStore.getAliveNeigbours(1,1));
  }
}