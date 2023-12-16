/*public abstract class Animal {
   protected double health;
   protected double[] position;

   public Animal(double health, double[] position) {
       this.health = health;
       this.position = position;
   }

   public abstract void update();
}

public class Sheep extends Animal {
   public Sheep(double health, double[] position) {
       super(health, position);
   }

   @Override
   public void update() {
       // Обновление состояния овцы
   }
}

public class Wolf extends Animal {
   private static final double DAMAGE = 4.0;
   private static final double HEALTH = 20.0;

   public Wolf(double health, double[] position) {
       super(health, position);
   }

   public void attack(Sheep sheep) {
       double distance = calculateDistance(sheep.position);
       sheep.health -= (this.health / HEALTH) * DAMAGE / (distance * distance);
   }

   private double calculateDistance(double[] position) {
       double dx = this.position[0] - position[0];
       double dy = this.position[1] - position[1];
       double dz = this.position[2] - position[2];
       return Math.sqrt(dx * dx + dy * dy + dz * dz);
   }

   @Override
   public void update() {
       // Обновление состояния волка
   }
}
*/