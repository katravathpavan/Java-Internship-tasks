class BankAccount{
    private int accountNumber;
    private double balance;
    BankAccount(int accountNumber, double balance)
    {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    public int getAccountNumber()
    {
        return accountNumber;
    }
    public double getBalance()
    {
        return balance;
    }
    public void setBalance(double balance)
    {
        if(balance >= 0)
        {
            this.balance = balance;
        }
        else{
            System.out.println("Balance cannot be negative");
        }
    }
}
public class BankDemo
{
    public static void main(String[] args)
    {
        BankAccount b = new BankAccount(181,5000);
        System.out.println("Account Number : "+ b.getAccountNumber());
        System.out.println("Balance : "+b.getBalance());
        b.setBalance(8000);
        System.out.println("Updated Balance : "+b.getBalance());
        b.setBalance(-2000);
    }
}