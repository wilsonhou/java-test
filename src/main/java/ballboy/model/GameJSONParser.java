package ballboy.model;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.Reader;
import java.io.FileReader;
import java.io.IOException;

public class GameJSONParser {
  private String fileName;

  // Implement this class
  public GameJSONParser(String fileName) {
    this.fileName = fileName;
  }

  public JSONObject getJSON() {
    // Parse the config file of name config.json
    JSONParser parser = new JSONParser();
    try (Reader reader = new FileReader(this.fileName)) {
      Object obj = parser.parse(reader);
      JSONObject jsonObject = (JSONObject) obj;
      return jsonObject;
    } catch (IOException | ParseException e) {
      e.printStackTrace();
    }
    return null;
  }
}
