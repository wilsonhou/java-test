package ballboy.model;

public class MoveRight implements Movement {
  private MoveableEntity entity;
  private Level level;

  public MoveRight(MoveableEntity entity) {
    this.entity = entity;
    this.level = entity.getLevel();
  }

  @Override
  public void move() {
    // move the entity right
    if (entity.getXPos() + entity.getWidth() < level.getLevelWidth()) {
      entity.setXPos(entity.getXPos() + entity.getXVelocity());
    }
  }
}
