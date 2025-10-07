//import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        System.out.println("Welcome to java!");

//        System.out.println("call a method using static and Non-static");
//        StaticPractice.A();// calling using main class directly using a method name because it is static 'or' we can also call using class name.method name
//        StaticPractice obj = new StaticPractice();// creating an object for method b using main class because it is non-static
//        obj.B();// calling a method b using the object obj and the method name
//        obj.C();
//
//        System.out.println("control statements");
//        ControlStatement.Statement();
//
//
//        System.out.println("Functions");
//        Scanner Number = new Scanner(System.in);
//        System.out.print("Enter a number: ");
//        int num1 = Number.nextInt();
//        System.out.print("Enter another number: ");
//        int num2 =Number.nextInt();
//        int sum = Functions.add(num1, num2);
//        System.out.println("The sum of "+num1 +" and "+num2 +" is "+sum +".");
//
//
//        System.out.println("Date and time");
//        CurrentDateTime.date();
//
//       System.out.println("Data structures");
//       DataStructures.ArrayExample();
//       DataStructures.ArrayListExample();
//       DataStructures.LinkedList1();
//       DataStructures.stack();
//       DataStructures.hashmap();
//       DataStructures.hashset();
//       DataStructures.treeset();
//       DataStructures.treemap();
 //      DataStructures t= new DataStructures();
 //      t.tree();
 //      Generics.gen();
//       stream.filter();
//       stream obj= new stream();
 //         obj.filterusinghash();
 //         stream.map();
       // stream.mapusinghash();
        Dog d = new Dog("Tommy");
        d.speak(); // Output: Tommy barks
       Bird.parrot();
    }


}


