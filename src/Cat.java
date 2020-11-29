public class Cat extends Animal {

    boolean makePurPur;

    public Cat(String food, String location, boolean hungry, boolean makePurPur) {
        super(food, location, hungry);
        this.makePurPur = makePurPur;
    }

    @Override
    public void makeNoise() {
        System.out.println("Кіт м'явчить");
    }

    @Override
    public void eat(boolean hungry) {
        this.hungry = hungry;
        if (this.hungry) {
            System.out.println("Котик їсть");
        } else {
            System.out.println("Котик не голодний");
        }
    }
}
