package homework5;

import java.util.Arrays;

import static java.awt.SystemColor.info;

public class Main {
    public void main(String[] args) {

        Person[] peopleArr = new Person[5];
        peopleArr[0] = new Person ("Ivanov Ivan", "Engineer", "ivani@Mail.com", "89123456789", "55000", 31);
        peopleArr[1] = new Person ("Petrov Denis", "Engineer", "petrov@Mail.com", "89123456789", "55000", 44);
        peopleArr[2] = new Person ("Bashirov Evgenii", "Engineer", "bashirov@Mail.com", "89123456789", "55000", 41);
        peopleArr[3] = new Person ("Tuchkova Anastasia", "Engineer", "Tuchan@Mail.com", "89123456789", "55000", 25);
        peopleArr[4] = new Person ("Lesnoy Andrey", "Engineer", "lesnoyA@Mail.com", "89123456789", "55000", 29);

        for (int i = 0; i < peopleArr.length; i++) {
            if (peopleArr[i].getAge () > 40) {
                System.out.println (peopleArr[i]);
            }
            ;
        }
    }
}
