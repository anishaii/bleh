import java.util.Scanner; // This imports the Scanner class, which is used to read input from the user.
public class Assignment {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); //Initializes a Scanner object to read user input from the console.

        //declaring Variable
        String Name ="";
        int Age =0;
        String Gender ="";
        char Grade =' ';
        String Address ="";

         // name
         while (true) {
            System.out.print("Enter Your Name:");
            Name = scan.nextLine(); //  Reads the entire line of input entered by the user.
            if(!Name.isEmpty()){
                break;
            }else{
                System.out.println("Name must not be empty");
            }
         }

         //age

         while (true) {
            System.out.print("Enter Your Age:");
            Age = scan.nextInt();
            if(Age >= 5 && Age <= 120){
                break;
            }else{
                System.out.println("Must be a valid number between 5 and 120");
            }
         }
         scan.nextLine();


            while (true) {
                System.out.print("Enter Gender(Male/Female/Other):");
                Gender= scan.nextLine();
                if(Gender.equalsIgnoreCase("Male") || Gender.equalsIgnoreCase ("Female")|| Gender.equalsIgnoreCase("others")){
                    break;
                }else{
                    System.out.println("Must be “Male”, “Female”, or “Other”.");
                }
            }
                
                while (true) {
                    System.out.print("Enter Grade (A-F):");
                    Grade = scan.next().charAt(0);
                    if(Grade=='A'|Grade=='B'||Grade=='C'||Grade=='D'||Grade=='E'||Grade=='F'){
                        break;
                    }else{
                        System.out.println("Must be a single letter between A and F.");
                    } 
                }
                scan.nextLine();

                while (true) {
                    System.out.print("Enter student Address: ");
                    Address = scan.nextLine();
                    if (!Address.isEmpty()) {
                        break;
                    } else {
                        System.out.println("Address musn't be empty");
                    }
                }

                System.out.println("\nStudent details saved successfully!");
                System.out.println("Name: " + Name);
                System.out.println("Age: " + Age);
                System.out.println("Gender: " + Gender);
                System.out.println("Grade: " + Grade);
                System.out.println("Address: " + Address);
            

         


       scan.close(); 
    }
    
}
