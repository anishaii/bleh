public class Function {
    // make function inside a class scope
    public static int add(int num1, int num2) {
        int sum= num1+num2;
        return sum;
    }
        // 1 modifier -> public/private/default
        // 2 static->  without object
        //3.returntype -> what function returns datatype
        // if you donot wnat to return anything"void" can be used
        //4. FunctionName -> identifier to call function
        // 5. arguments/parameter ->additonal data to sent when calling function
        // note :function should be made in class scope,meaning on to of main() here
        // then function can be called here
        static void greet(){
            System.out.println("says hello");
        }

        // make a function called StudentDetail
        // that take arguement for student name , age and gender
        // print the following when the functionj is called
        //student Detail
        //name:
        //age:
        //gender:
        //Data fetched successfully
        public static void main(String[] args) {
            
        
        int value1= 10;
        int value2=20;
        int returnedValue = add(value1, value2);
        System.out.println("Returned value: " + returnedValue);
        //int returnedValue = add(10,20); // 10 ,20 will be num1 and num2 in the function
        System.out.println("returned"+returnedValue);
        greet();
        greet();
        }
    
    
}
