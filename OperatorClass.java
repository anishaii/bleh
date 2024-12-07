// public class OperatorClass {
//     public static void main(String[] args) { 
//         //Arthimetic Operator
//         //+,-,*,/,%
//         int intVar1 = 10;
//         int intVar2 = 20;
//         int addOper = intVar1 + intVar2;   // 10+20
//         int minusOper = intVar1 - intVar2; // 10-20
//         int mulOper = intVar1 * intVar2;  // 10*20
//         int divOper = intVar1 / intVar2;  // 10/20
//         int modOper = intVar1 %  intVar2; // 10/20 (remainder)

//         // Assignment Operator
//         int assignVar = 10;
//         assignVar += 20; // 10+20 -> 30
//         assignVar -= 15; // 30-15 ->15
//         assignVar *=2; // 15*2 -> 30
//         assignVar /= 10; // 30/10 -> 3
//         assignVar %=2; // 3%2 -> 1

//         //unary operator
//         int unaryVar = 20;
//         unaryVar ++; // unaryVar +=1; 20+1; 21
//         unaryVar --; // unaryVar -=1; 21-1; 20

//         // relational operator
//         int relVar1 = 20, relVar2 = 30;
//         boolean equalOper = relVar1 == relVar2; // 20==30? false
//         boolean greaterOper = relVar1 > relVar2; // 20>30? false
//         boolean lessEqualOper = relVar2 <= 30; // 20<30? true
//         boolean notEqual = 20 !=10; // true

//         // logical operator
//         int logvar1 =10, logvar2 =20, logvar3= 23;
//         boolean andOper = true && true;
//         boolean andOperVar = (logvar1<logvar2) &&(logvar3 == logvar1); // true && false
//         boolean orOper = false|| false|| true;
//         boolean orOperVar = (logvar1< logvar2) || (logvar3 == logvar2);
//         boolean notOper = !(logvar1<logvar2); // !true -> false

//         //Ternary operator
//         /*
//          * string status;
//          * int marking =40;
//          * if (marking > 40){
//          * status = "pass";
//          *}else{
//         status "fail";
//          }
//          */

//          int marking = 40;
//          String status =(marking > 40) ? "pass": "fail";
//          System.out.println("status:"+status);

//          /*
//           * task
//           add the following variable
//           oopMarking -> int
//           architectureMarking -> int
//           databaseMarkinng -> int
//           creativethinkingMarking->int
//           make a float avg and calculate the avg of the markings 
//           make a boolean expression to check if 
//           all the marking is greater of equal to 40
//           and check if the avg is greater than 50
//           make a result -> string and check the boolean 
//           if true set result as "good job " else set result as "Bad Job" 
//           */

//           int oopMarking = 40;
//           int architectureMarkingMarking = 45;
//           int databaseMarkinng= 30;
//           int creativethinkingMarking =50;
//           float avg = (float) (oopMarking+architectureMarkingMarking+databaseMarkinng+creativethinkingMarking)/4;
//           boolean check = oopMarking >=40 && databaseMarkinng >= 40 
//           && architectureMarkingMarking >=40 && creativethinkingMarking >= 40 && avg >=50;
//           String result = check? "Good Job": "Bad Job";
//           System.out.println(result);
        


//     }
    
// }
