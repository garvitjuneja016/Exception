import java.util.Scanner;

class InvalidUserException extends Exception
{

}


class ATM1
{
    private int accountNumber= 1111;
    private int password=2222;
    private int accNo;
    private int pswrd;

    public void getInputDetails()
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter Account Number");
        accNo=scan.nextInt();
        System.out.println("Enter Your Password");
        pswrd=scan.nextInt();

    }
    public void verify() throws InvalidUserException
    {
        if(accountNumber==accNo && password==pswrd)
        {
            System.out.println("COLLECT YOUR CASH");
        }
        else
        {
            InvalidUserException iuie=new InvalidUserException();
            System.out.println("INVALID USER INPUT");
            throw iuie;


        }
    }
}

class Bank1
{
    public void  initiate()
    {
        try
        {
            ATM1 a = new ATM1();
            a.getInputDetails();
            a.verify();
        }
        catch(InvalidUserException e)
        {
            System.out.println("try again!!");
            try
            {
                ATM1 a = new ATM1();
                a.getInputDetails();
                a.verify();
            }
            catch (InvalidUserException f)
            {
                System.out.println("try again!!");
                try
                {
                    ATM1 a = new ATM1();
                    a.getInputDetails();
                    a.verify();
                }
                catch (InvalidUserException g)
                {
                    System.out.println("CARD BLOCKED");
                }
            }
        }
    }
}


public class CustomException {
    public static void main(String[] args) {
        Bank1 b=new Bank1();
        b.initiate();
    }
}
