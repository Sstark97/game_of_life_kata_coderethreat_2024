package game_of_life;

import java.util.List;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GameOfLifeTest {

    /*
            1.	Cualquier celda viva con menos de dos celdas vecinas vivas muere, como si fuera por baja población.
            2.	Cualquier celda viva con más de tres celdas vecinas vivas muere, como si fuera por sobrepoblación.
            3.	Cualquier celda viva con dos o tres celdas vecinas vivas sigue viva en la siguiente generación.
            4.	Cualquier celda muerta con exactamente tres celdas vecinas vivas se convierte en una celda viva.
     */
  @Test
  void a_cell_is_alive_by_default() {
    var cell = new Cell();

    assertEquals(State.alive(), cell.isAlive());
  }
  @Test
  void a_cell_is_not_alive() {
    var cell = new Cell();

    cell.kill();

    assertEquals(State.dead(), cell.isAlive());
  }

  @Test
  void a_cell_without_neighbours_should_die() {
    var cell = new Cell();

    cell.nextStep(0);

    assertEquals(State.dead(), cell.isAlive());
  }

  @Test
  void a_cell_with_more_than_three_neighbours_should_be_alive() {
    var cell = new Cell();

    cell.nextStep(3);

    assertEquals(State.alive(), cell.isAlive());

    cell.nextStep(4);

    assertEquals(State.dead(), cell.isAlive());
  }


}