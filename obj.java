//task
//create c clas called dog
//add attributes name, breed ,age ,color
//add functions bark() that prints dog's namae  is barking
// add function eat() that prints dogs name and breed eating
// make 2 object in main and run the bark and eat function

class Dog {
   

    String name; 
    String breed; 
    int age;
    String color;
    

    
    void bark(){
        System.out.println(name+"is barking");
    }

    void eat(){
        System.out.println(name+" "+breed+ "is eating");
    }
}

class bestfriends{
    String name;
    int age;
    String address;

    void help(){
        System.out.println(name+"is very helpful.");
    }

    
    void funny(){
        System.out.println(name+" "+"is funny.she is"+" "+age+" "+"years old.");
    }

}

    


public class obj {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        dog1.name="abc";
        dog1.breed="Husky";
        dog1.age=3;
        dog1.color="White";
        
      
        dog1.bark();
        dog1.eat();

        bestfriends frd = new bestfriends();
        frd.name="Manisha";
        frd.age=20;

        frd.help();
        frd.funny();

       
    }
    
}
