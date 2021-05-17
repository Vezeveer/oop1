package midterm.interfacedemotest;
import midterm.interfacedemo.Dog;
import midterm.abstractdemo.Animal;
import midterm.interfacedemo.Cat;

public class Test {
    public static void main(String[] argz){
        Cat garfield = new Cat("Garfield", 3, "cat");
        Dog daisy = new Dog("Daisy", 6, "dog");

        System.out.println(daisy.toString());
        daisy.speak();
        daisy.eat("chicken bones");
        daisy.drink("water");
        daisy.sleep();

        System.out.print("\n");

        System.out.println(garfield.toString());
        garfield.speak();
        garfield.eat("lazagna");
        garfield.drink("milk");
        garfield.sleep();

        System.out.println("\nThere are " + Animal.count + " animals.");
    }
}
