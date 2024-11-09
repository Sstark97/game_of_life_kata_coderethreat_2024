package game_of_life;

public record State(boolean value) {

  public static State alive() {
    return new State(true);
  }

  public static State dead() {
    return new State(false);
  }
}
