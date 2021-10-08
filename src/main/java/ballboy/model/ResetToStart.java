package ballboy.model;

public class ResetToStart implements Collision {
  private Ballboy ballboy;

  public ResetToStart(Ballboy ballboy) {
    this.ballboy = ballboy;
  }

  @Override
  public void onCollision() {
    // reverse entity x velocity and y velocity
    ballboy.setXPos(ballboy.getStartingXPos());
    ballboy.setYPos(ballboy.getStartingYPos());
  }
}
