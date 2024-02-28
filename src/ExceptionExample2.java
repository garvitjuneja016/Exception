import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionExample2 {
    public static void main(String[] args) {
        try {

            System.out.println("CONNECTION ESTABLISHED");
            Scanner scan = new Scanner(System.in);
            System.out.println("enter numerator");
            float numerator = scan.nextFloat();
            System.out.println("enter denominator");
            float denominator = scan.nextFloat();
            float result = numerator / denominator;
            System.out.println("The result is " + result);

            System.out.println("enter the size of an array");
            int size = scan.nextInt();
            int arr[] = new int[size];
            System.out.println("enter the element of array");
            int element = scan.nextInt();
            System.out.println("enter the position to which the element is inserted in array");
            int pos = scan.nextInt();
            arr[pos] = element;
        }
        catch (ArithmeticException e)
        {
            System.out.println("please enter the non zero denominator");
        }

        catch (NegativeArraySizeException e)
        {
            System.out.println("please enter the positive value for array size");
        }
        catch (InputMismatchException e)
        {
            System.out.println("please enter the correct input");
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("be in limit");
        }
        catch (Exception e)
        {
            System.out.println("invalid input");
        }
        System.out.println("CONNECTION TERMINATED");

    }
}
