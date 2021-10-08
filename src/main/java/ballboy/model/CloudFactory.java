package ballboy.model;

import org.json.simple.JSONObject;

public class CloudFactory implements EntityFactory {
  public Entity createEntity(JSONObject props, Level level) {
    JSONObject position = (JSONObject) props.get("position");
    double xPos = (double) position.get("x");
    double yPos = (double) position.get("y");
    double width = (double) props.get("width");
    double height = (double) props.get("height");

    return new Cloud(xPos, yPos, width, height, level);
  }
}
