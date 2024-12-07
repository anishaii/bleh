//class made above or below another class scope(global)

class StudentExample {
    // class is just a representation on what a student does
    // logical component / doesnot make memory
    //1. Attributes/ properties/data memory/feilds
    // what defines a class ,what defines a student

    String name; 
    int age;
    char gender;
    String grades;

    //2.functions/method/behaviours/procedures
    //what a class does, what a student does
    void study(){
        System.out.println(name+"is studying");
    }

}



class Dog {
   

    String name; 
    String breed; 
    int age;
    String color;
    

    
    void bark(){
        System.out.println(name+"is barking");
    }

    void eat(){
        System.out.println(name+""+breed+"is eating");
    }

  
}

public class ClassObject {
    public static void main(String[] args) {
        //object/ acutual entity of a class
        StudentExample student1 = new StudentExample();
        //object is a physical component/takes memory
        student1.name="Anisha";
        student1.age=20;
        student1.gender='F';
        student1.grades="A";
        //Assign should match the datatype of properties
        System.out.println(student1.name);
        student1.study();

        //create a variable student2

        StudentExample student2 = new StudentExample();
        student2.name="Sarika";
        student2.age=20;
        student2.gender='F';
        student2.grades="A";
        System.out.println(student2.name);
        student2.study();


        Dog dog1 = new Dog();
        dog1.name="abc";
        dog1.breed="Husky";
        dog1.age=3;
        dog1.color="White";
        
      
        dog1.bark();
        dog1.eat();
        
    }



    
}
    


    



