import java.util.Scanner;
public class InputValidation {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        String password ="abc123";
        String userPassword= scan.nextLine();
        while (!userPassword.equals(password)) {
            System.out.println("Incorrect Password");
            userPassword= scan.nextLine();
            
        }
        System.out.println("congratulation");
        //note: to compare two String string1.equals(string2)
        
        //for integer
        System.out.println("Enter a positive number:");
        int num = scan.nextInt();
        while (num<0) {
            System.out.println("incorrect number,positive number only");
            num =  scan.nextInt();

            
        }
        System.out.println("positive num"+num);
        scan.close();

        //task
        //Create an application that asks user for their username
        //if username is not equals to your name ask again
        //as user for the pin number
        //if pin number is not 1234 ask user the pin again
        //if the user type the pit number wrong for 5 times
        //display "Login Invalid"
        //if the username and pin is invalid 
        //print a "secrt message"
    }
    
}
