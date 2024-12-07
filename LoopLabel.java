public class LoopLabel {
    public static void main(String[] args) {
          // for loop used when iteration is fixed
        for(int idx=0; idx<=5;idx++){
            System.out.println("for loop"+idx);
        } //while loop ,used when iteration is not fixed
        int number=10;
        while (true) {
            if(number%3  ==0){
                break;
            }

            System.out.println("while loop"+number);
            number++;
            
        }
       //loop label
       meroLoop:for(int first =0; first<=2; first++){
        System.out.println("outer loop"+first);
        for(int second=1; second<=5; second++){
            if(second == 2){
                break meroLoop;
            }
        }
       }

       
    }
    
}
