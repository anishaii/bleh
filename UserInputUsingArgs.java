public class UserInputUsingArgs {
    public static void main(String[] args) {
        // the parameter String[] args take array of input
        // when running from commandline
        // you can compile java file with
        // java FileName.java
        // java FileName args1 args2
        // or

        System.err.println("First Args"+ args[0]);
        System.err.println("First Args"+ args[1]);

        // the args are in datatype string, to convert or parse any args
        int argsParse1 = Integer.parseInt(args[0]);
        int argsParse2 = Integer.parseInt(args[1]);
        System.out.println("Sum of args "+ (argsParse1+argsParse2));

    }
    
}
