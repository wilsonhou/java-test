package ballboy.model;

import javafx.scene.image.Image;

public abstract class EntityImpl implements Entity {

  // Set variables based on methods
  protected Image image;
  protected double xPos;
  protected double yPos;
  protected double width;
  protected double height;
  protected Layer layer;
  protected Level level;

  public EntityImpl(String imagePath, double xPos, double yPos, double width, double height, Layer layer, Level level) {
    // Resolve image path from imagePath to image
    this.xPos = xPos;
    this.yPos = yPos;
    this.width = width;
    this.height = height;
    this.layer = layer;
    this.image = new Image(imagePath, width, height, true, true);
    this.level = level;
  }

  public EntityImpl() {
    System.out.println("EntityImpl()");
  }

  @Override
  public void tick() {
    return;
  }

  @Override
  public Image getImage() {
    return this.image;
  }

  @Override
  public double getXPos() {
    return this.xPos;
  }

  @Override
  public double getYPos() {
    return this.yPos;
  }

  @Override
  public double getHeight() {
    return this.height;
  }

  @Override
  public double getWidth() {
    return this.width;
  }

  @Override
  public Layer getLayer() {
    return this.layer;
  }

  @Override
  public Level getLevel() {
    return this.level;
  }

}
