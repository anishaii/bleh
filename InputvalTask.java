   //Create an application that asks user for their username
        //if username is not equals to your name ask again
        //ask user for the pin number
        //if pin number is not 1234 ask user the pin again
        //if the user type the pit number wrong for 5 times
        //display "Login Invalid"
        //if the username and pin is invalid 
        //print a "secrt message"

import java.util.Scanner;
public class InputvalTask {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String name ="Anisha";
        String username= scan.nextLine();
        while (!username.equals(name)) {
            System.out.println("incorrect username");
            username= scan.nextLine();
            
        }
        System.out.println("correct username");

        //for pin
        
            System.out.println("Enter a pin number:");
            int pin = 1234;
            while (pin<=5) {
                System.out.println("Login invalid");
                pin =  scan.nextInt();
    
                
            }
            System.out.println("secret message");
            scan.close();



        scan.close();


        
    }
    
}
