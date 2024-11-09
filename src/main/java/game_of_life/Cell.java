package game_of_life;

import java.util.Objects;

public final class Cell implements SunsetListener {

  private final Neighbourhood neighbourhood;
  private final Position position;
  private DieListener dieListener;

  public Cell(Neighbourhood neighbourhood, Position position) {
    this.neighbourhood = neighbourhood;
    this.position = position;
  }

  @Override
  public void processSunset() {
    this.dieListener.process(this.position);
  }

  public void addEventListener(DieListener dieListener) {
    this.dieListener = dieListener;
  }

  public Neighbourhood neighbourhood() {
    return neighbourhood;
  }

  public Position position() {
    return position;
  }

  @Override
  public boolean equals(Object obj) {
    if (obj == this) {
      return true;
    }
    if (obj == null || obj.getClass() != this.getClass()) {
      return false;
    }
    var that = (Cell) obj;
    return Objects.equals(this.neighbourhood, that.neighbourhood) &&
        Objects.equals(this.position, that.position);
  }

  @Override
  public int hashCode() {
    return Objects.hash(neighbourhood, position);
  }

  @Override
  public String toString() {
    return "Cell[" +
        "neighbourhood=" + neighbourhood + ", " +
        "position=" + position + ']';
  }

}
