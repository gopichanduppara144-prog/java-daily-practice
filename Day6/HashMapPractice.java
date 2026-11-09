
import java.util.HashMap;
public class HashMapPractice {
    public static void main(String[] args)
    {
        HashMap<String, String> nameContact = new HashMap<>();
        nameContact.put("gopi", "9398250152");
        nameContact.put("chand","9398250152");
        nameContact.put("Komali", "88868985445");
        nameContact.put("gopi", "9398250152");
        nameContact.put("ragesh","8545961245");
        nameContact.put("ammulu", "8541263587");

        System.out.println(nameContact);
        System.out.println(nameContact.get("ragesh"));
        nameContact.remove("ammulu");
        System.out.println(nameContact);

        for(String name: nameContact.keySet())
        {
            System.out.println(nameContact.get(name));
        }

    }
}
