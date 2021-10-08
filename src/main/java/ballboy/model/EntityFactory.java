package ballboy.model;

import org.json.simple.JSONObject;

public interface EntityFactory {
  Entity createEntity(JSONObject props, Level level);
}
