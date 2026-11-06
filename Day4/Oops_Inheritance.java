class Animal
{
    String color="white";
    void eat()
    {
        System.out.println("eating...");
    }

}
class Dog extends Animal
{

    void bark()
    {
        System.out.println("Braking...");
    }
}
class mobile
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
class Smartphone extends mobile
{
    Smartphone()
    {
        System.out.print("This is smartphone feture");
    }
    void camera()
    {
        System.out.println("Clicking...");
    }
    void video()
    {
        System.out.println("Recording...");
    }
    void music()
    {
        System.out.println("Playing...");
    }
    void internet()
    {
        System.out.println("Browsing...");
    }
    void gps()
    {
        System.out.println("Navigating...");
    }
    void bluetooth()
    {
        System.out.println("Connecting...");
    }
    void wifi()
    {
        System.out.println("Connecting...");
    }
    void apps()
    {
        System.out.println("Downloading...");
    }
    void games()
    {
        System.out.println("Playing...");
    }
    void settings()
    {
        System.out.println("Configuring...");
    }
    void security()
    {
        System.out.println("Securing...");
    }
    void backup()
    {
        System.out.println("Backing up...");
    }
    void restore()
    {
        System.out.println("Restoring...");
    }
    void update()
    {
        System.out.println("Updating...");
    }
    void reset()
    {
        System.out.println("Resetting...");
    }
    void shutdown()
    {
        System.out.println("Shutting down...");
    }void restart()
    {
        System.out.println("Restarting...");
    }
    void sleep()
    {
        System.out.println("Sleeping...");
    }
    void wakeup()
    {
        System.out.println("Waking up...");
    }
    void lock()
    {
        System.out.println("Locking...");
    }
    void unlock()
    {
        System.out.println("Unlocking...");
    }
    void volume()
    {
        System.out.println("Adjusting volume...");
    }

}
class Iphone extends Smartphone
{
    Iphone()
    {
        System.out.print("Iphone an option of:");
    }
    
    void siri()
    {
        System.out.println("Siri is listening...");
    }   
}

public class Oops_Inheritance
{
    /*
    public static void main(String[] args)
    {
        Dog dog = new Dog();
        dog.eat();
        dog.bark();
    
        System.out.println(dog.color);
    }
    */
   public static void main(String[] args)
   {
    Iphone iphone = new Iphone();
    iphone.call();
    iphone.message();
    iphone.camera();
    iphone.video();
    iphone.music();
    iphone.internet();
    iphone.gps();   

    Smartphone smartphone = new Smartphone();
    smartphone.bluetooth();
    smartphone.wifi();
    smartphone.apps();
   }


}
