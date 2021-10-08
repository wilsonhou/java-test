package ballboy.model;

public class CollisionChecker {
  public static boolean checkCollision(Entity entity1, Entity entity2) {
    return entity1.getXPos() < entity2.getXPos() + entity2.getWidth()
        && entity1.getXPos() + entity1.getWidth() > entity2.getXPos()
        && entity1.getYPos() < entity2.getYPos() + entity2.getHeight()
        && entity1.getYPos() + entity1.getHeight() > entity2.getYPos() && entity1.getLayer().equals(entity2.getLayer());
  }
}
