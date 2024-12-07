public class EscapeSequence {
    public static void main(String[] args) {
        // tab space(/t) = it inserts tab space
         String str = "Sta\trk";
         System.out.println(str);

         // newline(\n)= it inserts new line
         String str1 = "Lanister send their \n regards";
         System.out.println(str1);

         // it inserts backslash (\\)
         String str2 = "Ravenclaw\\Hufflepuff";
         System.out.println(str2);
        
         // it prints single quote
         
    

         String str3 = "Targareyns are 'dragon lord' from old valaria";
         System.out.println(str3);

         String str4 = "Targareyns are \'dragon lord' from old valaria";
         System.out.println(str4);


         String str5 = "Targareyns have \"silver hair\"  ";
         System.out.println(str5);


         
              int age=17;
              if(age>=18){
                System.out.println("you are elligible to vote:"+age);
              }else{
                System.out.println("you are not elligible to vote:"+age);
              }
          
            
    }


    
}
