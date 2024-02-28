import javax.xml.transform.sax.SAXSource;
import java.util.Scanner;

class Alpha3
{
    public void division()throws ArithmeticException
    {
        try
        {

            System.out.println("CONNECTION STABLISHED");
            Scanner scan = new Scanner(System.in);

            System.out.println("enter numerator value");
            int numerator = scan.nextInt();

            System.out.println("enter denominator value");
            int denominator = scan.nextInt();
            int result = numerator / denominator;

            System.out.println("Division is " + result);
        }
        catch (ArithmeticException e)
        {
            System.out.println("Exception Handled in division method only");
//          Rethrowing Exception
            throw e;
        }
//        finally block will get executed at any cost or in any case,
//        the Statement that are critical/Important are must written in finlly block.
        finally
        {
            System.out.println("CONNECTION TERMINATED");
        }

    }
}

public class RethrowingException {
    public static void main(String[] args) {
        System.out.println("Main method");
        try
        {
        Alpha3 a3=new Alpha3();
        a3.division();
        }
        catch (ArithmeticException e)
        {
            System.out.println("Arithmethic exception");
        }
}
}
