package homework6.animals;

public class Dog extends Animal {
    int distance;

    public Dog(String name, String color, int age) {
        super (name, color, age);
        count++;
    }

    @Override
    public void run(int distance) {
        if (distance > 500) System.out.println (name + " Столько не пробежит");
        else System.out.println (name + " Пробежал " + distance + " м.");
    }

    @Override
    public void swim(int distance) {
        if (distance <= 10) System.out.println (name + " Проплыл " + distance + " м.");
        else System.out.println (name + " Столько не проплывет");
    }

    public void countAnimals() {
        System.out.println ("Создано собак " + count);
    }
}

