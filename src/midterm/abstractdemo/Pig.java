package midterm.abstractdemo;

public class Pig extends Animal{
    public Pig(String name, int age, String animalType){
        super(name, age, animalType);
    }

    public void speak(){
        System.out.println("Oink! Oink!\n");
    }
}