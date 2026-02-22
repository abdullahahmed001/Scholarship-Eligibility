import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World");

        Scanner myScanner = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = myScanner.nextInt();

        if(age < 18 || age > 24)
        {
            System.out.println("You are not eligible for a scholarship");
        }
        else
        {
            System.out.println("You are eligible for a scholarship");
        }

    }
}
