package polymorphism;

public class AnimalFarm {
    public static final int MAX_FARM_ANIMALS = 10;

    public static void main(String[] args) {
        /*
        Polymorphic behavior: 1 Animal variable
        is able to act like different Animal subclasses:
        i.e., bleat like a Goat, meow like a Cat, oink like a Pig
         */
        Animal genericAnimal = new Animal();
        genericAnimal.makeNoise();

        genericAnimal = new Goat();
        //genericAnimal.makeLotsOfNoise(10);
        Goat aGoat = new Goat();
        aGoat.makeLotsOfNoise(10);

        genericAnimal = new Pig();
        genericAnimal.makeNoise();

        genericAnimal = new Cat();
        genericAnimal.makeNoise();

        Cat tabby = new Cat();
        tabby.purr();


    }
}
