package spring_introduction;

public class Person {
    Pet pet;

    public Person() {
        System.out.println("Person constructor");
    }

    public Person (Pet pet){
        this.pet = pet;
    }

    public void setPet(Pet pet){
        System.out.println("Class person set pet");
        this.pet = pet;
    }

    public void callYourPet(){
        System.out.println("Hello my pet!");
        pet.say();
    }
}
