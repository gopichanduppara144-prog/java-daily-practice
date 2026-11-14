import java.util.Objects;

class Student
{
    private int id;
    private String name;

    public Student(int id, String name)
    {
        this.id=id;
        this.name=name;
    }

    public int getId()
    {
        return id;
    }
    public String getName()
    {
        return name;
    }
    
    @Override 
    public int hashCode()
    {
        return Objects.hash(id);
        

    }
    public String toString()
    {
        return id+" - "+name;
    }
    @Override
    public boolean equals(Object o){
        if(this == o) return true;
        Student s = (Student) o;
        return this.id == s.id;
    }



}