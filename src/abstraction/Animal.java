package abstraction;

public abstract class Animal {

    public abstract void makeNoise();

    public final void breathe(int numSeconds) {
        System.out.println("Breathes for " + numSeconds + " seconds");
    }

    public void walk() {
        System.out.println("walks a bit");
    }
}
