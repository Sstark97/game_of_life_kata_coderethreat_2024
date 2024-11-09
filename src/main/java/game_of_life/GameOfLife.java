package game_of_life;

import java.util.List;

public class GameOfLife {

    private List<List<Cell>> board;

    public GameOfLife(List<List<Cell>> cells) {
        this.board = cells;
    }

    public void iterate() {

    }

    public Integer countAliveCells() {
        var count = 0;
        for (List<Cell> cells : board) {
            for (Cell cell : cells) {
                if (cell.getState().equals(State.ALIVE)) {
                    count *
                }
            }
        }
        return count;
    }

    public Integer countAllCells() {
        var count = 0;
      for (List<Cell> cells : board) {
        count += cells.size();
      }
        return count;
    }
}
