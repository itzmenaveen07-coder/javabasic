//import java.util.Scanner;

import org.w3c.dom.css.Counter;

import java.io.IOException;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args) throws IOException {
        System.out.println("Welcome to java!");

   System.out.println("call a method using static and Non-static");
   StaticPractice.A();// calling using main class directly using a method name because it is static 'or' we can also call using class name.method name
   StaticPractice obj = new StaticPractice();// creating an object for method b using main class because it is non-static
   obj.B();// calling a method b using the object obj and the method name
   obj.C();
   ControlStatement.Statement();
   Scanner Number = new Scanner(System.in);
   System.out.print("Enter a number: ");
   int num1 = Number.nextInt();
   System.out.print("Enter another number: ");
   int num2 =Number.nextInt();
   System.out.println("The sum of "+num1 +" and "+num2 +" is "+".");
   System.out.println("Date and time");
   CurrentDateTime.date();
   System.out.println("Data structures");
   DataStructures.ArrayListExample();
   DataStructures.LinkedList1();
   DataStructures.hashmap();
   DataStructures.treemap();
   DataStructures t= new DataStructures();
   t.tree();
   Employee.streamEmployee();
   TwoSumNumber.Sums();
   TwoSumNumber.Anagram();
   Strings.Returnnonrepeated();
   Strings.Reversewithbuilder();
   Strings.Reversewithoutstringbuilder();
   Strings.palindrome();
   Strings.palindrome1();
   Strings.CountVowelsAndConsonants();
   Strings.Removespaces();
   Strings.stringToInteger();
   Strings.countVowelsAndConsonants();
   Strings.parantheses();
   Functions.charc();
   second.test();
   second.tests();
   zoho.questions();
   FilesExample.createFile();
   DatabaseConnection db = DatabaseConnection.getInstance();
   db.connect();
   db.connected();

    }
}


