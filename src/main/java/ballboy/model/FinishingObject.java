package ballboy.model;

public class FinishingObject extends EntityImpl {
  private final static String IMAGE_PATH = "file:./src/main/resources/foot_tile.png";

  public FinishingObject(double xPos, double yPos, double width, double height, Level level) {
    super(IMAGE_PATH, xPos, yPos, width, height, Layer.FOREGROUND, level);
  }

}
