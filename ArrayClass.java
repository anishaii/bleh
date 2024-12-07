public class ArrayClass {
    public static void main(String[] args) {
        //[] after a datatype in variable denotes array
        //1. Declare and allocate later
        int[] arr1;
        //allocate size
        arr1= new int[2];//will create[0,0]
        arr1[0]=20; //[20,0]
    

        // 2.declare and allocate at the same line
        int[] arr2=new int[4]; // will create [0,0,0,0]
        arr2[2]=20;//[0,0,20,0]

        //3. declaare and initialize
        int[] arr3 ={20,30,50,60,100};
        // indexing example
        // 0  1  2  3  4
        //20 30 50 60 100

        // array are mutabel/ can change the data
        arr3[0]=40;
        arr3[4]=200;
        // 40,30,50,60,200
        System.out.println(arr3[0]);
        System.out.println(arr3[1]);
        System.out.println("arr3 has count" + arr3.length);

        //illegal array operation
        //arr3[0]= "Test123"; //mismatch datatype
        //arr2[10] = 100;// cannot use indexx more than size

        // Task1
        //Make an array called names and allocate size of 3
        //add the names like ,Ram , Shaym, ghanashyam
        // Print all the names
        // change ram to sitaram
        // change ghanshyam to Gita
        // print all the names again

        
        String[] names =new String[3];
        names[0] ="Ram"; 
        names[1] ="Shyam";
        names[2]  ="Ghanshyam";

        names[0]="Sitaram";
        names[2]="Gita";

        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[2]);

      




        // task2
        // make an array of char called grade and allocate the size of 6
        // add the grades like A,B,C,D,E,F
        // print the first element of the grades
        // print the last element of the grades

       char[] grades =new char[6];
       grades[0]='A';
       grades[1]='B';
       grades[2]='C';
       grades[3]='D';
       grades[4]='E';
       grades[5]='F';

       System.out.println(grades[0]);
       System.out.println(grades[grades.length - 1]);
       

       // last index -> 5 ->size-1

       //array loop condition
       //1. index < arr.length
       //2. index<= arr.length
       for (int index =0; index< grades.length;index++){
        System.out.println("Index"+index);
        System.out.println("element"+grades[index]);
       }

       // make an array with the values
       // 22,33,44,55,66,77,101,202,403,899
       // loop the array and print only the even numbers

       int[] arrloop ={20,30,50,60,100};
       for (int index=0; index<arrloop.length;index++ ){
        if(arrloop[index]%2==0){
            System.out.println(arrloop[index]);
        }
       }



    }
    
}
