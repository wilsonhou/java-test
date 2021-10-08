package ballboy.model;

public class Drift implements Movement {

  private MoveableEntity entity;
  private Level level;

  public Drift(MoveableEntity entity) {
    this.entity = entity;
    this.level = entity.getLevel();
  }

  @Override
  public void move() {
    // Move right until it hits the wall then reset to the leftmost position
    if (entity.getXPos() > level.getLevelWidth()) {
      entity.setXPos(0);
    } else {
      // move entity right
      entity.setXPos(entity.getXPos() + 1);
    }
  }

}
