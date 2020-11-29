public class Main {
    public static void main(String[] args) {

        Animal[] animals = new Animal[3];
        animals[0] = new Cat("Корм", "Львів", false, true);
        animals[1] = new Dog("Корм", "Харків", false, true);
        animals[2] = new Horse("Сіно", "Київ", false, true);
        int n = 1;

        Veterinary veterinarySergeyPetrovich = new Veterinary();

        for (Animal animal : animals) {
            System.out.println("Тваринка №" + n);
            veterinarySergeyPetrovich.treatAnimal(animal.food, animal.location);
            n++;
        }

    }



}
