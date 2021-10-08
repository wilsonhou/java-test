package ballboy.model;

import org.json.simple.JSONObject;

public interface LevelFactory {
  Level createLevel(JSONObject props);
}
