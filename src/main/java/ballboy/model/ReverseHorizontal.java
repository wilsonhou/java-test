package ballboy.model;

public class ReverseHorizontal implements Collision {

  private MoveableEntity entity;

  public ReverseHorizontal(MoveableEntity entity) {
    this.entity = entity;
  }

  @Override
  public void onCollision() {
    // reverse entity x velocity
    entity.setXVelocity(-entity.getXVelocity());

    // restore entity to previous position
    // entity.setXPos(entity.getPrevX());
    // entity.setYPos(entity.getPrevY());
  }
}
