import java.util.Scanner;
public class Calculator
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number : ");
        int n1 = sc.nextInt();
        System.out.print("Enter second number : ");
        int n2 = sc.nextInt();
        System.out.print("Enter operation(+,-,*,/,%) : ");
        char operator = sc.next().charAt(0);
        switch(operator)
        {
            case '+':
                System.out.println("Result : "+(n1+n2));
                break;
            case '-':
                System.out.println("Result : "+(n1-n2));
                break;
            case '*':
                System.out.println("Result : "+(n1*n2));
                break;
            case '/':
                if(n2==0){
                    System.out.println("division by zero is not possible.");
                }
                else
                {
                    System.out.println("Result : "+(n1/n2));
                }
                break;
            case '%':
                if(n2==0){
                    System.out.println("cannot divide by zero");
                }
                else
                {
                    System.out.println("Result = "+(n1%n2));
                }
                break;
            default:
                    System.out.println("Invalid operator!");
        }
        sc.close();
    }
}