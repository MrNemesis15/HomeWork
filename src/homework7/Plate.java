package homework7;

public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public int getFood() {
        return food;
    }

    public void decrease(int amount) {
        food -= amount;
    }

    boolean checkFood(int amount) {
        return (food - amount) >= 0;
    }

    @Override
    public String toString() {
        return "Plate{" +
                "food=" + food +
                '}';
    }
}