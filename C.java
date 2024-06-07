//Anagram String
import java.util.Scanner;
class C 
{
    public static void main(String args[])
    {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter 1st String");
    String s1=sc.next();
    System.out.println("enter str2 ");
    String s2=sc.next();
        //convert into lowercase/uppercase
         s1=s1.toLowerCase();
         s2=s2.toLowerCase();
 
         int count=0;
    //check whether length of both string is same or not 
    if(s1.length()==s2.length())
    {
        for(int i=0;i<s1.length();i++)
        {
            char ch=s1.charAt(i); 
         if(s2.indexOf(ch)>-1)
         if(s2.indexOf(ch)!=s2.lastIndexOf(ch))
         {
            count++;
            break;
         }

        }

        if(count==0)
        {
            System.out.println("String is anagram");
        }
        else
        {
            System.out.println("String is not anagram ");
        }
    }
    else
    {
        System.out.println("String is not anagram");
    }
    



    }

}