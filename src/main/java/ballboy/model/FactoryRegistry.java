package ballboy.model;

import java.util.Map;
import java.util.HashMap;

public class FactoryRegistry {

  // Implement Singleton pattern
  private static FactoryRegistry instance = new FactoryRegistry();

  public static FactoryRegistry getInstance() {
    if (instance == null) {
      instance = new FactoryRegistry();
    }
    return instance;
  }

  private FactoryRegistry() {
    entityFactories = new HashMap<String, EntityFactory>();
    levelFactories = new HashMap<String, LevelFactory>();

    // Register Factories
    this.registerLevelFactory("one", new LevelOneFactory());
    this.registerEntityFactory("ballboy", new BallboyFactory());
    this.registerEntityFactory("slime", new SlimeFactory());
    this.registerEntityFactory("angrySlime", new AngrySlimeFactory());
    this.registerEntityFactory("staticEntity", new StaticEntityFactory());
    this.registerEntityFactory("finishingObject", new FinishingObjectFactory());
    this.registerEntityFactory("cloud", new CloudFactory());

  }

  private Map<String, EntityFactory> entityFactories;
  private Map<String, LevelFactory> levelFactories;

  public void registerEntityFactory(String name, EntityFactory factory) {
    entityFactories.put(name, factory);
  }

  public void registerLevelFactory(String name, LevelFactory factory) {
    levelFactories.put(name, factory);
  }

  public EntityFactory getEntityFactory(String name) {
    return entityFactories.get(name);
  }

  public LevelFactory getLevelFactory(String name) {
    return levelFactories.get(name);
  }

}