package ballboy.model;

public class StaticEntity extends EntityImpl {
  private final static String IMAGE_PATH = "file:./src/main/resources/tree.png";

  public StaticEntity(double xPos, double yPos, double width, double height, Level level) {
    super(IMAGE_PATH, xPos, yPos, width, height, Layer.FOREGROUND, level);
  }

}
