import java.util.ArrayList;
public class ArrayListExample {
    public static void main(String[] args) {
        // import ArrayList form java util
        ArrayList<String> fruits = new ArrayList<>(); // []
        //Add/append
        fruits.add("Apple");// ["Apple"]
        fruits.add("Grapes");// ["Grapes"]
        fruits.add("Mango");// ["Mango"]
        //ArrayList can be directly printed
        System.out.println(fruits);
        //Access
        System.out.println(fruits.get(0)); // fruits[0]

        //update
        fruits.set(1,"Orange"); //fruits[1]="Orange"
        //["Apple","Orange","Mango"]

        // Delete
        fruits.remove(0); // remove at 0 and shifts the rest 
        //["orange","Mango"]
        System.out.println(fruits.get(0));

        //Array list size/length
        System.out.println("Fruit size"+fruits.size());

        //Task
        // index = 0
        // index <fruits.size()
        // loop the fruits and print "Eating"+fruitname

        for(int index=0; index<fruits.size(); index++){ //index iterate
            System.out.println("Eating"+fruits.get(index));
        }

        //for each loop (element iterate)
        for(String element:fruits){
            System.out.println("Eating" + element);
        }
        //["Orange","Mango"] -> for each loops each elem/data inside this array
        //the first loop will get the element"Orange"
        // the second will get he element "Mango"

        // task
        // make as arraylist called grades and add the following
        // 'A','B','z','c','D','E','G'
        // to make arraylist , ArrayList<Character> grades;
        // edit the small c to Capital C
        // edit the G to 'F'
        // print the 'E' grades
        // loop the grades and find the index of'F'
        // Note: the datatype for ArrayList
        // Integer-> int, Double->double ,Float->float,Boolean->boolean

        ArrayList<Character> grades= new ArrayList<>();
        grades.add('A');
        grades.add('B');
        grades.add('z');
        grades.add('c');
        grades.add('D');
        grades.add('E');
        grades.add('G');

        //edit

        grades.set(3,'C');
        grades.set(6,'F');
        // loop

        System.out.println("grade E:"+ grades.get(5));



        for(Character ele:grades){
            System.out.println(ele);
        }

        for(int index=0; index<grades.size(); index++){ 
            if(grades.get(index)=='F'){
                System.out.println("The index of 'F' is: " + index);
                break; 
            }
          
        }
    }
    
}
