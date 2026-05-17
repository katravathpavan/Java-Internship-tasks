import  java.util.Scanner;
public class ControFlowExercises
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose option: ");
        System.out.println("1.PrimeCheck");
        System.out.println("2.Fibonacci Series");
        System.out.println("Enter your choice : ");
        int choice = sc.nextInt();
        switch(choice)
        {
            //PRIME CHECK
            case 1:
                System.out.println("Enter a number: ");
                int n = sc.nextInt();
                int count = 0;
                for(int i = 1; i <= n; i++)
                {
                    if(n%i==0){
                        count++;
                    }
                }
                if(count==2)
                    System.out.println(n+ " is a prime number");
                else
                    System.out.println(n+ " is not a prime number");
                break;
            //FIBONACCI SERIES    
            case 2:
                System.out.print("Enter number of terms : ");
                int terms = sc.nextInt();
                int a=0,b=1;
                System.out.print("Fibonacci series: ");
                for(int i=1; i<= terms; i++)
                {
                    System.out.print(a+" ");
                    int next=a+b;
                    a=b;
                    b=next;
                }
                break;
            default:
                System.out.println("Invalid choice");
        }
    }
}
