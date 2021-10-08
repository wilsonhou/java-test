package ballboy.model;

import java.util.List;
import java.util.ArrayList;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class LevelOne implements Level {

  private static final String LEVEL_NAME = "Level One";
  private static final String LEVEL_IMAGE_PATH = "images/level_one.png";

  List<Entity> entities;
  private Ballboy ballboy;

  private double floorHeight;
  private double levelHeight;
  private double levelWidth;

  public LevelOne(JSONObject props) {
    // Set up level properties
    this.entities = new ArrayList<Entity>();
    this.levelHeight = (double) props.get("height");
    this.levelWidth = (double) props.get("width");
    this.floorHeight = (double) ((JSONObject) props.get("floor")).get("height");

    // Get FactoryRegistry Singleton
    FactoryRegistry factoryRegistry = FactoryRegistry.getInstance();

    // Get entities
    JSONArray entitiesInfo = (JSONArray) props.get("entities");

    // For each entity in the level, create using Factory Method
    for (Object entityInfo : entitiesInfo) {
      JSONObject entityProps = (JSONObject) entityInfo;
      String entityType = (String) entityProps.get("type");

      Entity entity = factoryRegistry.getEntityFactory(entityType).createEntity(entityProps, this);

      // ? should ballboy still be in entities? Maybe
      if (entityType.equals("ballboy")) {
        // Set Ballboy
        this.ballboy = (Ballboy) entity;
      }
      // Add entity to level
      entities.add(entity);
    }
  }

  @Override
  public List<Entity> getEntities() {
    return this.entities;
  }

  @Override
  public double getLevelHeight() {
    return this.levelHeight;
  }

  @Override
  public double getLevelWidth() {
    return this.levelWidth;
  }

  @Override
  public void tick() {
    // TODO update and draw screen!
    for (Entity entity : entities) {
      entity.tick();
    }
  }

  @Override
  public double getFloorHeight() {
    return this.levelHeight - this.floorHeight;
  }

  @Override
  public Ballboy getHero() {
    return this.ballboy;
  }

  @Override
  public double getHeroX() {
    // return hero's x position
    // ballboy.getX()
    return ballboy.getXPos();
  }

  @Override
  public double getHeroY() {
    // return hero's y position
    return ballboy.getYPos();
  }

  @Override
  public boolean boostHeight() {
    // TODO Auto-generated method stub
    return false;
  }

  @Override
  public boolean dropHeight() {
    // TODO Auto-generated method stub
    return false;
  }

  @Override
  public boolean moveLeft() {
    // TODO Auto-generated method stub
    return false;
  }

  @Override
  public boolean moveRight() {
    // TODO Auto-generated method stub
    return false;
  }

  @Override
  public Entity addEntity(Entity entity) {
    return this.entities.add(entity) ? entity : null;
  }

  @Override
  public Entity removeEntity(Entity entity) {
    return this.entities.remove(entity) ? entity : null;
  }

}
