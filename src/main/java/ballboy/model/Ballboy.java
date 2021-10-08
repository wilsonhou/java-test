package ballboy.model;

import java.util.HashMap;
import java.util.Map;

public class Ballboy extends MoveableEntity {
  // Config Variables
  private static final String IMAGE_PATH = "file:./src/main/resources/ch_stand1.png";
  private static final Map<String, Map<String, Double>> SIZES = new HashMap<String, Map<String, Double>>() {
    {
      put("small", new HashMap<String, Double>() {
        {
          put("width", 20.0);
          put("height", 20.0);
        }
      });
      put("medium", new HashMap<String, Double>() {
        {
          put("width", 30.0);
          put("height", 30.0);
        }
      });
      put("large", new HashMap<String, Double>() {
        {
          put("width", 40.0);
          put("height", 40.0);
        }
      });
    }
  };
  private Collision resetToStart;

  private double startingXPos;
  private double startingYPos;

  public Ballboy(double xPos, double yPos, String size, Level level, double xVel, double yVel) {
    super(IMAGE_PATH, xPos, yPos, SIZES.get(size).get("width"), SIZES.get(size).get("height"), Layer.FOREGROUND, level);

    this.setMovement(new Bounce(this));
    this.setYVelocity(yVel);
    this.setXVelocity(xVel);
    this.startingXPos = xPos;
    this.startingYPos = yPos;
    resetToStart = new ResetToStart(this);
  }

  public double getStartingXPos() {
    return startingXPos;
  }

  public double getStartingYPos() {
    return startingYPos;
  }

  @Override
  public void collide(Entity entity) {
    if (entity instanceof Enemy) {
      System.out.println("Collision with enemy");
      resetToStart.onCollision();
    } else if (entity instanceof FinishingObject) {
      System.out.println("YOU WIN!");
      resetToStart.onCollision();
    } else {
      System.out.println("Collision with RANDOM");
      collision.onCollision();
    }
  }
}
