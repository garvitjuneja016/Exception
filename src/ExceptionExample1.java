import java.util.Scanner;

public class ExceptionExample1 {
    public static void main(String[] args) {

        try {
            System.out.println("CONNECTION ESTABLISED");
            Scanner scan = new Scanner(System.in);

            System.out.println("enter the value of numerator");
            int numerator = scan.nextInt();
            System.out.println("enter the value of denominator");
            int denominator = scan.nextInt();

            float result = numerator / denominator;

            System.out.println("The result is " + result);

        }

        catch (Exception e)
        {
            System.out.println("Please provide non zero value for denominator");
        }
        System.out.println("CONNECTION TERMINATED");
    }
}
