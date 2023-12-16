package com.Example;
import java.util.Scanner;

public class Main {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        int counter = 0;
        System.out.println("Введите здоровье и позицию волка ВНИМАНИЕ Здоровье объекта ВОЛК <= 20.0:");
        double wolfHealth = scan.nextDouble();
        if(wolfHealth > 20){
            System.out.println("Зачем ты так( ");
            //не успел закинуть в while и инициализиорвать флаг
        }
        double[] wolfPosition = new double[3];
        for (int i = 0; i < 3; i++) {
            wolfPosition[i] = scan.nextDouble();
        }
        System.out.println("Введите здоровье и позицию овцы ВНИМАНИЕ Здоровье объекта ОВЦА <= 8.0:");
        double sheepHealth = scan.nextDouble();
        double[] sheepPosition = new double[3];
        for (int i = 0; i < 3; i++) {
            sheepPosition[i] = scan.nextDouble();
        }


        Sheep sheep = new Sheep(sheepHealth, sheepPosition);
        Wolf wolf = new Wolf(wolfHealth, wolfPosition);

        do{
            wolf.attack(sheep);
            counter ++ ;
        }while (sheep.getHealth() > 0);



        if (sheep.getHealth() <= 0) {
            System.out.println("Овца была убита волком. На это потребовалось " + counter + " секнд.");
        } else {
            System.out.println("Овца все еще жива после атаки волка.");
        }


    }
}


