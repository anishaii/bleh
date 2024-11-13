import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        // To take input import Scanner class at top of the file 
        // inport java.util.Scanner;
        // make an object of the scanner and take input form the object

        Scanner scan = new Scanner(System.in);
        System.out.println("Your age: ");
        int ageInput = scan.nextInt();
        System.out.println("Your are"+ ageInput);

        System.out.println("Over 18?");
        boolean Over18Input = scan.nextBoolean();
        System.out.println(Over18Input);

        System.out.println("your weight: ");
        double weightInput = scan.nextDouble();
        System.out.println(weightInput);

        //after using scanner for primitive data and want input for string
        // you need to clear the enter input

        scan.nextLine();
        System.out.println("Your Name?");
        String name = scan.nextLine();
        System.out.println(name);
        scan.close(); // must close scanner object to avoid input locks 
    }
    
}
