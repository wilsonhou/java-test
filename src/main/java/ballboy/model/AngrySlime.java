package ballboy.model;

public class AngrySlime extends Enemy {
  private static final String IMAGE_PATH = "file:./src/main/resources/slimeRa.png";

  public AngrySlime(double xPos, double yPos, double width, double height, Level level, double xVel, double yVel) {
    super(IMAGE_PATH, xPos, yPos, width, height, Layer.FOREGROUND, level, xVel, yVel);
    this.setMovement(new Chase(this));
    this.collision = new ReverseCollision(this);
  }

}
