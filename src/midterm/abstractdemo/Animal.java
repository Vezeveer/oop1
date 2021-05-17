package midterm.abstractdemo;

public abstract class Animal {
    private String name;
    private int age;
    private String animalType;
    public static int count = 0;

    public Animal(){
        this.name = "Animal name";
        this.age = 0;
        this.animalType = "animal";
        count++;
    }

    public Animal(String name, int age, String animalType){
        this.name = name;
        this.age = age;
        this.animalType = animalType;
        count++;
    }

    public String toString(){
        return name + " is a " + age + "-year-old " + animalType;
    }

    public abstract void speak();

    public String getName(){
        return name;
    }
}
