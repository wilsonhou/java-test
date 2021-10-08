package ballboy.model;

public class ReverseCollision implements Collision {

  private MoveableEntity entity;

  public ReverseCollision(MoveableEntity entity) {
    this.entity = entity;
  }

  @Override
  public void onCollision() {
    // reverse entity y velocity
    entity.setYVelocity(-entity.getYVelocity());

    // reset to previous position
    entity.setYPos(entity.getPrevY());
    entity.setXPos(entity.getPrevX());

  }

}
