package Homework2_Part2_Task3;

public class Cat {
    private int age;

    public Cat(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;

}
    public void setAge(int age) {
        this.age = age;
}

    public static void main(String[] args) {
        Cat myCat = new Cat(5);

        System.out.println("Моей кошке: " + myCat.getAge() + " лет.");
    }
}