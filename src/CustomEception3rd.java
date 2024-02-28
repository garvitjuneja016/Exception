import java.util.Scanner;

class UnderAgeException extends Exception
{
    UnderAgeException(String msg)
    {
        super(msg);
    }
}
class OverAgeException extends Exception
{
    OverAgeException(String msg)
    {
        super(msg);
    }
}

class LicenseApp
{
    private int age;

    public void inputAge()
    {
        Scanner scan =new Scanner(System.in);
        System.out.println("Enter your Age to Check Eligbility");
        age=scan.nextInt();

    }
    public void VerifyAge()throws UnderAgeException,OverAgeException
    {
        if (age>=18 && age<60)
        {
            System.out.println("you are eligible");
        }

        else if (age<=18)
        {
           throw  new UnderAgeException("SORRY DUDE!! You are not UNDER AGE");
        } else if (age>=60)
        {
        throw  new OverAgeException("SORRY DUDE!! You are not OVER AGE");
        }
    }
}

class RTO
{
    public void initiate()
    {
        LicenseApp lapp=new LicenseApp();
        try
        {
        lapp.inputAge();
        lapp.VerifyAge();
        }
        catch(UnderAgeException e)
        {
            System.out.println(e.getMessage());
            try
            {
                lapp.inputAge();
                lapp.VerifyAge();
            }
            catch (UnderAgeException a)
            {
                System.out.println("Seems Suspecious");
                System.exit(0);
            }
            catch (OverAgeException b)
            {
                System.out.println("Seems Suspecious");
                System.exit(0);
            }

        }
        catch (OverAgeException f)
        {
            System.out.println(f.getMessage());
            try
            {
                lapp.inputAge();
                lapp.VerifyAge();
            }
            catch (UnderAgeException a)
            {
                System.out.println("Seems Suspecious");
            }
            catch (OverAgeException b)
            {
                System.out.println("Seems Suspecious");
            }

        }
    }
}


public class CustomEception3rd {
    public static void main(String[] args) {
            RTO rto=new RTO();
            rto.initiate();
    }
}
