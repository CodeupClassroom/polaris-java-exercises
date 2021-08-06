package polymorphism;

public class Cat extends Animal {

    @Override
    public void makeNoise() {
        System.out.println("Meow");
    }

    public void purr() {
        System.out.println("Purrrrr...");
    }
}
