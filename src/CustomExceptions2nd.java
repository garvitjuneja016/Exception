import java.util.Scanner;

class InvalidUserInputException extends Exception
{
    InvalidUserInputException(String msg)
    {
        super(msg);
    }
}
class ATM {
    private int accountNumber = 1111;
    private int password = 2222;
    private int accNo;
    private int pswrd;

    public void getInputDetails()
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Account Number");
        accNo = scan.nextInt();
        System.out.println("Enter Your Password");
        pswrd = scan.nextInt();

    }

    public void verify() throws InvalidUserInputException
    {
        if (accountNumber == accNo && password == pswrd)
        {
            System.out.println("COLLECT YOUR CASH");
        } else
        {
          /*  InvalidUserInputException iuie = new InvalidUserInputException();
            System.out.println("INVALID USER INPUT");
            throw iuie;*/
           throw  new InvalidUserInputException("INVALID INPUT BY USER");

        }
    }
}
class Bank
{
    public void  initiate()
    {
        try
        {
            ATM a = new ATM();
            a.getInputDetails();
            a.verify();
        }
        catch(InvalidUserInputException e)
        {
            System.out.println(e.getMessage());
            System.out.println("try again!!");
            try
            {
                ATM a = new ATM();
                a.getInputDetails();
                a.verify();
            }
            catch (InvalidUserInputException f)
            {
                System.out.println(f.getMessage());
                System.out.println("try again!!");
                try
                {
                    ATM a = new ATM();
                    a.getInputDetails();
                    a.verify();
                }
                catch (InvalidUserInputException g)
                {
                    System.out.println("CARD BLOCKED");
                }
            }
        }
    }
}


public class CustomExceptions2nd {
    public static void main(String[] args) {
        Bank b=new Bank();
        b.initiate();
    }
}
