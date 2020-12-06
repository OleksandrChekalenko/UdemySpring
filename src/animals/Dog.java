package animals;

public class Dog implements Pet {

    public Dog() {
        System.out.println("Dog Bean is created.");
    }

    @Override
    public void say() {
        System.out.println("Bou - Wou");
    }

    public void init() {
        System.out.println("Class Dog: init method");
    }

    public void destroy() {
        System.out.println("Class Dog: destroy method");
    }
}
