import java.util.HashSet;

public class SetPractice
{
    public static void main(String[] args)
    {
        HashSet<String> listFrnd = new HashSet<>();
        listFrnd.add("gopi");
        listFrnd.add("uppara");
        listFrnd.add("gopi");
        listFrnd.add("komali");
        listFrnd.add("uppara");

        System.out.print("List of friends :"+listFrnd);
        System.out.println("size of set"+listFrnd.size());
        System.out.println("Gopi unda??"+listFrnd.contains("gopi"));
        listFrnd.remove("uppara");
        System.out.println(listFrnd);
        System.out.println("For each using ");
        for(String list:listFrnd)
        {
            System.out.println(list);
        }
    }
}