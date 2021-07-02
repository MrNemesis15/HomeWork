package homework5;
//        Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст.
//                Конструктор класса должен заполнять эти поля при создании объекта.
public class Person {
    private String Name;
    private String post;
    private String email;
    private String phoneNumber;
    private String pay;
    private int age;

    public Person(String name, String post, String email, String phoneNumber, String pay, int age) {
        Name = name;
        this.post = post;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.pay = pay;
        this.age = age;
    }

    //        Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль.
    public void info() {
        System.out.printf ("Person %s %s %s %s %s %d \n",Name, post, email,phoneNumber, pay,age);
    }

    public String getName() {
        return Name;
    }

    public String getPost() {
        return post;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getPay() {
        return pay;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "Name='" + Name + '\'' +
                ", post='" + post + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", pay='" + pay + '\'' +
                ", age=" + age +
                '}';
    }
    //        С помощью цикла вывести информацию только о сотрудниках старше 40 лет.
}
//    Person[] peopleArray = new Person[5];
//
//    peopleArray[0] = new Person ("Ivanov Ivan", "Engineer", "ivani@Mail.com", "89123456789", "55000", "31");
//            peopleArray[1] = new Person ("Petrov Denis", "Engineer", "petrov@Mail.com", "89123456789", "55000", "39");
//            peopleArray[2] = new Person ("Bashirov Evgenii", "Engineer", "bashirov@Mail.com", "89123456789", "55000", "41");
//            peopleArray[3] = new Person ("Tuchkova Anastasia", "Engineer", "Tuchan@Mail.com", "89123456789", "55000", "25");
//            peopleArray[4] = new Person ("Lesnoy Andrey", "Engineer", "lesnoyA@Mail.com", "89123456789", "55000", "29");
//
//
//
//
////        System.out.println (Arrays.toString (peopleArray));
////        for (int i = 0; i < peopleArray.length; i++) {
////            if (peopleArray[i].age.equals (40)) {
////                System.out.println (peopleArray[i]);
////            }
////        }
//            }
