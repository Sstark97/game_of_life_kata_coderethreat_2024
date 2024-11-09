package game_of_life;

import java.util.HashMap;
import java.util.Map;

public class Cell {
  private Map<Integer, State> foo = Map.of(0, State.dead(), 1, State.dead(), 2, State.dead(), 3, State.alive(), 4, State.dead());
  private State state = new State(true);

  public State isAlive() {
    return state;
  }

  void kill() {
    state = new State(false);
  }

  void kill(boolean newState) {
    state = new State(newState);
  }

  public void nextStep(Integer neighbours) {
    kill(foo.get(neighbours).value());
  }
}
