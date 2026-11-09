import java.util.ArrayList;

class ArrayListPractice
{
    public static void main(String[] args)
    {
        ArrayList<String> Menu=new ArrayList<>();

        Menu.add("Biryani");
        Menu.add("South Indian food");
        Menu.add("Chapthi");
        Menu.add("coffe");
        Menu.add("Pizza");
        Menu.add("Mandi");
        Menu.add("Biryani");
        System.out.println("Menu :"+Menu);
        System.out.println("Menu Size :"+Menu.size());
        System.out.println("Get method using:"+Menu.get(0));
        Menu.set(0,"Burger");
        System.out.println("After Adding Burger:"+Menu);
        Menu.add("Biryani");
        System.out.println(Menu);
        Menu.remove("South Indian food");
        System.out.println("Removing after: "+Menu);
        System.out.println("List lo Biryani unda leda?? "+Menu.contains("Biryani"));

    }
}