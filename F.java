//Check Vovels in String 
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
class F 
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter String");
        String str=sc.nextLine();
        //conver to upper/lowercase
          str.toLowerCase();

          //to keep track of vowels found in characters 
          Set<Character> vowels = new HashSet<>();

        for(int i=0;i<str.length();i++)
        {
            char ch = str.charAt(i);
            if(ch=='a'|| ch=='e' || ch=='i'||ch=='o'||ch=='u')
            {
                vowels.add(ch);

            }
        }
        if(vowels.isEmpty())
        {
            System.out.println("no vowels founds in the string");
        }
        else
        {
            System.out.println("vowels found in the String");
            for(char vow:vowels)
            {
                System.out.println(vow);
            }
        }
    }
}