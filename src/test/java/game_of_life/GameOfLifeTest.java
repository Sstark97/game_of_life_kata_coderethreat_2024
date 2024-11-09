package game_of_life;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class GameOfLifeTest {

    /*
            1.	Cualquier celda viva con menos de dos celdas vecinas vivas muere, como si fuera por baja población.
            2.	Cualquier celda viva con más de tres celdas vecinas vivas muere, como si fuera por sobrepoblación.
            3.	Cualquier celda viva con dos o tres celdas vecinas vivas sigue viva en la siguiente generación.
            4.	Cualquier celda muerta con exactamente tres celdas vecinas vivas se convierte en una celda viva.
     */
    @Test
    void foo() {
        assertTrue(true);
    }
}