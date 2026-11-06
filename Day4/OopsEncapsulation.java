class Student
{
    private int Marks=0;
    public void setMarks(int m)
    {
        if (m>=0 && m<=100)
        Marks = m;
    }
    public int getMarks()
    {
        return Marks;
    }
}
public class OopsEncapsulation
{
    public static void main(String args[])
    {
        Student s1 = new Student();
        s1.setMarks(85);
        System.out.println("Student 1: Marks: " + s1.getMarks());
    }
}