package spring_introduction;

public class Dog implements Pet{
    public Dog() {
        System.out.println("Dog Constructor");
    }

    @Override
    public void say(){
        System.out.println("Bow-Wow");
    }
}