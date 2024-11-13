public class UserOutput {
    public static void main(String[] args) {
        //standard output/terminal output
        //continous printing

        System.out.print("this"); //ekai line ma print hunxa
        System.out.print("is");
        System.out.print("java\n");

        //line break after printing
        System.out.println("Next print will start from next line");

        //print using formatting
        // %f floating point ,%d integral ,%s String(any)
        System.out.printf("Temperature %f degree celsius \n",30.22);

        //can use multiple placeholder
        System.out.printf("Name %s, Age %d, Weight %f","Harry",30,75.44);

        // the arrangement of the placeholder and value given after string must match 
        // eg: 1 %s String , 2 %d integer, 3 %f float
    }
    
}
