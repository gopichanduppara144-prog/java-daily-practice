class Student
{
    String name;
    int age;
    void display()
    {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}
class Oops_Class
{

    public static void main(String args[])
    {

        Student s1 = new Student();
        s1.name="Gopi";
        s1.age=28;
        Student s2 = new Student();
        s2.name = "Komali";
        s2.age = 25;
        s1.display();
        s2.display();
    }
}