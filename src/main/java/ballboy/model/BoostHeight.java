package ballboy.model;

public class BoostHeight implements Movement {
  private MoveableEntity entity;

  public BoostHeight(MoveableEntity entity) {
    this.entity = entity;
  }

  @Override
  public void move() {
    if (entity.getYVelocity() < 0)
      // increase height by decreasing yPos
      entity.setYPos(entity.getYPos() - Math.abs(entity.getYVelocity() * 2));
  }
}
