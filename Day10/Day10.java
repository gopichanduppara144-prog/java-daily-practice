import java.util.HashSet;


public class Day10 
{
    public static void main(String[] args){
        HashSet<Student> set = new HashSet<>();
        set.add(new Student(101, "Gopi"));
        set.add(new Student(101, "Gopi Duplicate")); // Idhi add avvakudadhu mawa!
        set.add(new Student(102, "Ravi"));

        System.out.println("Total Students: " + set.size()); // 2 ravali
        System.out.println(set); 
    }
    
}
