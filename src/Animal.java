public class Animal {
    boolean food;
    String location;

    public Animal() {
    }

    public Animal(boolean food, String location) {
        this.food = food;
        this.location = location;
    }

    public void makeNoise() {
        System.out.println("Тваринка шумить");
    }

    public void eat(boolean food) {
        this.food = food;
        if (this.food) {
            System.out.println("Тваринка їсть");
        } else {
            System.out.println("Тваринка не голодна");
        }
    }

    public void sleep() {
        System.out.println("Тваринка спить");
    }

    public boolean getFood() {
        return food;
    }

    public void setFood(boolean food) {
        this.food = food;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "food='" + food + '\'' +
                ", location='" + location + '\'' +
                '}';
    }
}
