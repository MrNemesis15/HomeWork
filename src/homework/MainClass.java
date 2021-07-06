package homework;
//Домашнее задание

import homework5.Person;

import java.util.Arrays;
import static homework.HomeWork1.*;
import static homework.HomeWork2.*;
import static homework.HomeWork3.*;


public class MainClass {
    public static void main(String[] args) {

        //Создать пустой проект в IntelliJ IDEA, создать класс HomeWorkApp, и прописать в нем метод main().
// Класс создан далнейшее задани буду выполнять в данном классе.
//        printThreeWords ();
//        checkSumSign ();
//        printColor ();
//        compareNumbers ();
//        System.out.println (twoNumbers (10, 7));
//        valueNumber (-10);
//        System.out.println (isNegative (10));
//        printWordMulti ("Hello",2);
//        System.out.println (isYear (2012));
//        fillArray ();
//        invertArray ();
//        changeArray ();
//        fillDiagonal ();
//        oneArr (5, 3);
//        minMaxArr ();
//        checkBalance (new int[]{1, 4, 7, 2, 5, 3, 2, 7, 5, 3, 1, 8});
//        shiftArr (new int[]{1, 2, 3, 4, 5, 6}, 2);
//
        Person[] peopleArr = new Person[5];
        peopleArr[0] = new Person ("Ivanov Ivan", "Engineer", "ivani@Mail.com", "89123456789", "55000", 31);
        peopleArr[1] = new Person ("Petrov Denis", "Engineer", "petrov@Mail.com", "89123456789", "97000", 44);
        peopleArr[2] = new Person ("Bashirov Evgenii", "Engineer", "bashirov@Mail.com", "89123456789", "88000", 41);
        peopleArr[3] = new Person ("Tuchkova Anastasia", "Engineer", "Tuchan@Mail.com", "89123456789", "57000", 25);
        peopleArr[4] = new Person ("Lesnoy Andrey", "Engineer", "lesnoyA@Mail.com", "89123456789", "69000", 29);

//        System.out.println (Arrays.toString (peopleArr));
        for (int i = 0; i < peopleArr.length; i++) {
            if (peopleArr[i].getAge ()>40){
                System.out.println (peopleArr[i]);
            };
            
        }
    }

}










