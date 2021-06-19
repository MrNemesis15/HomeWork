package homework;
//Домашнее задание

public class MainClass {
    public static void main(String[] args) {

        //Создать пустой проект в IntelliJ IDEA, создать класс HomeWorkApp, и прописать в нем метод main().
// Класс создан далнейшее задани буду выполнять в данном классе.
        printThreeWords ();
        checkSumSign ();
        printColor ();
        compareNumbers ();

    }

    //Создайте метод printThreeWords(), который при вызове должен отпечатать в столбец три слова: Orange, Banana, Apple.
//Orange
//Banana
//Apple

    public static void printThreeWords() {
        System.out.println ("Orange");
        System.out.println ("Banana");
        System.out.println ("Apple");
    }

    //Создайте метод checkSumSign(), в теле которого объявите две int переменные a и b, и инициализируйте их любыми значениями, которыми захотите.
//Далее метод должен просуммировать эти переменные, и если их сумма больше или равна 0, то вывести в консоль сообщение “Сумма положительная”,
//в противном случае - “Сумма отрицательная”;
    public static void checkSumSign() {
        int a = -10;
        int b = 5;
        int c = a + b;
        System.out.println (c);
        if (c >= 0) System.out.println ("Сумма положительная");
        if (c <= 0) System.out.println ("Сумма отрицательная");
    }

    //Создайте метод printColor() в теле которого задайте int переменную value и инициализируйте ее любым значением.
//Если value меньше 0 (0 включительно), то в консоль метод должен вывести сообщение “Красный”,
//если лежит в пределах от 0 (0 исключительно) до 100 (100 включительно), то “Желтый”, если больше 100 (100 исключительно) - “Зеленый”;
    public static void printColor() {
        int value = (int) (Math.random () * 200 - 50);
        if (value <= 0) System.out.println ("Красный");
        if (value > 0 && value <= 100) System.out.println ("Желтый");
        else if (value >= 100) System.out.println ("Зеленый");
    }
    //Создайте метод compareNumbers(), в теле которого объявите две int переменные a и b, и инициализируйте их любыми значениями, которыми захотите.
    // Если a больше или равно b, то необходимо вывести в консоль сообщение “a >= b”, в противном случае “a < b”;

    public static void compareNumbers() {
        int a = 7;
        int b = 13;
        if (a >= b) System.out.println ("a >= b");
        if (a <= b) System.out.println ("a < b");
    }
}
//Методы из пунктов 2-5 вызовите из метода main() и посмотрите корректно ли они работают.
// Все методы вызываються из класса мейн.

