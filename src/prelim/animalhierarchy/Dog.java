package prelim.animalhierarchy;

public class Dog extends Animal{
    public Dog(String name, int age){
        super(name, age, "dog");
    }
    
    public void speak(){
        System.out.println("Woof! Woof!\n");
    }
}