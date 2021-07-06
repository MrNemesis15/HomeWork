package homework6.animals;

public abstract class Animal {
    String name;
    String color;
    int age;


    public Animal(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }
    int count = 0;

    public abstract void run(int distance);

    public abstract void swim(int distance);

    public void countAnimals() {
        System.out.println (count);
    }
}
