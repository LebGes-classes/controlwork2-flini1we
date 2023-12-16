package com.Example;
import java.util.Scanner;

public abstract class Animal {
    double health;
    private double[] position;

    public Animal(double health, double[] position) {
        this.health = health;
        this.position = position;
    }

    public double getHealth() {
        return health;
    }

    public void setHealth(double health) {
        this.health = health;
    }

    public double[] getPosition() {
        return position;
    }

    public void setPosition(double[] position) {
        this.position = position;
    }

}


