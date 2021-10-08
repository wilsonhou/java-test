package ballboy.model;

public class MoveLeft implements Movement {
  private MoveableEntity entity;

  public MoveLeft(MoveableEntity entity) {
    this.entity = entity;
  }

  @Override
  public void move() {
    // move the entity left until it reaches 0
    if (entity.getXPos() > 0) {
      entity.setXPos(entity.getXPos() - entity.getXVelocity());
    }
  }
}