public class PostfixPrefix {
    public static void main(String[] args) {
        int num1= 10;
        int num2 = 20;
        // prefix , ahead of variable or value ++number
        System.out.println("prefix");
        System.out.println(++num1); // the value of num1 changes in this line 
        System.out.println(num1);

        //postfix, behind of variable or value number++
        System.out.println("Postfix");
        System.out.println(num2++); // the value of num2 changes in next line
        System.out.println(num2);
    }
    
}
