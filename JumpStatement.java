public class JumpStatement {
    public static void main(String[] args) {
        // break and continue
        // 1. break -> exits the loop
        for (int i =0; i<=5; i++){
            if(i==2){
                break; // break will exit current loop scope
            }
            System.out.println("Break Loop"+i);

        } // break will exit the loop here

        for (int outer = 1; outer<=3; outer++ ){
            if(outer ==2){
                break;
            }
            for(int inner =0; inner<2; inner++){
                if(inner==1){
                    break;// this will only break the inner loop
                }
                System.out.println("inner"+inner);
            }
            //inner break exits here
            System.out.println("outer"+outer);
        } //outer break exit here

        // 2.continue-> skips the current iteration/loop

        for(int i=10; i <= 15; i++){
            if(i == 11){
                continue;// continue will skip this loop
                // meaning statement below will not be executed and goes to next phase of loop
            }
            System.out.println("continue"+i);
        }

        // task 1
        // using do while  print the following table
        // 5x10=50
        // 5x0=0

        // int i = 10;
        // do{
        //     int product = i *5;
        //     System.out.println("5x" +i + "="+ 5*i);
        //     i--;
            
        // } while(i>=0);


        // task2
        // using for loop and continue
        // loop from 1-20 and print the odd numbers

        for (int j = 1; j <=20; j++){
            if(j% 2 !=0){
                continue;
            }
            System.out.println(j);
           
        }

        // task3
        // using while loop and continue
        // loop from m20-40 and print the even numbers
}
    
}
