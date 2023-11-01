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