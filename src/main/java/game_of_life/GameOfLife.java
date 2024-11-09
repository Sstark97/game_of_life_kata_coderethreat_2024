package game_of_life;

import java.util.ArrayList;
import java.util.List;

public class GameOfLife {
  private List<CellAddedListener> cellAddedListeners = new ArrayList<>();

  public void addEventListener(CellAddedListener cellAddedListener) {
    cellAddedListeners.add(cellAddedListener);
  }

  public void addCell(Position cell) {
    cellAddedListeners.forEach(cellAddedListener -> cellAddedListener.process(cell));
  }
}
