package ballboy.model;

import org.json.simple.JSONObject;

public class BallboyFactory implements EntityFactory {

  @Override
  public Entity createEntity(JSONObject props, Level level) {
    JSONObject position = (JSONObject) props.get("position");
    double xPos = (double) position.get("x");
    double yPos = (double) position.get("y");
    JSONObject velocity = (JSONObject) props.get("velocity");
    double xVel = (double) velocity.get("x");
    double yVel = (double) velocity.get("y");
    String size = (String) props.get("size");

    return new Ballboy(xPos, yPos, size, level, xVel, yVel);
  }

}
