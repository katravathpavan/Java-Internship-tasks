import java.util.Scanner;
public class StringOperations
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String s = sc.nextLine();
        String rev = "";
        int count = 0;
        for( int i = s.length() - 1; i >= 0; i--)
        {
            rev = rev + s.charAt(i);
        }
        if(s.equals(rev))
            System.out.println("palindrome");
        else
            System.out.println("not palindrome");
        for(int i = 0;i<s.length(); i++)
        {
            char ch = s.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||
            ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
            {
            count++;
            }
        }
        System.out.println("vowels: "+count);
        sc.close();

    }
}