package ballboy.model;

public class LeftToRight implements Movement {

  private MoveableEntity entity;
  private Level level;
  private double maxX;
  private double minX;

  public LeftToRight(MoveableEntity entity) {
    this.entity = entity;
    this.level = entity.getLevel();
    maxX = level.getLevelWidth() - entity.getWidth();
    minX = 0;
  }

  @Override
  public void move() {
    // Bounce left to right between minX and maxX
    if (entity.getXPos() > maxX) {
      entity.setXVelocity(-entity.getXVelocity());
    } else if (entity.getXPos() < minX) {
      entity.setXVelocity(-entity.getXVelocity());
    }

    // update position
    entity.setXPos(entity.getXPos() + entity.getXVelocity());
  }
}
