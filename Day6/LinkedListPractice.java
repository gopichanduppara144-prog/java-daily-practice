import java.util.LinkedList;
public class LinkedListPractice 
{
    public static void main(String[] args)
    {
        LinkedList<String> frnd = new LinkedList<>();
        frnd.add("gopi");
        frnd.add("chand");
        frnd.addFirst("uppara");
        frnd.addLast("Komali");
        frnd.add("umesh");
        frnd.set(3,"Teja");
        System.out.println("Friends List:"+frnd);
         for(int i=0;i< frnd.size();i++)
         {
            System.out.println("Listwise:"+frnd.get(i));
         }

         frnd.remove("Teja");
         System.out.println("Teja unda list lo ??: "+frnd.contains("Teja"));
    }    
}
