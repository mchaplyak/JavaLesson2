public class Dog extends Animal {

    boolean makeWafWaf;


    public Dog(String food, String location, boolean hungry, boolean makeWafWaf) {
        super(food, location, hungry);
        this.makeWafWaf = makeWafWaf;
    }

    @Override
    public void makeNoise() {
        System.out.println("Пес гавкає");
    }

    @Override
    public void eat(boolean food) {
        this.hungry = food;
        if (this.hungry) {
            System.out.println("Пес їсть");
        } else {
            System.out.println("Пес не голодний");
        }
    }



}
