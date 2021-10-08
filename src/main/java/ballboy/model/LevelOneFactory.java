package ballboy.model;

import org.json.simple.JSONObject;

public class LevelOneFactory implements LevelFactory {

  @Override
  public Level createLevel(JSONObject props) {
    // Defer initialization of the level until it is needed.
    Level level = new LevelOne(props);
    return level;
  }

}
