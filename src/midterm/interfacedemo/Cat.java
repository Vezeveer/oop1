package midterm.interfacedemo;
import midterm.abstractdemo.Animal;

public class Cat extends Animal implements AnimalInterface{
    public Cat(String name, int age, String animalType){
        super(name, age, animalType);
    }

    public void speak(){
        System.out.println("Meow!");
    }

    public void drink(String drink){
        System.out.println(super.getName() + " is drinking " + drink);
    }

    public void eat(String food){
        System.out.println(super.getName() + " is eating " + food);
    }

    public void sleep(){
        System.out.println(super.getName() + " is sleeping...");
    }

}