package ballboy.model;

public abstract class ControllableEntity extends MoveableEntity {

  public ControllableEntity(String imagePath, double xPos, double yPos, double width, double height, Layer layer,
      Level level) {
    super(imagePath, xPos, yPos, width, height, layer, level);

    // Implement Controls
  }

}
