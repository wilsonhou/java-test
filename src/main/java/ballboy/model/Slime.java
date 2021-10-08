package ballboy.model;

public class Slime extends Enemy {
  private static final String IMAGE_PATH = "file:./src/main/resources/slimeBa.png";

  public Slime(double xPos, double yPos, double width, double height, Level level, double xVel, double yVel) {
    super(IMAGE_PATH, xPos, yPos, width, height, Layer.FOREGROUND, level, xVel, yVel);
    this.setMovement(new LeftToRight(this));
    this.collision = new ReverseHorizontal(this);
  }

}
