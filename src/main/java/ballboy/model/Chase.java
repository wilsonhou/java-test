package ballboy.model;

public class Chase implements Movement {

  private MoveableEntity entity;
  private Level level;

  public Chase(MoveableEntity entity) {
    this.entity = entity;
    this.level = entity.getLevel();
  }

  @Override
  public void move() {
    // get player position x, y
    double playerX = level.getHeroX();
    double playerY = level.getHeroY();

    // get entity position x, y
    double entityX = entity.getXPos();
    double entityY = entity.getYPos();

    // if player is to the right of the entity, set velocity to positive
    if (playerX > entityX) {
      entity.setXVelocity(Math.abs(entity.getXVelocity()));
    }

    // if player is to the left of the entity, set velocity to negative
    if (playerX < entityX) {
      entity.setXVelocity(-Math.abs(entity.getXVelocity()));
    }

    // update x position of entity
    entity.setXPos(entity.getXPos() + entity.getXVelocity());
  }
}
