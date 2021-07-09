package homework6;

import homework6.animals.*;

import java.lang.String;
//Создать классы Собака и Кот с наследованием от класса Животное.
//        Все животные могут бежать и плыть. В качестве параметра каждому методу передается длина препятствия. Результатом выполнения действия будет печать в консоль.
//        (Например, dogBobik.run(150); -> 'Бобик пробежал 150 м.');
//        У каждого животного есть ограничения на действия (бег: кот 200 м., собака 500 м.; плавание: кот не умеет плавать, собака 10 м.).
//        * Добавить подсчет созданных котов, собак и животных.

public class Main {
    public static void main(String[] args) {
//Cat cat = new Cat ("Barsik","red",5);
//cat.run (170);
//cat.swim (200);
//cat.countAnimals ();
//
//Dog dog = new Dog ("Barbos", "blac",6);
//dog.run (200);
//dog.swim (10);
//dog.countAnimals ();
//
//    }
        Animal[] animals = {
                new Cat ("Barsik"),
                new Dog ("Tuzik"),
                new Cat ("Tiger", 1000, 100),
                new Dog ("Hunter", 2000, 300)
        };
        for (int i = 0; i < animals.length; i++) {
            animals[i].run (50);
            animals[i].swim (5);
        }
        System.out.println (Animal.getCount ());
        System.out.println (Cat.getCount ());
        System.out.println (Dog.getCount ());

    }
}
