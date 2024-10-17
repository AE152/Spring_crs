package spring_introduction;

public class Cat implements Pet{
    public Cat() {
        System.out.println("Cat constructor");
    }

    @Override
    public void say() {
        System.out.println("Meow-meow");
    }
}
