package ballboy.model;

public abstract class MoveableEntity extends EntityImpl {
  protected Movement movement;
  protected Collision collision;

  protected double prevX;
  protected double prevY;
  protected double xVelocity;
  protected double yVelocity;

  public MoveableEntity(String imagePath, double xPos, double yPos, double width, double height, Layer layer,
      Level level) {
    super(imagePath, xPos, yPos, width, height, layer, level);

    // Set Defaults
    this.movement = new LeftToRight(this);
    this.xVelocity = 0.0;
    this.yVelocity = 0.0;

    this.collision = new ReverseCollision(this);

  }

  @Override
  public void tick() {
    // TODO: implement momento pattern here!
    // store previous position
    prevX = this.xPos;
    prevY = this.yPos;

    movement.move();
  }

  public void collide(Entity other) {
    collision.onCollision();
  }

  public void setMovement(Movement movement) {
    this.movement = movement;
  }

  public void setXVelocity(double xVelocity) {
    this.xVelocity = xVelocity;
  }

  public void setYVelocity(double yVelocity) {
    this.yVelocity = yVelocity;
  }

  public double getXVelocity() {
    return xVelocity;
  }

  public double getYVelocity() {
    return yVelocity;
  }

  public Movement getMovement() {
    return movement;
  }

  /**
   * Sets the current x position of this Entity
   * 
   * @param xPos
   * @return
   */
  double setXPos(double xPos) {
    this.xPos = xPos;
    return xPos;
  }

  /**
   * Sets the current x position of this Entity
   * 
   * @param xPos
   * @return
   */
  double setYPos(double yPos) {
    this.yPos = yPos;
    return yPos;
  }

  double getPrevX() {
    return prevX;
  }

  double getPrevY() {
    return prevY;
  }
}
