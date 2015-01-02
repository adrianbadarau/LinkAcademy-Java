/**
 * Created by adrian on 01.01.2015.
 */
abstract class Animal{
    static int legs = 4;
    static void move(){
        System.out.println("I am moving");
    }

}
class Horse extends Animal{
    static void move(){
        System.out.println("I am moving faster");
    }
}
class Dog extends Animal{
    String name,gender;
    int age;
    Dog(String name, String gender, int age){
        this.name=name;
        this.gender=gender;
        this.age=age;
    }
    Dog(String name, String gender, int age, int nrLegs){
        this.name=name;
        this.gender=gender;
        this.age=age;
        legs = nrLegs;
    }
    void printDetails(){
        System.out.println("Name: "+this.name);
        System.out.println("Age: "+this.age);
        System.out.println("NR of legs: "+this.legs);
    }
}

public class ObjectsLeson {
    public static void main(String[] args){
        Dog wisper = new Dog("wisper","male",15,5);
        Horse betsy = new Horse();
        wisper.printDetails();
        wisper.move();
        betsy.move();
        Animal.move();
    }
}
