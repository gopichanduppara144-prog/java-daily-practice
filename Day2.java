class Student
{
    String name;
    int age;
    Student(String name,int age)
    {
        this.name=name;
        this.age=age;
    }
    void Display()
    {
        System.out.println("name:"+name+" age:"+age);
    }


}

public class Day2
{
    public static void main(String[] args)
    {
        Student s1= new Student("Gopi",8);
        s1.Display();
        String City="Hyderabad";
        int[] Marks={90,80,70,60,50};
        System.out.println("City: "+City+" Marks: "+Marks[0]);
    }
}