package midterm.abstractdemo;

public class Dog extends Animal{
    public Dog(String name, int age, String animalType){
        super(name, age, animalType);
    }
    
    public void speak(){
        System.out.println("Woof! Woof!\n");
    }
}