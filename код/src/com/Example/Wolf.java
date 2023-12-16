package com.Example;
import java.util.Scanner;
public class Wolf extends Animal {
    static Scanner scan = new Scanner(System.in);

    public Wolf(double health, double[] position) {
        super(health, position); //копируем реализацию анимал
    }

    private static final double DAMAGE = 4.0;
    private static final double HEALTH = 20.0;

    public void attack(Sheep sheep) {
        double distance = calculateDistance(sheep.getPosition());
        sheep.health -= (this.health / HEALTH) * DAMAGE / (distance * distance);
    }

    private double calculateDistance(double[] position) {
        double x = this.getPosition()[0] - position[0];
        double y = this.getPosition()[1] - position[1];
        double z = this.getPosition()[2] - position[2];
        return Math.sqrt(x * x + y * y + z * z);
    }

}
