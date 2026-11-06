class A {
    void displayA() {
        System.out.println("Class A single inheritance");
    }
}
class B extends A
{
    void displayB() {
        System.out.println("Class B single inheritance");
    }
}


class GrandParent {
    void displayGrandParent() {
        System.out.println("Class GrandParent multilevel inheritance");
    }
}
class Parent extends GrandParent {
    void displayParent() {
        System.out.println("Class Parent multilevel inheritance");
    }
}
class Child extends Parent {
    void displayChild() {
        System.out.println("Class Child multilevel inheritance");
    }
}
class KeypadMobile
{
    void call()
   {
    System.out.println("Calling...");
   }
   void message()
   {
    System.out.println("Messaging...");
   }
}
class Andriod extends KeypadMobile
{
    void videos()
    {
        System.out.println("Videos option...");
    }
    void Touch()
    {
        System.out.println("touch screen option");
    }
}
class Iphone extends KeypadMobile
{
    void videos()
    {
        System.out.println("Videos option...");
    }
    void Touch()
    {
        System.out.println("touch screen option");
    }
    void Siri()
    {
        System.out.println("siri calling option");
    }
}

interface Animal
{
    void sound();
    void eat();
}
class Dog implements Animal
{
    public void sound()
    {
        System.out.println("Dog barks");
    }
    public void eat()
    {
        System.out.println("Dog eats");
    }

}
class Cat implements Animal
{
    public void sound()
    {
        System.out.println("Cat meows");
    }
    public void eat()
    {
        System.out.println("Cat eats");
    }
}


public class Oops_TypesofIneritance 
{
    public static void main(String args[])
    {
        /*Single inheritance     */
        B obj1 = new B();
        obj1.displayA();
        obj1.displayB();

        /* Multilevel inheritance */
        Child obj = new Child();
        obj.displayGrandParent();
        obj.displayParent();
        obj.displayChild();
        
        /* Hierarchical inheritance */

        Andriod andriod = new Andriod();
        andriod.call();
        andriod.message();

        Iphone iphone = new Iphone();
        iphone.call();
        iphone.message();

        /* Hybrid inheritance  using interface*/
        Dog dog = new Dog();
        dog.sound();
        Cat cat = new Cat();
        cat.sound();
        cat.eat();

        Animal animal = new Dog();
        animal.sound();
        animal.eat();
        Animal animal1 = new Cat();
        animal1.sound();
        animal1.eat();
    }
}
