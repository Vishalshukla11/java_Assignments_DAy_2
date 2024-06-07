// Increment Character by one :- A -> A+1 -> B
import java.util.Scanner;
class I 
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter string");
        String str=sc.next();

        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            int ascii=(int)ch+1;
            char newch=(char)ascii;
           System.out.println(ch + " => after increment => " +newch);

        }
    }
}
