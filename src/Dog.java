public class Dog extends Animal {

    boolean makeWafWaf;


    public Dog(boolean food, String location, boolean makeWafWaf) {
        super(food, location);
        this.makeWafWaf = makeWafWaf;
    }

    @Override
    public void makeNoise() {
        System.out.println("Пес гавкає");
    }

    @Override
    public void eat(boolean food) {
        this.food = food;
        if (this.food) {
            System.out.println("Пес їсть");
        } else {
            System.out.println("Пес не голодний");
        }
    }



}
