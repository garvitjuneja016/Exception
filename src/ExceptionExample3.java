import java.util.Scanner;

class Alpha {
    public void division() {
        try {
            System.out.println("CONNECTION STABLISHED");
            Scanner scan = new Scanner(System.in);

            System.out.println("Enter Numerator");
            int numerator = scan.nextInt();

            System.out.println("Enter Numerator");
            int denominator = scan.nextInt();

            int result = numerator / denominator;
            System.out.println("The result is " + result);

        }
        catch (ArithmeticException e)
        {
            System.out.println("please enter non zero denominator");
        }
    }
}

class Beta extends Alpha {
    public void display() {
        Alpha a = new Alpha();
        a.division();
    }
}
public class ExceptionExample3 {
    public static void main(String[] args) {


        Beta b = new Beta();
        b.display();

    }
}