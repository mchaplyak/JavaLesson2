public class Animal {
    String food;
    String location;
    boolean hungry;

    public Animal() {
    }

    public Animal(String food, String location, boolean hungry) {
        this.food = food;
        this.location = location;
        this.hungry = hungry;
    }

    public void makeNoise() {
        System.out.println("Тваринка шумить");
    }

    public void eat(boolean hungry) {
        this.hungry = hungry;
        if (this.hungry) {
            System.out.println("Тваринка їсть");
        } else {
            System.out.println("Тваринка не голодна");
        }
    }

    public void sleep() {
        System.out.println("Тваринка спить");
    }

    public String getFood() {
        return food;
    }

    public String getLocation() {
        return location;
    }

    public boolean isHungry() {
        return hungry;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setHungry(boolean hungry) {
        this.hungry = hungry;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "food='" + food + '\'' +
                ", location='" + location + '\'' +
                ", hungry=" + hungry +
                '}';
    }
}
