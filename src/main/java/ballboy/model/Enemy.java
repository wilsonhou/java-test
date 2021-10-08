package ballboy.model;

import javafx.scene.image.Image;

public abstract class Enemy extends MoveableEntity {

  public Enemy(String imagePath, double xPos, double yPos, double width, double height, Layer layer, Level level,
      double xVel, double yVel) {
    super(imagePath, xPos, yPos, width, height, layer, level);
    this.xVelocity = xVel;
    this.yVelocity = yVel;
  }
}
