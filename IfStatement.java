public class IfStatement {
    public static void main(String[] args) {
        // if statment , decision making 
        int num1 = 10;
        if (num1 > 10){
            System.out.println("greater than 10");
            //more statement 
        }
         //if else statement 
        if(num1 > 20){
            System.out.println("Greater than 20");
        }else{
            System.out.println("Lesser than 20");
        }

        // if else if 
        if (num1 == 10){
            System.out.println("num is 10");
        }else if(num1 ==9){
            System.out.println("Num is 9");
        }else{
            System.out.println("Num is unknown");
        }

        //if else if ladder //multiple if 
        String bevarage ="Coke";
        if(bevarage =="Fanta"){
            System.out.println("Orange drink");
        }else if(bevarage == "Coke"){
            System.out.println("Black drink");
        }else if(bevarage =="Sprite"){
            System.out.println("Clear drink");
        }else{
            System.out.println("Unknown drink");
        }

        //Nested if
        if(bevarage =="Coke")
        {
            if (num1 == 10){
                System.out.println("Coke and 10");
            }else{
                System.out.println("Only coke");
            }
         }else{
            if (num1 == 10){
                System.out.println("Only 10");
            }else{
                System.out.println("NO coke and 10");
            }
        }

            //Task1
    //make a variable int day and assign value 
    //if day is 1 ->print sunday
    //if day is 2 -> print Monday
    //if day is 3 -> print tueday
    //if day is 4 -> print wednesday
    //if day is 5 -> print thursday
    //if day is 6 -> print friday
    //if day is 7 -> print saturday
    //if day is not in number -> print unknown day

    //task 2
    //Make a variable avgMark and a char variable gender
    //if avgMark is greater than 80 and gender is 'M' print "Good boy"
    //if avgMark is greater than 80 and gender is 'F' print "Good girl"
    //if avgMark is notgreater than 80 and gender is 'M' print "Bad boy"
    //if avgMark is notgreater than 80 and gender is 'F' print "Bad girl"
    }
    
}
