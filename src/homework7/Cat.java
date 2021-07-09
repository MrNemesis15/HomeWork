package homework7;

public class Cat {
    private String name;
    int hungerScore;
    private int hunger;

    public Cat(String name, int hungerScore) {
        this.name = name;
        this.hungerScore = hungerScore;
        this.hunger = 0;
    }

    public int getHungerScore() {
        return hungerScore;
    }

    public void setHungerScore(int hungerScore) {
        this.hungerScore = hungerScore;
    }

    public int getHunger() {
        return hunger;
    }
    public boolean catsHunger(Plate plate){
        if (plate.getFood ()- hungerScore >=0){
            System.out.println (hunger+hungerScore);
        }
        return true;
    }
    void eat(Plate plate) {
        System.out.println (name + " eat...");
        plate.decrease (hungerScore);
    }
}
