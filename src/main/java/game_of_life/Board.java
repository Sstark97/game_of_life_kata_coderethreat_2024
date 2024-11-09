package game_of_life;

import java.util.ArrayList;
import java.util.List;

public class Board implements Neighbourhood, CellAddedListener {

  private List<Position> aliveCells = new ArrayList<>();

  @Override
  public void process(Position cell) {
    aliveCells.add(cell);
  }

  @Override
  public int countAliveNeigbours(int x, int y) {
    return (int) aliveCells.stream()
                           .filter(calculateNeighbours(x, y)::contains)
                           .count();

  }

  private static List<Position> calculateNeighbours(int x, int y) {
    return List.of(
        new Position(x - 1, y - 1), // upLeft
        new Position(x - 1, y), // up
        new Position(x - 1, y + 1), // upRight
        new Position(x, y - 1), // left
        new Position(x, y + 1), // right
        new Position(x + 1, y - 1), // downLeft
        new Position(x + 1, y), // down
        new Position(x + 1, y + 1) // downRight
    );
  }
}
