public class Horse extends Animal {

    boolean makePrrPrr;


    public Horse(boolean food, String location, boolean makePrrPrr) {
        super(food, location);
        this.makePrrPrr = makePrrPrr;
    }

    @Override
    public void makeNoise() {
        System.out.println("Кінь видає дивні звуки які не знаю як описати");
    }

    @Override
    public void eat(boolean food) {
        this.food = food;
        if (this.food) {
            System.out.println("Кінь їсть");
        } else {
            System.out.println("Кінь не голодний");
        }
    }

}
