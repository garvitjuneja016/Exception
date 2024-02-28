import java.util.Scanner;
class  Alpha1
{
    public void division()
    {
        System.out.println("CONNECTION STABLISHED");
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter Numerator");
        int numerator = scan.nextInt();

        System.out.println("Enter Numerator");
        int denominator = scan.nextInt();

        int result = numerator / denominator;
        System.out.println("The result is " + result);

    }
}
class Beta1 extends Alpha1 {
    public void display() {
        Alpha1 a = new Alpha1();
        a.division();

    }
}


public class ExceptionExample4 {
    public static void main(String[] args) {

        try
        {
        Beta1 b=new Beta1();
        b.display();
        }
        catch (ArithmeticException e)
        {
            System.out.println("please enter non zero denominator");
        }
    }
}
