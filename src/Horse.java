public class Horse extends Animal {

    boolean makePrrPrr;


    public Horse(String food, String location, boolean hungry, boolean makePrrPrr) {
        super(food, location, hungry);
        this.makePrrPrr = makePrrPrr;
    }

    @Override
    public void makeNoise() {
        System.out.println("Кінь видає дивні звуки які не знаю як описати");
    }

    @Override
    public void eat(boolean food) {
        this.hungry = food;
        if (this.hungry) {
            System.out.println("Кінь їсть");
        } else {
            System.out.println("Кінь не голодний");
        }
    }

}
