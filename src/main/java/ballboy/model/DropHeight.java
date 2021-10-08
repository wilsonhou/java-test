package ballboy.model;

public class DropHeight implements Movement {
  private MoveableEntity entity;

  public DropHeight(MoveableEntity entity) {
    this.entity = entity;
  }

  @Override
  public void move() {
    // if velocity is negative, subtract twice velocity from y
    if (entity.getYVelocity() > 0)
      entity.setYPos(entity.getYPos() + Math.abs(entity.getYVelocity() * 2));
  }
}
