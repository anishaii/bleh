public class variableintroduction {
    public static void main(String[] args) {
        //shortcut psvm
        //primitive datatype
        //Declaration 
        boolean boolVariable;
        //Initialization
        boolVariable = false;
        System.out.println(boolVariable);
        //Declaration and initialization
        int intVariable = 10;
        System.out.println(intVariable);
        // multi declaration
        float floatVariable1, floatVariable2;
        // //Initialization
        floatVariable1 = 10.33f;
        floatVariable2 = 11.33f;

        System.out.println(floatVariable1);
        System.out.println(floatVariable2);
        
        // multi declartion and initialization
        // char charVariable1 ='c', charVariable2 = 'a', charVariable3 = 't';

        //limitations
        //byte byteVariable = 10000000;  cannot exceed the capacity
        //short shortVariable = false;   cannot mismatch type of value  (numeric datatype = boolean value)

        // Non primitive datatype  first capital
        String stringVariable = "Hello world";
        // string value is enclosed in double quotes " "
        // can make string using constructor
        String stringVariable2 = new String("object of string");

         
       /*  Task (classwork)
        * Declare the following variable 
        * firstName string
        * lastName string
        * age int
        * over18 boolean
        * initialize each variable with  your own detail
        * declare multiple variable
        * mathmarking, englishMarking, ScienceMarking -> float
        * Initialize each variable with decimal number
        * declaare and initialize multiple variable
        * averageMarking, gpa-> double
        */

        String firstName;
        String lastName;
        int age;
        boolean over18;
        firstName = "anisha";
        lastName = "GC";
        age= 100;
        over18 = true;
        
        float mathmarking, englishMarking , ScienceMarking;
        mathmarking = 60.3f;
        englishMarking = 77.1f;
        ScienceMarking = 90.12f;

        



    }
    
}

