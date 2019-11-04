package lab6.AnimalRescue;

public class Cat extends Animal {
    @Override
    public void sleep() {
        System.out.println("Zzzz");

    }

    @Override
    public void eat() {
        System.out.println("Whiskas");

    }

    @Override
    public void speak() {
        System.out.println("Meow");

    }

    @Override
    public void walk() {
        System.out.println("Without noise");

    }

    @Override
    public void play() {
        System.out.println("With a  mouse");

    }
}
