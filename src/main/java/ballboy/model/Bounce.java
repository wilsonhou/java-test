package ballboy.model;

public class Bounce implements Movement {

  private MoveableEntity entity;
  private Level level;
  private double maxY;
  private double floorY;

  public Bounce(MoveableEntity entity) {
    this.entity = entity;
    this.level = entity.getLevel();
    this.maxY = 200;
    this.floorY = this.level.getFloorHeight();
  }

  @Override
  public void move() {

    // Make the entity bounce up and down
    if (entity.getYPos() + entity.getYVelocity() + entity.getHeight() > this.floorY) {
      entity.setYVelocity(-entity.getYVelocity());
    } else if (entity.getYPos() + entity.getYVelocity() < this.maxY) {
      entity.setYVelocity(-entity.getYVelocity());
    }

    // update the entity's position
    entity.setYPos(entity.getYPos() + entity.getYVelocity());

  }
}
