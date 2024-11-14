public class ForLoop {
    public static void main(String[] args) {
        // 1. Initialize 
        // 2.Condition
        // 3. update/modify
        for (int i=1; i <5 ; i++){
        // loop statment
        System.out.println("Loop"+i);

        //for (int i = 10;i>=-3 ; i-=3){
            // loop statment
           // System.out.println("Loop"+i);
           // }
        }

        // Decrement
     int dec;
     for (dec= 5; dec>=1; dec-=2){
        System.out.println("Loop dec by two"+ dec);
     }
    

     // nested loop
     for(int row=1; row<=5; row++){ //1,2,3,4,5
        System.out.println("outer loop"+row);
        for(int col = 5; col>1; col --){ // 5,4,3,2 
            System.out.println("inner loop"+col);
        }
        System.out.println("innner loop exit");

     }
     System.out.println("outer loop exit");

     // tast 1
     // using for loop make a multiplication table of 2
     // 2x1=2
     // "
     // 2x10=20

     // task 2
     // using nested for loop make the multiplication
     // multiplication table of 1  for (int i=1; i <5 ; i++)   System.out.println("Loop"+i);


     for (int i = 1; i<=20 ; i++){
     System.out.println("2 x"+i + " = " +2*i);
     }
    }

    
}
