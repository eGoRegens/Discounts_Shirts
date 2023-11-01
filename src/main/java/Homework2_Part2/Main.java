package Homework2_Part2;

abstract class Animal {
    public abstract void move();
}
class Cat extends Animal {
    @Override
    public void move() {
        System.out.println("Я побежал");
    }
}

class Fish extends Animal {
    @Override
    public void move() {
        System.out.println("Я поплыла");
    }
}

class Duck extends Animal {
    @Override
    public void move() {
        System.out.println("Я полетела");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal cat = new Cat();
        Animal fish = new Fish();
        Animal duck = new Duck();

        cat.move();
        fish.move();
        duck.move();
    }
}