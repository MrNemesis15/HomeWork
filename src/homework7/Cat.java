package homework7;

public class Cat {
    private String name;
    private int appetit;
    public boolean satiety;

    public Cat(String name) {
        this.name = name;
        this.appetit = 10;
    }

    public Cat(String name, int appetit) {
        this.name = name;
        this.appetit = appetit;
    }
    //    public int getHungerScore() {
//        return hungerScore;
//    }

//    public void setHungerScore(int hungerScore) {
//        this.hungerScore = hungerScore;
//    }
//
//    public int getHunger() {
//        return hunger;
//    }
//    public boolean catsHunger(Plate plate){
//        if (plate.getFood ()- hungerScore >=0){
//            System.out.println (hunger+hungerScore);
//        }
//        return true;

    public boolean eat(Plate plate) {
        if (plate.decrease (appetit)) {
            System.out.println (name + " eat...");
            satiety = true;
            return true;
        } else {
            System.out.println (name + " can`t eat...");
            return false;
        }

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAppetit() {
        return appetit;
    }

    public void setAppetit(int appetit) {
        this.appetit = appetit;
    }

    public boolean isSatiety() {
        return satiety;
    }

    public void setSatiety(boolean satiety) {
        this.satiety = satiety;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", appetit=" + appetit +
                ", satiety=" + satiety +
                '}';
    }
}
