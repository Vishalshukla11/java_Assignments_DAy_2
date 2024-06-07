//Print ASCII Values of Character String A -> 65
import java.util.Scanner;
class H 
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner (System.in);
        System.out.println("enter the string ");
        String str=sc.next();
        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            int ascii= (int)ch;
            System.out.println(ch + " ascii value => " + ascii);
        }
    }

}
