package abstraction;

public class AnimalFarm {
    public static final int MAX_FARM_ANIMALS = 10;

    public static void main(String[] args) {
        Pig wilbur = new Pig();
        wilbur.walk();
        wilbur.breathe(5);
        wilbur.makeNoise();

        Chicken sue = new Chicken();
        sue.walk();
        sue.breathe(3);
        sue.makeNoise();

        Animal genericAnimal = new Pig();
        genericAnimal.makeNoise();
        genericAnimal = sue;
        genericAnimal.makeNoise();

        Animal [] animals = new Animal[MAX_FARM_ANIMALS];
        animals[0] = new Pig();
        animals[1] = new Chicken();

        for (int i = 0; i < 2; i++) {
            animals[i].makeNoise();
            // how to tell if its a pig or a chicken?
            // couple of ways
            System.out.println(animals[i].getClass().getSimpleName());

            System.out.println("Is a pig? " + (animals[i] instanceof Pig));
            System.out.println("Is a chicken? " + (animals[i] instanceof Chicken));
        }
    }
}
