package ballboy.model;

public class Cloud extends MoveableEntity {
  private final static String IMAGE_PATH = "file:./src/main/resources/cloud_1.png";

  public Cloud(double xPos, double yPos, double width, double height, Level level) {
    super(IMAGE_PATH, xPos, yPos, width, height, Layer.BACKGROUND, level);
    this.setMovement(new Drift(this));
  }

  @Override
  public void collide(Entity entity) {
    // Do nothing
    return;
  }

}
