import java.util.ArrayList;
public class ArrayListPractice1
{
    public static void main(String[] args)
    {
        ArrayList<String> friendsList = new ArrayList<>();
        friendsList.add("gopi");
        friendsList.add("chand");
        friendsList.add("uppara");
        friendsList.add("komali");
        friendsList.add("Umi");
        System.out.println(friendsList);
        System.out.println("My best friend is: "+friendsList.get(2));
        friendsList.set(1,"Babu");
        System.out.println("After Updating 2nd friend name:"+friendsList);
        friendsList.remove("Umi");
        System.out.println("After removing one name: "+friendsList);
        System.out.println("List lo Umi unnad? "+friendsList.contains("Umi"));

        for(String f: friendsList)
        {
            System.out.println(f);
        }
    }
}
