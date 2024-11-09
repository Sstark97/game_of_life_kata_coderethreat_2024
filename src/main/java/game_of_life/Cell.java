package game_of_life;

import java.util.List;

public class Cell {

  private State state;

  public Cell() {
    this.state = State.DEAD;
  }

  public Cell(State state) {
    this.state = state;
  }


  public State getState() {
    return this.state;
  }

  public void iterate(List<Cell> neighbourCells) {
    var countAliveCells = neighbourCells.stream().filter(cell -> cell.state.equals(State.ALIVE)).count();

    if (countAliveCells == 3) this.state = State.ALIVE;
    else {
      this.state = State.DEAD;
    }

  }
}
