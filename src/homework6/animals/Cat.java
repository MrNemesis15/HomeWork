package homework6.animals;

public class Cat extends Animal {
    int distance;

    public Cat(String name, String color, int age) {
        super (name, color, age);
        count++;
    }

    @Override
    public void run(int distance) {
        if (distance > 200) System.out.println (name + " Столько не пробежит");
        else System.out.println (name + " Пробежал " + distance + " м.");
    }

    @Override
    public void swim(int distance) {
        if (distance > 0)
            System.out.println (name + " Не умеет плавать");
    }
    public void countAnimals(){
        System.out.println ("Создано котов "+ count);
    }
}

