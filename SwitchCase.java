public class SwitchCase {
    public static void main(String[] args) {
        int day = 5; //output magni 
        switch(day){
            case 0:
            //day==0
            System.out.println("sunday");
            break;

            case 1:
            System.out.println("monday");
            break;

            case 2:
            System.out.println("tuesday");
            break;

            default:
            System.out.println("unknown day");
            break;
        }

        //nest switch  statement
        String  beverage = "coke";
        char gender ='M';
        switch (beverage) {
            case "coke":
            switch (gender) {
                case 'M':
                 System.out.println("Male");
                    
                    break;
                case 'F':
                 System.out.println("Female");

                    break;
            
            }
             System.out.println("black");
                
                break;
        
              default:
             System.out.println("unknown beverages");
                break;
        }

       //switch case or
       int status = 404;
       switch (status) {
         //status == 200 || status == 201 || status == 202
         case 200:
         case 201:
         case 202:
          System.out.println("Success");
          break;
         // status == 401 || status == 404 
         case 401:
         case 404:
          System.out.println("Not found");
          break;
        
         default:
          System.out.println("unknown status");
         break;
        }

        
        // Task 1
        // make an int month and assign value
        // int month = 4;
        // using switch case check the month and print the following
        // 0-> Jan
        // 1->Feb
        // 2 -> Mar
        // 3 -> Jun
        // .. continue each month till 11
        // 11-> Dec

        int month = 12;
        switch (month) {
            case 0:
            System.out.println("Jan");
            break;
            
            case 1:
            System.out.println("feb");
            break;

            case 2:
            System.out.println("mar");
            break;

            case 3:
            System.out.println("Apr");
            break;
            
            case 4:
            System.out.println("Jun");
            break;

            case 5:
            System.out.println("Jul");
            break;

            case 6:
            System.out.println("Aug");
            break;
            
            case 7:
            System.out.println("Sep");
            break;

            case 8:
            System.out.println("Oct");
            break;

            case 9:
            System.out.println("Nov");
            break;
            
            case 10:
            System.out.println("Oct");
            break;

            case 11:
            System.out.println("Dec");
            break;

            default:
            System.out.println("out of order!!!!!!!!!!!!!!!!!!!!!!!");
        }



        // Task 2
        // make a variable string locale and assign "np"
        // string locale = "np"
        // using switch case check the and print the following

        // "en" or "en/us" or "en/uk" -> "selected english"
        // "in" -> "selected Indian"
        // "jp" -> "selected Japanese"
        // "np" -> "selected Nepali"
        // else -> "Unknown Locale"

        String locale = "ooo";
        switch(locale){

            case "en/uk": 
            System.out.println("selected english");
            break;

            case "in": 
            System.out.println(" selected Indian");
            break;

            case "jp": 
            System.out.println(" selected japanese");
            break;

            case "np": 
            System.out.println(" selected nepali");
            break;

            default:
            System.out.println("unknown locale");



        }

    }
    
}
