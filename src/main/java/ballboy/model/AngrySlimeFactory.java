package ballboy.model;

import org.json.simple.JSONObject;

public class AngrySlimeFactory implements EntityFactory {

  @Override
  public Entity createEntity(JSONObject props, Level level) {
    JSONObject position = (JSONObject) props.get("position");
    double xPos = (double) position.get("x");
    double yPos = (double) position.get("y");
    double width = (double) props.get("width");
    double height = (double) props.get("height");
    JSONObject velocity = (JSONObject) props.get("velocity");
    double xVel = (double) velocity.get("x");
    double yVel = (double) velocity.get("y");

    return new AngrySlime(xPos, yPos, width, height, level, xVel, yVel);
  }

}