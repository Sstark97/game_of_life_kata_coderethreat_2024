package game_of_life;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CellTest {
  public class FakeNeighbourhood implements Neighbourhood {

    private final int aliveCount;

    public FakeNeighbourhood(int aliveCount) {
      this.aliveCount = aliveCount;
    }

    @Override
    public int countAliveNeigbours(int x, int y) {
      return aliveCount;
    }
  }

  @Test
  void test() {
    var neighbourhood = new FakeNeighbourhood(0);
    var fakeDieListener = new FakeDieListener();
    final var cell = new Cell(neighbourhood, new Position(0, 0));
    cell.addEventListener(fakeDieListener);

    cell.processSunset();

    Assertions.assertTrue(fakeDieListener.hasBeenCalled);
  }

  private class FakeDieListener implements DieListener{
    private boolean hasBeenCalled = false;

    @Override
    public void process(Position cell) {
        hasBeenCalled = true;
    }
  }
}
