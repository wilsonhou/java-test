package ballboy.model;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.Reader;
import java.io.FileReader;
import java.io.IOException;

public class GameEngineImpl implements GameEngine {

    // ! Just gonna have 1 for now!
    private static final int LEVEL_IDX = 0;

    private Level currentLevel;

    public GameEngineImpl(String config) {
        // Parse the config file of name config.json
        GameJSONParser gameJSONParser = new GameJSONParser(config);
        JSONObject gameJSONObject = gameJSONParser.getJSON();

        // Set Up Factory Registry
        FactoryRegistry factoryRegistry = FactoryRegistry.getInstance();

        // Set current level
        JSONArray levels = (JSONArray) gameJSONObject.get("levels");

        // * Could be adapted for multiple levels in the future!
        // Get the first level
        JSONObject level = (JSONObject) levels.get(LEVEL_IDX);

        // Get from factory registry and create level
        currentLevel = factoryRegistry.getLevelFactory(level.get("type").toString()).createLevel(level);
    }

    /**
     * Return the currently loaded level
     *
     * @return The current level
     */
    @Override
    public Level getCurrentLevel() {
        return currentLevel;
    }

    /**
     * Start the level
     */
    @Override
    public void startLevel() {
        // TODO: what... does this do?

    }

    @Override
    public boolean boostHeight() {
        new BoostHeight(currentLevel.getHero()).move();
        return false;
    }

    @Override
    public boolean dropHeight() {
        new DropHeight(currentLevel.getHero()).move();
        return false;
    }

    @Override
    public boolean moveLeft() {
        new MoveLeft(currentLevel.getHero()).move();
        return false;
    }

    @Override
    public boolean moveRight() {
        new MoveRight(currentLevel.getHero()).move();
        return false;
    }

    /**
     * Instruct the model to progress forward in time by one increment.
     */
    @Override
    public void tick() {
        currentLevel.tick();

        // check collision with CollisionChecker on every Entity in Level
        for (Entity entity : currentLevel.getEntities()) {
            for (Entity otherEntity : currentLevel.getEntities()) {
                if (entity != otherEntity)
                    if (CollisionChecker.checkCollision(entity, otherEntity))
                        if (entity instanceof MoveableEntity)
                            ((MoveableEntity) entity).collide(otherEntity);

            }
        }
    }
}
