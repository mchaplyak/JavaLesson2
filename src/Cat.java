public class Cat extends Animal {

    boolean makePurPur;


    public Cat(boolean food, String location, boolean makePurPur) {
        super(food, location);
        this.makePurPur = makePurPur;
    }

    @Override
    public void makeNoise() {
        System.out.println("Кіт м'явчить");
    }

    @Override
    public void eat(boolean food) {
        this.food = food;
        if (this.food) {
            System.out.println("Котик їсть");
        } else {
            System.out.println("Котик не голодний");
        }
    }
}
