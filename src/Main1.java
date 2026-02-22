import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        boolean eligible = false;
        boolean dean = false;
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Enter your age: ");
        String response = myScanner.next();
        int age = Integer.parseInt(response);
        if(age < 18 || age > 24)
        {
            System.out.println("You are not eligible for a scholarship");
            System.exit(0);
        }
        
        System.out.println("Have you lived in California for the last two years?\nor " +
        "Have you worked in California (part time or full time) at least for six months? \nor " +
        "Have your parents lived in California for at least one year? \nor " +
        "Have you volunteered for a public cause in California and can show proof of it? \n" +
        "Please enter \"yes\" or \"no\".");
        response = myScanner.next().toLowerCase();
        if (response.equals("yes") || response.equals("y")) {
            eligible = true;
        }
        else {
            System.out.println("Is your household income less than $5000?");
            response = myScanner.next().toLowerCase();
            if (response.equals("yes") || response.equals("y")){
                dean = true;
            }
        }

        if (eligible){
            System.out.println("You are eligible for the financial aid package.");
        }
        else if (dean){
            System.out.println("You will be deferred for the dean's consideration.");
        }
        else {
            System.out.println("You are not eligible for a scholarship.");
        }
    }
}
