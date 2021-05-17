package midterm.abstractdemotest;
import midterm.abstractdemo.Animal;
import midterm.abstractdemo.Cat;
import midterm.abstractdemo.Dog;
import midterm.abstractdemo.Horse;

public class Test {
    public static void main(String[] argz){
        Cat felix = new Cat("Felix", 3, "cat");
        Dog charlie = new Dog("Charlie", 4, "dog");
        Horse spirit = new Horse("Spirit", 10, "horse");

        System.out.println(charlie.toString());
        charlie.speak();

        System.out.println(felix.toString());
        felix.speak();

        System.out.println(spirit.toString());
        spirit.speak();

        System.out.println("There are " + Animal.count + " animals.");
    }
}
