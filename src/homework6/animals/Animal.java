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

    public abstract void run(int distance);

    public abstract void swim(int distance);
}
