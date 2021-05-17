package prelim.animalhierarchy;

public class Cat extends Animal{
    public Cat(String name, int age){
        super(name, age, "cat");
    }

    public void speak(){
        System.out.println("Meow!\n");
    }
}