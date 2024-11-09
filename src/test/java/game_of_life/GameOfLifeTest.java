package game_of_life;

import java.util.List;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static java.util.Collections.emptyList;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GameOfLifeTest {

    /*
            1.	Cualquier celda viva con menos de dos celdas vecinas vivas muere, como si fuera por baja población.
            2.	Cualquier celda viva con más de tres celdas vecinas vivas muere, como si fuera por sobrepoblación.
            3.	Cualquier celda viva con dos o tres celdas vecinas vivas sigue viva en la siguiente generación.
            4.	Cualquier celda muerta con exactamente tres celdas vecinas vivas se convierte en una celda viva.
     */

    @Nested
    class Acceptance {

        @Test
        void should_not_have_any_cells_if_we_start_with_one() {
            List<List<Cell>> cells = List.of(
                List.of(new Cell(), new Cell(), new Cell()),
                List.of(new Cell(), new Cell(State.ALIVE), new Cell()),
                List.of(new Cell(), new Cell(), new Cell())
            );
            var game = new GameOfLife(cells);
            assertEquals(9, game.countAllCells());
            assertEquals(1, game.countAliveCells());

            game.iterate();

            assertEquals(0, game.countAliveCells());
            assertEquals(9, game.countAllCells());
        }
    }

    @Nested
    class Unit {
        @Test
        void should_be_dead_by_default() {
            var cell = new Cell();

            assertEquals(State.DEAD, cell.getState());
        }

        @Test
        void should_be_alive_if_define_by_constructor() {
            var cell = new Cell(State.ALIVE);

            assertEquals(State.ALIVE, cell.getState());
        }

        @Test
        void should_change_state_given_a_list_of_neighbour_cells(){
            var neighbourCells = List.of(new Cell(), new Cell(), new Cell(), new Cell(), new Cell(), new Cell(), new Cell(), new Cell());

            var cell = new Cell(State.ALIVE);

            cell.iterate(neighbourCells);
            assertEquals(State.DEAD, cell.getState());
        }

        @Test
        void should_stay_alive_if_three_a_live_cells_are_given(){
            var neighbourCells = List.of(new Cell(State.ALIVE), new Cell(State.ALIVE), new Cell(State.ALIVE), new Cell(), new Cell(), new Cell(), new Cell(), new Cell());
            var cell = new Cell(State.ALIVE);

            cell.iterate(neighbourCells);
            assertEquals(State.ALIVE, cell.getState());
        }
    }

    @Nested
    class Board {

        @Test
        void should_count_all_cells(){

            List<List<Cell>> cells = List.of(
                List.of(new Cell(), new Cell(), new Cell()),
                List.of(new Cell(), new Cell(), new Cell()),
                List.of(new Cell(), new Cell(), new Cell())
            );
            var game = new GameOfLife(cells);
            assertEquals(9, game.countAllCells());
        }

        @Test
        void should_count_alive_cells() {

            List<List<Cell>> cells = List.of(
                List.of(new Cell(), new Cell(), new Cell()),
                List.of(new Cell(), new Cell(State.ALIVE), new Cell()),
                List.of(new Cell(), new Cell(), new Cell())
            );
            var game = new GameOfLife(cells);
            assertEquals(1, game.countAliveCells());
        }
    }
}