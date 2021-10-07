package ballboy.model;

public class GameEngineImpl implements GameEngine {

    public GameEngineImpl(String s) {
        // TODO: Implement Game Engine
    }

    /**
     * Return the currently loaded level
     *
     * @return The current level
     */
    @Override
    public Level getCurrentLevel() {
        return null;
    }

    /**
     * Start the level
     */
    @Override
    public void startLevel() {

    }

    @Override
    public boolean boostHeight() {
        return false;
    }

    @Override
    public boolean dropHeight() {
        return false;
    }

    @Override
    public boolean moveLeft() {
        return false;
    }

    @Override
    public boolean moveRight() {
        return false;
    }

    /**
     * Instruct the model to progress forward in time by one increment.
     */
    @Override
    public void tick() {

    }
}
